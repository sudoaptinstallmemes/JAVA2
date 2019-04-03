import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import java.util.Scanner;
import java.util.ArrayList;

public class GRAPH {
    private int sX;
    private int sY;
    private double scale;
    private Integer height;
    int temp;
    ArrayList<Integer> tempList = new ArrayList<Integer>();
    String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    /*
    default constructor
    sX = sY = 0;
    scales is set to 1
     */
    public GRAPH()
    {
        scale = 1;
    }

    public GRAPH(int sX, int sY, double scale, Integer height, String month)
    {
        setCoordinates(sX,sY);
        setScale(scale);
        setHeight(height);

//        setColor(color);
        setTemp(height/10);
    }
    public GRAPH setCoordinates( int sX, int sY)
    {
        this.sX = sX;
        this.sY = sY;
        return this;
    }
    public GRAPH setScale( double scale)
    {
        this.scale = ( scale > 0 ? scale : this.scale);
        return this;

    }

    public GRAPH setHeight(int height )
    {
        this.height = height;
        return this;
    }
//    public GRAPH setMonth(String month)
//    {
//        this.month = month;
//        return this;
//    }
    public GRAPH setTemp(int temp) {
        temp = temp;
        return this;
    }
    public ArrayList<Integer> prompt() {
        int x = 0;
        Scanner input = new Scanner(System.in);
//        ArrayList<String> tempList = new ArrayList<String>();
        do{
            System.out.println("Input temperature for "+month[x]+".");
            tempList.add(input.nextInt());
            x=x+1;
        }
        while(x!= 12);
        System.out.print(tempList);
        return(tempList);
    }



    public void draw( GraphicsContext gc, int x)
    {
//        if(tempList.get(x)<40)
//        {
//            gc.setFill(Color.BLUE);
//        }
//        else{
//            gc.setFill(Color.BLACK);
//        }
        gc.setFill(Color.BLACK);
        System.out.println();
        System.out.println(tempList.get(1));
        gc.fillRect(sX+100, 700-(height/2), 50, height/2);
        gc.fillText(month+". "+height/10, sX+100, 700-(height/2)-100);
//        gc.fillRect(sX+100, height, 50, height/2);

    }

}
