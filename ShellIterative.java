/**
	A shell sort algorithm that uses iteration to
	sort an array from low numbers to high numbers.
	@author Drue Hidalgo
*/

import java.util.Random;

public class ShellIterative
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
		int hibbard = 3;
		for (int p = 0; p < hibbard; p++)
		{
			int numberOfComparisons = (array.length/hibbard) + 1;
			if ((((numberOfComparisons-1)*hibbard) + p) > array.length-1)
			{
				numberOfComparisons--;
			}
			
			for (int r = 1; r < numberOfComparisons; r++)
			{
				for (int w = r; w > 0; w--)
				{
					if (array[(w*hibbard)+p] < array[((w-1)*hibbard)+p])
					{
						int temp = array[((w-1)*hibbard)+p];
						array[((w-1)*hibbard)+p] = array[(w*hibbard)+p];
						array[(w*hibbard)+p] = temp;
					}
					else 
					{				
						break;
					}
				}
			}
		}
		

		for (int b = 1; b < array.length; b++)
		{
			for (int n = b; n > 0; n--)
			{
				if (array[n] < array[n-1])
				{
					int temp = array[n-1];
					array[n-1] = array[n];
					array[n] = temp;
				}
				else 
				{
					break;
				}
			}
		}
		for (int m = 0; m < array.length; m++)
		{
			System.out.print(array[m] + " ");
		}
	}
}