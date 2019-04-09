import java.util.ArrayList;
import java.util.Scanner;

public class horseBarn {
    public String horseName;
    public int space;
    public ArrayList<Object> horseManifest = new ArrayList<Object>();
    public static void main(String[] args) {

        horseBarn barn = new horseBarn();
        barn.prompt();

        System.out.println();




    }

    /* The spaces in the barn. Each array element holds a reference to the horse

     * that is currently occupying the space. A null value indicates an empty space.

     */



//    private Horse[ ] spaces;


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
        if(horseName.equals("STOP"))
        {
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
        horseManifest.add(barn.Horse(barn.getHorseName(),barn.getSpace()));

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

    /* Returns the index of the space that contains the horse with the specified

     *  name.

     * Precondition: No two horses in the barn have the same name.

     * @param name the name of the horse to find

     * @return the index of the space containing the horse with the specified

     *      name;

     *      -1 if no horse with the specified name is in the barn.

     */

