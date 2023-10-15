package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,7,5,9,3,1,6,7,5,4};
        BubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSorting(int[] arr){
        int i=0;
        int j=0;
        int temp ;
        for(i=0;i<arr.length;i++){
            for(j=1;j < arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                   temp =  arr[j];
                   arr[j]= arr[j-1];
                   arr[j-1]= temp;
                }

            }
        }
    }
}
