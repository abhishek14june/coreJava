package com.streaminapp.corejava.searching;

public class BinarySearch {
	int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
			71, 73, 79, 83, 89, 97};
	
	public static void main(String[] args) {
		BinarySearch bs=new BinarySearch();
		bs.search(17, 0, bs.primes.length-1);
		bs.search(20, 0, bs.primes.length-1);
	}
	void search(int searchTerm,int minIndex,int maxIndex) {
		int mid=(minIndex+maxIndex)/2;
		if(searchTerm==primes[mid])
		{
			System.out.println("element found");
			return;
		}
		if(maxIndex<=minIndex)
		{
		System.out.println("element not found");
		return;
		}

		if(searchTerm>primes[mid])
			search(searchTerm,mid+1,maxIndex);
		else
			search(searchTerm,minIndex,mid-1);
		
	}
}
