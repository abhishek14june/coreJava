package com.streaminapp.corejava.threading.locking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

	private List<Integer> list1=new ArrayList<Integer>();
	private List<Integer> list2=new ArrayList<Integer>();
	
	private Object lock1=new Object();
	private Object lock2=new Object();
	
	private Random random=new Random();
	
	/* stage1 and stage2 represents two operations that operates on two different data items*/
	private void stage1() {
		synchronized (lock1) {
			try {
				//making the thread sleep for 1 milisecond so as to emulate the behaviour that this task takes some time running in actual environment
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));	
		}
	}
	
	private void stage2() {
		synchronized (lock2) {
			try {
				//making the thread sleep for 1 milisecond so as to emulate the behaviour that this task takes some time running in actual environment
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));	
		}
	}
	
	public  void process() {
		for(int i=1;i<=1000;i++) {
			stage1();
			stage2();
		}
	}
	public void main() {
		Thread t1=new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				process();
			}
		});
		
		
		Thread t2=new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				process();
			}
		});
		long st =System.currentTimeMillis();
		System.out.println("starting thread t1");
		t1.start();
		System.out.println("starting thread t2");
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("total execution time "+(System.currentTimeMillis()-st));
		System.out.println("list1 size :"+list1.size()+" list2 size : "+list2.size());
	}
}
