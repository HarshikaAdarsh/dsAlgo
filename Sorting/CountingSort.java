package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr= {9,5,5,4,0,9,5,1,8,0,5,9,1,2};
        countSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void countSort(int[]arr){
        int i=0;
        int j=0;
        int k=0;
        int max = 0;
        for(i=0;i<arr.length;i++){
            max = Math.max(arr[i], max);
        }
        int[] countArray = new int[max+1];
        for(i=0;i<arr.length;i++){
            countArray[arr[i]]++;
        }
        for(i=0;i<countArray.length;i++){
            for(j=0;j<countArray[i];j++){
                arr[k]=i;
                k++;
            }
        }
    }

}
