import java.util.Random;

/**
	A shell sort algorithm that uses recursion to
	sort an array from low numbers to high numbers.
	@author Drue Hidalgo
*/

public class ShellRecursive
{
    public static void sort(int[] array, int first, int last, int pow)
    {
        if (pow > 0)
        {
            int space = (int)Math.pow(2, pow)-1;
            for (int start=first; start<first+space; start++)
            {
                spacedSort(array, start, last, space);
            }
            sort(array, first, last, pow - 1);
        }
        
    }
    
    public static void spacedSort(int[] array, int first, int last, int space)
    {
        int sub;
        int i;
        for (sub=first+space; sub<=last; sub+=space)
        {
            int value = array[sub];
            for (i=sub-space; i>=first && value<array[i]; i-=space)
            {
                array[i+space] = array[i];
            }
            array[i+space] = value;
        }
    }
    
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 10;
        
        int[] sortArray = new int[ARRAY_SIZE];
        Random rng = new Random();
        for (int i=0; i<sortArray.length; i++)
        {
            sortArray[i] = rng.nextInt(100);
        }
        
        for (int x : sortArray)
        {
            System.out.print(x + " ");
        }
        ShellRecursive.sort(sortArray, 0, ARRAY_SIZE-1, (int)(Math.log(sortArray.length)/Math.log(2)));
        System.out.println();
        for (int x : sortArray)
        {
            System.out.print(x + " ");
        }
    }
}