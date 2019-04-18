/*
Amon Guinan
April 2019
Code generates two dimensional arrays, then reads them in specified ways.
 */

import java.util.Random;
public class TwoDimensionalActivity {

    public static void main(String[] args)
    {
        TwoDimensionalActivity start = new TwoDimensionalActivity();
        int array [][] = new int[4][20];

        start.generate(array);// Fill the array with numbers between 50 and 80.
        start.set(array);//Set every array element of a given row to a specified value.
        start.print(array);//Print the Array.
        start.min(array);//Find the smallest column in a given row.
        start.number(array);//Count the number of elements of the array having a specified value.

    }
    public int [][] generate(int array [][]) // Fill the array with numbers between 50 and 80.
    {
        Random rand = new Random();
        for(int row = 0; row!=4; row++)
        {
            for(int col = 0; col!=20; col++)
            {
                array[row][col] = rand.nextInt(30)+50;
            }
        }
        return array;
    }

    public void print(int array[][]) //Print the Array.
    {
        for(int row = 0;row!=4; row++)
        {
            System.out.print("Row "+(row+1)+": ");
            for(int col = 0; col!=20; col++)
            {
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int [][] set(int array [][]) //Set every array element of a given row to a specified value.
    {
        for(int col = 0; col != 20; col++)
        {
            array[0][col] = 61;
        }
        return array;
    }

    public int min(int array[][])//Find the smallest column in a given row.
    {
        int arrayMin = 81;
        int givenRow = 1; //Specified Row.
        for(int col = 0; col!=20; col++)if(array[givenRow][col]<arrayMin)arrayMin=array[givenRow][col];
        System.out.println("Smallest Column: "+arrayMin);
        return arrayMin;
    }

    public int number(int array[][])//Count the number of elements of the array having a specified value.
    {
        int amount = 0;
        int setVal = 61; //Specified Value.
        for(int row = 0; row!=4; row++)
        {
            for(int col = 0; col!=20; col++)
            {
                if(array[row][col] == setVal)
                {
                    amount++;
                }
            }
        }
        System.out.println("Number of "+setVal+" values: "+amount);
        return amount;
    }
}
