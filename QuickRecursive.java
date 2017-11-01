/**
	A quick sort algorithm that uses recursion to
	sort an array from low numbers to high numbers.
	@author Drue Hidalgo
*/

import java.util.Random;

public class QuickRecursive
{
	public static void main(String[] args)
	{
		int[] array = new int[10];
		
		Random randomObj = new Random();
		
		for (int q = 0; q < array.length; q++)
		{
			array[q] = randomObj.nextInt(1000);
			System.out.print(array[q] + " ");
		}
		
		System.out.println();
		
		quickSort(array, 0, array.length-1);
		
		for (int m = 0; m < array.length; m++)
		{
			System.out.print(array[m] + " ");
		}
	}
	
	public static void quickSort(int[] array, int leftPointer, int rightPointer)
	{
		if (leftPointer < rightPointer) 
		{
			int pivotPoint = sort(array, leftPointer, rightPointer); 
			quickSort(array, leftPointer, pivotPoint - 1); 
			quickSort(array, pivotPoint + 1, rightPointer); 
		}
	}
	
	public static int sort(int[] array, int leftPointer, int rightPointer) 
	{
		int pivot = array[rightPointer];
		int index = leftPointer - 1;
		
		index = swap(array, rightPointer, leftPointer, index, pivot); 
		
		array[rightPointer] = array[index + 1];
		array[index + 1] = pivot;
		
		return index + 1
	}
	
	public static int swap(int[] array, int rightPointer, int q, int index, int pivot)
	{
		if (array[q] <= pivot)
		{
			index++;
				
			int temp = array[index];
			array[index] = array[q];
			array[q] = temp;
		}
		
		q++;
		
		if (q != rightPointer) /
		{
			index = swap(array, rightPointer, q, index, pivot);
		}

		return index;
	}
}