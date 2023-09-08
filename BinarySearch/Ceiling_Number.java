package BinarySearch;

public class Ceiling_Number {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,10,20};
        int target = 4;
        int ans= ceiling_Number(arr,target);
        System.out.println(ans);
    }
    public  static int ceiling_Number(int[] arr, int target ) {
        int start = 0;
        int end = arr.length - 1;
        int mid=0;

        while (start <= end) {
             mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                 start=mid+1;
            }
        }
        return arr[mid+1];

    }

}
