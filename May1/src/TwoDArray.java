import java.lang.reflect.Array;
import java.util.ArrayList;

public class TwoDArray {

//    boolean list [][] = {{true,false,true},{false,true,false},{true,false,true},{false,true,false}};

    public static ArrayList<ArrayList<Boolean>> makeGrid(int rows, int cols)
    {

        ArrayList<ArrayList<Boolean>> array = new ArrayList<>();
        int coin = 0;
        for(int row = 0; row!=rows; row++)
        {
            for(int col = 0; col!=cols; col++)
            {
                if(coin%2!=0)
                {
                array.get(row).add(false);
                }
                else
                {
                array.get(row).add(true);
                }
                coin++;
            }
            coin++;
        }
//        boolean [][] list = {{array.get(0).toArray()},{array.get(1).toArray()},{array.get(2).toArray()},{array.get(3).toArray()}};
        return array;
    }
    public static void main(String[] args) {

        TwoDArray start = new TwoDArray();
        ArrayList<ArrayList<Boolean>> list = start.makeGrid(3,4);

        for(int i = 0; i< list.size(); i++)
        {
            for(int x = 0; x<list.get(i).size();x++)
            {
                System.out.print(list.get(i).get(x)+"\t");
            }
            System.out.println();
        }
    }
    }
