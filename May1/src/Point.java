import java.util.Scanner;

public class Point {

    private int x;
    private int y;
    private int z;

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getZ()
    {
        return z;
    }

    public void setX(int new_x) {
        x = new_x;
    }

    public void setY(int new_y) {
        y = new_y;
    }

    public void setZ(int new_z) {
        z = new_z;
    }

    public Point (int start_x, int start_y, int start_z)
    {
        x = start_x;
        y = start_y;
        z = start_z;
    }
    public static void main(String[] args) {

        int start_x;
        int start_y;
        int start_z;

        Scanner input = new Scanner(System.in);
        System.out.println("Input x coordinate:");
        start_x = input.nextInt();
        System.out.println("Input y coordinate:");
        start_y = input.nextInt();
        System.out.println("Input z coordinate:");
        start_z = input.nextInt();
        Point start = new Point(start_x,start_y,start_z);
        System.out.println("Point is located at ("+start.getX()+","+start.getY()+","+start.getZ()+").");
    }
    }
