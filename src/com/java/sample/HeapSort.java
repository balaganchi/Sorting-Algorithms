package com.java.sample;

public class HeapSort {
	private static int N;
    /* Sort Function */
    public static void sort(int[] inputArr)
    {       
        heapify(inputArr);        
        for (int i = N; i > 0; i--)
        {
            swap(inputArr,0, i);
            N = N-1;
            maxheap(inputArr, 0);
        }
        
        Main.printsort(inputArr);
    }     
    /* Function to build a heap */   
    public static void heapify(int inputArr[])
    {
        N = inputArr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(inputArr, i);        
    }
    /* Function to swap largest element in heap */        
    public static void maxheap(int inputArr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && inputArr[left] > inputArr[i])
            max = left;
        if (right <= N && inputArr[right] > inputArr[max])        
            max = right;
 
        if (max != i)
        {
            swap(inputArr, i, max);
            maxheap(inputArr, max);
        }
    }    
    /* Function to swap two numbers in an inputArray */
    public static void swap(int inputArr[], int i, int j)
    {
        int tmp = inputArr[i];
        inputArr[i] = inputArr[j];
        inputArr[j] = tmp; 
    }    
}
