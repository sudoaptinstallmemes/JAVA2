import java.util.ArrayList;
import java.util.Scanner;

public class horseBarnV2 {


    public String horseName;
    public int space;


    public static void main(String[] args) {
        //Occupied stalls.
        ArrayList<horseBarnV2> occupiedlist = new ArrayList<>();

        //Empty Stalls.
        ArrayList<horseBarnV2> emptylist = new ArrayList<>();

        //All Stalls.
        ArrayList<horseBarnV2> alllist = new ArrayList<>();

        //Build each stall.
        horseBarnV2 space1 = new horseBarnV2();
        horseBarnV2 space2 = new horseBarnV2();
        horseBarnV2 space3 = new horseBarnV2();
        horseBarnV2 space4 = new horseBarnV2();
        horseBarnV2 space5 = new horseBarnV2();

        //Fill each stall.
        space1.Horse("HORSE1",0);
        space2.Horse("",1);
        space3.Horse("HORSE2",2);
        space4.Horse("",3);
        space5.Horse("HORSE3",4);


        alllist.add(space1);
        alllist.add(space2);
        alllist.add(space3);
        alllist.add(space4);
        alllist.add(space5);


        for(int i = 0; i!=(alllist.size()-1); i++) {
//            System.out.println("Stall " + alllist.get(i).getSpace() + " is occupied by " + alllist.get(i).getHorseName() + ".");
        if(alllist.get(i).getHorseName().equals(""))
        {
//            emptylist
        }
        }

    }


    public void Horse(String horseName, int space) {
        setHorseName(horseName);
        setSpace(space);
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

