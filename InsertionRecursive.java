import java.util.Random;

/**
	A recursive implementation of the insertion sort algorithm.
	@author Drue Hidalgo
 */
public class InsertionRecursive
{
    public static void sort(int[] array, int number)
    {
        if (w == array.length - 1)
		{
			check(array, number);
		}
		else
		{
			check(array, number);
			
			number++;
			Sort(array, number);
		}
    }
    
    public static int[] check(int[] array, int x)
    {
        if (x == 0)
		{
			return array;
		}
		if (array[x] < array[x-1])
		{
			int temp = array[x-1];
			array[x-1] = array[x];
			array[x] = temp;
			x--;
			check(array, x);
		}
		return array;
    }
    
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 10;
        
        int[] sortArray = new int[ARRAY_SIZE];
        Random randomObj = new Random();
        for (int i = 0; i < sortArray.length; i++)
        {
            sortArray[i] = randomObj.nextInt(100);
			System.out.print(sortArray[i] + " ");
        }
        sort(sortArray, 1);
        System.out.println();
        for (int t = 0; t < array.length; t++)
		{
			System.out.print(array[t] + " ");
		}
    }
}