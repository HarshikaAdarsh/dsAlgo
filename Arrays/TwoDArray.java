package Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //declaration of 2D array
        int [][] arr = new int[3][2];

        // Taking Input
        for (int row = 0; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = in.nextInt();
            }
        }

        // output
        for (int row = 0 ; row < arr.length ; row++){
            for(int col =0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
           System.out.println();
        }
    }
}
