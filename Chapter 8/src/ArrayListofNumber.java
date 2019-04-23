import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
Amon Guinan
April 2019
Program follows specifications:

Write a program that reads a file full of numbers and
displays all the numbers as a list, then:
–Prints the average of the numbers.

–Prints the highest and lowest number.

–Filters out all of the even numbers (ones divisible by 2).
 */
public class ArrayListofNumber {
    public static void main(String [] args)throws FileNotFoundException, NoSuchElementException
    {
        File file = new File("/Users/amonguinan/IdeaProjects/JAVA2/FileReading/src/words"); //FILE PATH for number file.

        ArrayListofNumber start = new ArrayListofNumber();

        System.out.println("LENGTH: "+file.length());
        System.out.println("START");
        start.genList(file);
        start.printList(start.genList(file));
        start.AVG(start.genList(file));
        start.minMax(start.genList(file));
        start.even(start.genList(file));

    }
    public ArrayList genList(File file) throws NoSuchElementException, FileNotFoundException
    {
        ArrayList <String> numList = new ArrayList<>();
        Scanner reader = new Scanner(file);
        reader.useDelimiter(" ");

        for(int i = 0; i!=(file.length()+1)/2; i++)
        {
            String num = reader.next();
            numList.add(num);
        }
        reader.close();
        return numList;
    }

    public void printList(ArrayList numList) //displays all the numbers as a list
    {
        for(int i = 0; i!=numList.size()-1; i++)
        {
            System.out.println((i+1)+": "+numList.get(i));
        }
    }

    public void AVG(ArrayList numList) //Prints the average of the numbers.
    {
        int avg = 0;
        int num = 0;
        int temp;
        for(int i=0; i!=(numList.size()-1); i++)
        {
            temp = Integer.parseInt(numList.get(i).toString());
            avg = avg + temp;
            num++;
        }
        avg = avg/num;
        System.out.println("The average of the numbers is: "+avg+".");
    }
    public void minMax(ArrayList numList)//Filters out all of the even numbers (ones divisible by 2).
    {
        int min = 99999;
        int max = (0-99999);
        int temp;

        for(int i=0; i!=(numList.size()-1); i++)
        {
            temp = Integer.parseInt(numList.get(i).toString());
            if(min>temp)min = temp;
            if(max<temp)max = temp;
        }
        System.out.println("Lowest Number is "+min+".");
        System.out.println("Largest Number is "+max+".");
    }
    public void even(ArrayList numList)
    {
        int temp;
        System.out.print("Numbers ");
        for(int i=0; i!=(numList.size()-1); i++)
        {
            temp = Integer.parseInt(numList.get(i).toString());
            if(temp%2 == 0)
            {
                System.out.print(temp);
                System.out.print(",");
            }
        }
        System.out.print(" are even.");
    }

}
