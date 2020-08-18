package com.streaminapp.corejava;

public class Limit {

	public static void main(String[] args) {
		long t1,t2;
		long st=System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			String num=i+"";
			if(num.contains("3")) {
				System.out.println(num);
			}
		}
		long en=System.currentTimeMillis();
		
		
		t1=en-st;
		
		
		
		st=System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			int num=i;
			while(num>0) {
				int digit=num%10;
				if(digit==3) {
					System.out.println(i);
					break;
				}
				num=num/10;
			}
		}
		en=System.currentTimeMillis();
		
		t2=en-st;
		System.out.println("Time taken 1st "+t1);
		System.out.println("Time taken 2nd "+t2);
	}
}
