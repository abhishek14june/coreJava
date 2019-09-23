package com.streaminapp.corejava.sorting;

public class MergeSort {
	/*
	 * Merge sort is divide and conquer sorting algorithm.
	 *  It is efficient, comparison based sorting algorithm.
		It works on below principle:	
		Divide list into sub list of about half size in each iteration until
		each sublist has only one element.
		Merge each sublist repeatedly to create sorted list.
		It will run until we have only 1 sorted list. This will be the sorted list.
		
		best case
	 * 
	 * */
	int[] array;
	MergeSort(int[] array){
		this.array=array;
	}
	
}
