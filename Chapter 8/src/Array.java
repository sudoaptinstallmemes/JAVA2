
/*
Amon Guinan
Sorting Methods Program
April 2019
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Array {
    ArrayList<Integer> TBS = new ArrayList<>();
//    int x = 0;

    public static void main(String[] args) {

        Array sort = new Array();

        sort.listGen();
//        sort.insertionSort(); //Close to working, needs some fixing.
        sort.bubbleSort(); //Only one that works 100% right now.
//        sort.mergeSort();  //Early stages
    }

    public void listGen() {
        Random random = new Random();
        int x = 0;
        while (x != 10) {
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

    public ArrayList<Integer> insertionSort () {
        ArrayList<Integer> correct = new ArrayList<>();
        int temp = 10;
        int i;
        for(int x = 0; x<10; x++) {
            for (i = 0; i < TBS.size()-1; i++) {

                if (temp > TBS.get(i)) {
                    temp = TBS.get(i);
//                    System.out.println(i+","+temp);
                }

            }
            TBS.remove(TBS.get(i-1));
            System.out.println();
            System.out.println("correct: "+correct);
            System.out.println("TBS: "+TBS);
            System.out.println();
            correct.add(temp);
            temp = 10;
        }
        TBS = correct;
        System.out.println();
        System.out.println(TBS);
        System.out.println();
        return(TBS);
    }

    public ArrayList<Integer> bubbleSort () {
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
        return(TBS);
    }

    public ArrayList<Integer> mergeSort () {
        int x = 0;
        int temp;
        for (int i = 0; i < 5; i++)
        {
            if(TBS.get(x) > TBS.get(x+1))
            {
                temp = TBS.get(x + 1);
                TBS.set(x + 1, TBS.get(x));
                TBS.set(x, temp);
                System.out.println();
                System.out.println(TBS);
            }
            x = x+2;
        }
        return(TBS);
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
