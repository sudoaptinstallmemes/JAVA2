import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Array {
    ArrayList<Integer> TBS = new ArrayList<>();
//    int x = 0;

    public static void main(String[] args) {

        Array sort = new Array();

        sort.listGen();
        sort.insertionSort();

    }

    public void listGen() {
        Random random = new Random();
        int x = 0;
        while (x != 11) {
            TBS.add(random.nextInt(10));
            x++;
        }
        System.out.println(TBS);
    }

    public ArrayList<Integer> listWrite() {
        Scanner input = new Scanner(System.in);
        int x = 0;
        while (x != 10) {
            x++;
            System.out.println("Input #" + x + ":");
            TBS.add(input.nextInt());
        }

        return listWrite();
    }

    public void insertionSort () {
        int x=0;
        int temp;
        for (int i = 0; i < 10; i++) {
            while (x != TBS.size() - 1) {
                if (TBS.get(x) > TBS.get(x + 1)) {
                    temp = TBS.get(x + 1);
                    TBS.set(x + 1, TBS.get(x));
                    TBS.set(x, temp);
                    System.out.println();
                    System.out.println(TBS);
                }
                x++;
            }
            x = 0;
        }
        System.out.println("Done!");
        System.out.println(TBS);
    }
}

//    public double [] getCellBills()
//    {
//        double [] temp = new double [cellBills.length];
//
//        for ( int i = 0; i < cellBills.length; i++) temp [i] = cellBills[i];
//        return temp;
//    }
//}
