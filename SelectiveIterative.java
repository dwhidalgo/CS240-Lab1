import java.util.Random;

/**
    An iterative implementation of the selective sort algorithm.
    @author Drue Hidalgo
 */
public class SelectiveIterative
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
        for (int i=0; i < sortArray.length-1; i++)
        {
            int lowestIndex = i;
            for (int j=i; j< sortArray.length; j++)
            {
                if (sortArray[j] < sortArray[lowestIndex])
                {
                    lowestIndex = j;
                }
            }
            int lowestVal = sortArray[lowestIndex];
            sortArray[lowestIndex] = sortArray[i];
            sortArray[i] = lowestVal;
        }
        System.out.println();
        for (int x : sortArray)
        {
            System.out.print(x + " ");
        }
    }
}