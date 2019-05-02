import java.util.ArrayList;

public class Pixel {
    private int red;
    private int green;
    private int blue;

    public void Pixel(int myRed, int myGreen, int myBlue)
    {
        red = myRed;
        green = myGreen;
        blue = myBlue;
    }
    public String toString()
    {
        return "("+red+", "+green+", "+blue+")";
    }

}
class AlterImage
{
    public Pixel [][] generatePixelArray(int[][] reds, int[][] greens, int[][] blues)
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Pixel pixelArray[][] = new Pixel [][]{{}};
        for(int rows = 0; rows!=reds.length; rows++) {


            for (int cols = 0; cols != reds.length; cols++) {
                list.get(cols).add(reds[rows][cols]);
                list.get(cols).add(greens[rows][cols]);
                list.get(cols).add(blues[rows][cols]);
            }
        }
        return list.toArray();
    }


    public Pixel[][] flipImage(Pixel[][] image, boolean horiz)
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int rows = 0; rows!=image.length; rows++) {


            for (int cols = 0; cols != image.length; cols++) {
                list.get(cols).add(image[rows][cols]);
//                list.get(cols+1).add(image[rows][cols]);
//                list.get(cols+2).add(image[rows][cols]);



            }
        }

        if(horiz) {

            for (int cols = 0; cols != image.length; cols++) {
                for (int rows = 0; rows != image.length; rows++) {
                    list.get(rows).add(image[rows].length-cols);
                }
            }
        }
        return list.toArray();
    }
}

