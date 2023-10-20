
//34. Find First and Last Position of Element in Sorted Array

package BinarySearch;

import java.util.Arrays;

public class firstAndLast {
    public static void main(String[] args) {
        int[] nums = { 5,7,7,8,8,10};
        System.out.println(Arrays.toString(  searchRange(nums,8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int [2];
        arr[0] = searchFirst(nums,target);
        arr[1] = searchLast (nums,target);
        return arr;

    }
    public  static int searchFirst( int[] nums , int target){
        int i = 0;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid =  start + ( end - start ) /2;
            if(nums[mid] < target){
                start = mid + 1;
            }
            else if (nums[mid] > target){
                end = mid - 1;
            }
            else {
                if(nums[mid]==nums[mid-1]){
                    end = mid-1;
                }
                else{
                    return mid ;
                }

            }
        }
        return -1;
    }
    public static int searchLast(int[] nums, int target){
        int i = 0;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid =  start + ( end - start )/2 ;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }
            else {
                if(nums[mid]==nums[mid+1]){
                    start = mid + 1;
                }
                else{
                    return mid ;
                }

            }
        }
        return -1;
    }
}
