package Binary_Linear_Search.Questions;

import java.util.Arrays;

public class FirstandLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,10,10, 10, 10, 10, 10, 10, 10 };
        int target = 10;
        int res = -1;
        int res2 = -1;
        int[] result = new int[2];
        result[0] = FirstOccurrence(arr,target,res);
        result[1] = LastOccurrence(arr, target, res2);
        System.out.println(Arrays.toString(result));

    }
    static int FirstOccurrence(int[] arr, int target, int res){
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (target < arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            else if ( target == arr[mid]){
                res = mid;
                end = mid-1;
            }
        }
        return res;
    }
    static int LastOccurrence(int[] arr, int target , int res2){
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (target < arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            else if ( target == arr[mid]){
                res2 = mid;
                start = mid+1;
            }
        }
        return res2;
    }
}
