package StackQueue.StackQuestions;

import java.util.Arrays;

public class NearestGreatest {
    public static void main(String[] args) {
        int[] arr = {9,2,6,8,3,10};
        int[] Greatest = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] < arr[j]){
                    Greatest[i] = arr[j];

                }
                else if( arr[j] <= arr[i] && j >= arr.length ){
                    Greatest[i] = -1;
                }
                else{
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(Greatest));
    }


}
