//Page 769, 24
import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.*;
public class TwentyFour {
    public static void main(String [] args) throws Exception
    {
        TwentyFour start = new TwentyFour();
//        start.twentyfour();
//        start.twentyfive();
//        start.twentysix();
//        start.twentyseven();//WIP
//        start.twentyeight();
//        start.twentynine();
        start.thirty();

    }
    
    static void twentyfour()
    {
        String s;
        int n = 0;
        try
        {
            Scanner file = new Scanner(new File("/Users/amonguinan/IdeaProjects/JAVA2/Chapter 11/src/data"));
            while(file.hasNext())
            {
                s = file.nextLine();
                try{Integer.parseInt(s);}
                catch (NumberFormatException e)
                {
                    System.err.println("not a number : "+s);
                    n = 1;
                }
                if(n != 1)
                {
                    System.out.println(s);
                }
                n=0;
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    static void twentyfive()
    {
        Scanner parse = new Scanner("A-B-C-D");
        parse.useDelimiter("-"); //This line is redundant.
        String s = parse.nextLine();
        System.out.print(s.substring(s.indexOf("C"),(s.indexOf("C")+1)));
    }
    static void twentysix()
    {
        try
        {
            Scanner file = new Scanner(new File("/Users/amonguinan/IdeaProjects/JAVA2/Chapter 11/src/data"));
            for(int i = 0; i!=2; i++)
            {
                System.out.println(file.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            System.err.print("Fail");
        }
    }
//    static void twentyseven()
//    {
//        try
//        {
//            Stream<String> dataStream = Files.lines(Paths.get("/Users/amonguinan/IdeaProjects/JAVA2/Chapter 11/src/data"));
//            //your code goes here
//
//            dataStream = dataStream.filter();
//        }
//        catch(InvalidPathException ipe)
//        {
//            System.out.println(ipe.getMessage());
//        }
//        catch(IOException ioe)
//        {
//            System.out.println(ioe.getMessage());
//        }
//        catch(SecurityException se)
//        {
//            System.out.println(se.getMessage());
//        }
//    }
    static void twentyeight()
    {
        try
        {
            Scanner file = new Scanner(new File("/Users/amonguinan/IdeaProjects/JAVA2/Chapter 11/src/data"));

            String result = "";

            while(file.hasNextLine())
            {
                result = result + file.nextLine() + " ";
            }
            System.out.print(result);
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    static void twentynine()
    {
        try
        {
            Scanner file = new Scanner(new File("/Users/amonguinan/IdeaProjects/JAVA2/Chapter 11/src/data"));

            String result = "";

            while(file.hasNextLine())
            {
                result = file.nextLine();
                if(result.substring(0,2).equals("Sp"))
                {
                 System.out.println(result);
                }
            }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    static void thirty()
    {
     int [] grades = {98,76,82,90,100,75};
     try
     {
         FileWriter fw = new FileWriter("/Users/amonguinan/IdeaProjects/JAVA2/Chapter 11/src/grades", false);
         for(int i = 0; i != grades.length; i++)
         {
             fw.append((char)grades[i]);
         }
     }
     catch(IOException ioe)
     {}
    }
}
