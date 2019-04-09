import java.util.ArrayList;
import java.util.Scanner;

/*
Amon Guinan
April 2019
Program creates horse objects
with names and location indexes
Prints them upon completion.
 */
public class horseBarn {


    public ArrayList<horseBarn> list = new ArrayList<>();
    public String horseName;
    public int space;


    public static void main(String[] args) {
        horseBarn barn = new horseBarn();
        barn.prompt();
    }


    public void Horse(String horseName, int space) {
        setHorseName(horseName);
        setSpace(space);
}



public void prompt(){
    do {
        Scanner input = new Scanner(System.in);
        horseBarn barn = new horseBarn();
        System.out.println("Enter Horse Name:");
        System.out.println("Enter STOP to stop.");
        horseName = input.nextLine();
        for(int i = 0; i < list.size()-1; i++)
        {

        }
        if(horseName.toLowerCase().equals("stop"))
        {
            System.out.println(list.get(0).getHorseName());
            System.out.println((list.get(0).getSpace()));
            return;
        }
        System.out.println();
        System.out.println("Enter Horse Space #");
        System.out.println("(Any integer above 0):");
        space = input.nextInt();
        if(space < 0)
        {
            System.err.println("Unacceptable space value.");
            barn.prompt();
        }
//        list.add(0, Horse(getHorseName(),Horse(getSpace())));
        list.add(new horseBarn());
        System.out.println((list.get(0)).getHorseName());
    }
    while(1 != 0);
}
    public String getHorseName()
    {
        return horseName;
    }

    public int getSpace()
    {
        return space;
    }

    public void setHorseName(String newHorseName)
    {
        horseName = newHorseName;

    }

    public void setSpace(int newSpace)
    {
        if (newSpace >= 0)
        {
            space = newSpace;
        }
    }

}