public class multidimensional {
    public static void main(String[] args)
    {
        int array1 [][] = {{1,2,3},{4,5,6}};
        System.out.println(average(43,56,76,8));

        for(int i = 0; i< array1.length; i++)
        {
            for(int x = 0; x<array1[i].length;x++)
            {
                System.out.print(array1[i][x]+"\t");
            }
            System.out.println();
        }
    }

    public static int average(int...numbers)
    {
        int total = 0;
        for(int x:numbers) total += x;
        return total/numbers.length;
    }

}
