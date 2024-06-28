package Binary_Linear_Search.Questions;

public class ReverseOrderBS {
    public static void main(String[] args) {
        int[] arr = {20, 18, 15, 13, 11, 10, 8, 7, 6, 5, 3, 1};
        int target = 1;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0 ;
        int end = arr.length -1 ;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                end = mid -1;
            }
            if(target < arr[mid]){
                start = mid+1;
            }
            else if(target == arr[mid]){
                return mid;
            }

        }

        return -1 ;
    }
}
