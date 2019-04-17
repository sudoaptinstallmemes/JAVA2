import java.util.Random;
public class TwoDimensionalActivity {

    public static void main(String[] args)
    {
        TwoDimensionalActivity start = new TwoDimensionalActivity();
        int array [][] = new int[4][20];
        start.generate(array);
        start.set(array);
        start.print(array);
        start.number(array);
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
    }

    public int [][] set(int array [][]) //Set every array element of a given row to a specified value.
    {
        for(int col = 0; col != 20; col++)
        {
            array[0][col] = 61;
        }
        return array;
    }

    public int min(int array[][])
    {
        int arrayMin = 81;
        for(int x = 0; x!=20; x++)if(array[1][x]<arrayMin)arrayMin=array[1][x];
        return arrayMin;
    }

    public int number(int array[][]) //Count the number of elements of the array having a specified value.
    {
        int amount = 0;
        for(int row = 0; row!=4; row++)
        {
            for(int col = 0; col!=20; col++)
            {
                if(array[row][col] == 61)
                {
                    amount++;
                }
            }
        }
        System.out.println(amount);
        return amount;
    }
}
