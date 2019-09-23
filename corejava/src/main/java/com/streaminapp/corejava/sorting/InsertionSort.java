package com.streaminapp.corejava.sorting;

public class InsertionSort {

	/**
	 * best case 0(n)
	 * worst case 0(n^2)
	 * average case 0(n^2)
	 * 
	 */
	int array[];
	InsertionSort(int [] array){
		this.array=array;
	}
	
	public static void main(String[] args) {
		int unsortedArray[]= {56,21,3,73,94,2,1,9};
		print(unsortedArray);
		int[] sortedArray=new InsertionSort(unsortedArray).sort();
		print(sortedArray);
	}
	private static void print(int[] sortedArray) {
		for(int i=0;i<sortedArray.length;i++) {
			System.out.print(sortedArray[i]+" ");
		}
		System.out.println();
		
	}

	public  int[] sort() {
		for(int i=1;i<array.length;i++) {
			int j;
			int valueToSort=array[i];
			
			for(j=i;j>0 && array[j-1]>valueToSort;j--) {
				array[j]=array[j-1];
			}
			array[j]=valueToSort;
		}
		return array; 
	}
}
