package com.streaminapp.corejava.threading;

import java.util.Scanner;

public class ThreadingTest {

	
	public static void main(String[] args) throws InterruptedException {
		int[] ar=new int[100];
		int max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element for array or -1 to get max element or -2 to terminate");
		int ch=0;
		int index=-1;
		while(ch!=-2) {
			ch=sc.nextInt();
			if(ch!=-2) {
				if(ch!=-1) {
					index++;
					if(ch>=max) {
						max=ch;
						ar[index]=2*max-ch;
					}
					else {
						ar[index]=ch;
					}
				}
				else {
					System.out.println(max);
				}
			}
			
		}
		
	}
}
