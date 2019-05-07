/*
Amon Guinan
May 2019
Program reads and prints prices
and average of prices from the "prices" file.
 */
import java.io.File;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ReadFile {
    private static double x;
    private static int num;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String [] args) throws Exception
    {
        File file = new File("/Users/amonguinan/IdeaProjects/JAVA2/Chapter 11/src/prices");
        Scanner fileScanner= new Scanner(file);

        while(fileScanner.hasNextLine())
        {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(" ");
            String product = lineScanner.next();
            x = 0;
            num = 0;
            while(lineScanner.hasNext())
            {
                x += Double.parseDouble(lineScanner.next());
                num++;
            }
            System.out.println(line);
            System.out.println("Average price is "+df2.format(x/num)+" dollars.");
            System.out.println();
        }

    }
}
