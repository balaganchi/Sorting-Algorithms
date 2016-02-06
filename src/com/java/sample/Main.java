/**
 * 
 */
package com.java.sample;

import java.util.Scanner;

/**
 * @author Scofield
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = readNumberFromCommandLine();
		
		System.out.println("NUMBERS ENTERED TO SORT");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+"\t");
		}
		
		/*Call for Insertion Sorting
		 *Uncomment the below line to execute merge sort
		 * */
		//InsertionSort.insertionSort(num);	
		
		/*Call for Merge Sorting
		 *Uncomment the below line to execute merge sort
		 * */
		//MergeSort.sort(num);
		
		/*Call for Bubble Sorting
		 *Uncomment the below line to execute merge sort
		 * */
		//BubbleSort.sort(num);

		/*Call for Heap Sorting
		 *Uncomment the below line to execute merge sort
		 * */
		HeapSort.sort(num);
	}
	
	
	/*FUNCTION TO PRINT THE SORTED NUMBERS
	 * @Author - Sunil Kumar BT
	 * */
	public static void printsort(int[] prm){
		
		System.out.println("\nPRINT SORTED NUMBERS");
		for(int i=0;i<5;i++){
			System.out.print(prm[i]+"\t");
		}
		
	}
	
	/*FUNCTION TO READ INTEGERS FROM COMMAND LINE
	 *FROM STACKFLOW WEBSITE
	 */
	public static int[] readNumberFromCommandLine(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the count of numbers and press enter");
		int count = s.nextInt();
		s.nextLine();
		
		System.out.println("Please enter the numbers with spaces to separate and press enter");
		int[] numbers = new int[count];
		Scanner numScanner = new Scanner(s.nextLine());
		for(int i = 0; i < count; i++){
			if(numScanner.hasNextInt()){
				numbers[i] = numScanner.nextInt();
			}else{
				System.out.println("You didn't provide enough numbers");
				break;
			}
		}
		s.close();
		numScanner.close();
		return numbers;
	}

}
