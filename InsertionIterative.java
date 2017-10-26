import java.util.Random;

/**
	An iterative implementation of the insertion sort algorithm.
	@author Drue Hidalgo
 */
public class InsertionIterative
{
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 10;
        
        int[] sortArray = new int[ARRAY_SIZE];
        Random randomObj = new Random();
        for (int i=0; i < sortArray.length; i++)
        {
            sortArray[i] = randomObj.nextInt(100);
			System.out.print(sortArray[i] + " ");
        }
        System.out.println();
		for (int r = 1; r < array.length; r++)
		{
			for (int w = r; w > 0; w--)
			{
				if (array[w] < array[w-1])
				{
					int temp = array[w-1];
					array[w-1] = array[w];
					array[w] = temp;
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