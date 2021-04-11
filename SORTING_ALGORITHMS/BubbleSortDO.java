package SORTING_ALGORITHMS;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortDO {

    // public variables
    public static int[] ARR;
    public static String aft_bef;

    public static void main(String[] args) {
        System.out.println("BUBBLE SORT");

        input_method();

        aft_bef = "BEFORE SORTING : ";
        output_method(aft_bef);

        processing_method(); // Bubble Sort

        aft_bef = "AFTER SORTING : ";
        output_method(aft_bef);
        }


    private static void input_method() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number of elements /N/ : ");
        int n = scan.nextInt();


        ARR = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Input [%d] element : ", i);
            ARR[i] = scan.nextInt();
        }
    }


    private static void processing_method() {
        boolean sorted = false;
        int limited = 0;

        do {
            sorted = false;
            for(int i = 0;i < ARR.length-1-limited; i++)
            {
                if(ARR[i] > ARR[i+1] )
                {
                    int temp1   = ARR[i + 1];
                    ARR[i+1]    = ARR[i];
                    ARR[i]      = temp1;
                    sorted      = true;
                }
            }
            limited++;
        }
        while(sorted);
    }


    private static void output_method(String aft_bef) {
        System.out.println(aft_bef);
        System.out.println(Arrays.toString(ARR));
    }





}// end of class
