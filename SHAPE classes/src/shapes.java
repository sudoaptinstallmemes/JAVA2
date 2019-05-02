/*
Amon Guinan
April 2019
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

/*
Write shape classes with methods perimeter and area.
We'd like to be able to write client code that treats different kinds of shape objects in the same way, such as:
–Write a method that prints any shape's area and perimeter.

–Create an array of shapes that could hold a mixture of the various shape objects.

–Write a method that could return a rectangle, a circle, a triangle, or any other shape we've written.

EC: Make a Drawing Method to display many shapes on screen.



Rectangle (as defined by width w and height h):
  area  = w h

  perimeter  = 2w + 2h

–

Circle (as defined by radius r):
  area  = p r2

  perimeter  = 2 p r

–

Triangle (as defined by side lengths a, b, and c)
  area  = √(s (s - a) (s - b) (s - c))

     where s = ½ (a + b + c)

  perimeter  = a + b + c



–Write a method that prints any shape's area and perimeter.

–Create an array of shapes that could hold a mixture of the various shape objects.

–Write a method that could return a rectangle, a circle, a triangle, or any other shape we've written.
 */
public class shapes {

    private static ArrayList <shapes> shapeList = new ArrayList();
    private static Scanner input = new Scanner(System.in);
    private static int base;
    private static int height;
    private int area;
    private int peri;
    public static void main(String[] args) {
        shapes start = new shapes();
        int cont;
        do {
            start.prompt();
//            shapeList.add(start.getRectangle(base,height));
            System.out.println("More shapes? (yes/no)");
            String answr = input.nextLine().toLowerCase();
            if((answr.equals("yes"))||(answr.equals("y")))
            {
                cont = 1;
            }
            else
            {
                cont = 0;
            }
        }while(cont ==1);

        for(int i = 0; i!= shapeList.size(); i++)
        {
            System.out.println(shapeList.get(i));
        }
//        start.giveList();
    }
    private void Rectangle(){
    System.out.println("Input Base:");
    base = input.nextInt();
    System.out.println("Input Width:");
    height = input.nextInt();
    area = base * height;
    peri = (2*base)+(2*height);
    System.out.println("Area: "+area);
    System.out.println("Perimeter: "+peri);
//    shapeList.add(getRectangle(base, height));
//    shapes rectangle = new shapes();
//    shapeList.add(new shapes());
    }
//    private void Rectangle(int startBase, int startHeight){
//
//        setBase(startBase);
//        setHeight(startHeight);
//    }
//    private Object getRectangle(int base, int height)
//    {
//        return getRectangle(this.base, this.height);
//    }
//    private void setArea(int newarea){
//        area = newarea;
//    }
//    private void setBase(int newBase){
//        base = newBase;
//    }
//    private void setHeight(int newheight)
//    {
//        height = newheight;
//    }
//    private void setPeri(int newPeri){
//        peri = newPeri;
//    }
//    private int getArea(){
//        return area;
//    }
//    private int getPeri(){
//        return peri;
//    }
//    private int getHeight(){
//        return height;
//    }
//    private int getBase(){
//        return base;
//    }
    private void Circle() {
    System.out.println("Input Radius:");
    base = input.nextInt();
    double area = Math.PI*(base)*(base);
    double peri = Math.PI*(base)*2;
    System.out.println("Circle with radius "+base+" has area "+area+" and perimeter "+peri+".");
    }
    private void Triangle() {
    System.out.println("Input side A:");
    int a = input.nextInt();
    System.out.println("Input side B:");
    int b = input.nextInt();
    System.out.println("Input side C:");
    int c = input.nextInt();
    double s = 0.5*(a+b+c);
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    int perimeter = a+b+c;
    System.out.println("Triangle has area "+area+" and perimeter "+perimeter+".");
    }
    private void prompt(){
        System.out.println("Rectangle, Circle, or Triangle?");
        String choice = input.nextLine();
        choice = choice.toLowerCase();
        switch (choice){
            case("rectangle"):
                Rectangle();
                return;
            case("circle"):
                Circle();
                return;
            case("triangle"):
                Triangle();
                return;
                default:
                    System.err.println("Invalid choice.");
                    return;
        }
    }

    public ArrayList giveList(){
        ArrayList list = shapeList;
        return list;
    }
}
