import java.io.*;
import java.util.*;
public class FileReader {
    //    throws IOException{
//        System.err.println("Yucky");
//    }
    public static void main(String[] args) throws FileNotFoundException {
        FileReader go = new FileReader();
        go.Correct();
    }

    public void Correct()
            throws FileNotFoundException {
            Scanner reader = new Scanner(new File("/Users/amonguinan/IdeaProjects/JAVA2/FileReading/src/words"));
            System.out.println(reader.nextLine());

        }
    }



