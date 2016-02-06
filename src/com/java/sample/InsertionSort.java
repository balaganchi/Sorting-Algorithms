package com.java.sample;

public class InsertionSort {
	/*FUNCTION - SORTS THE LIST USING INSERTION SORT
	 *THETA(n^2) IS THE WORST CASE SCENARIO 
	 * */
	public static void insertionSort(int[] prm){
		
		for(int i=1;i<prm.length;i++){
			int key = prm[i];
			int j;
			for(j = i-1; j >= 0 && key < prm[j]; j--){
				prm[j+1] = prm[j];
				prm[j] = key;
			}
		}
		
		Main.printsort(prm);	
		
	}
}
