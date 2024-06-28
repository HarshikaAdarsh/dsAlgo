package Binary_Linear_Search.Questions;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {11, 12, 15, 18, 2, 5, 6, 8};
        int N = arr.length-1;
        int ans = Search(arr, N);
        System.out.println(ans);



    }
    static int Search(int[] arr, int N){
        // find min
        int start = 0;
        int end = N ;

        while (start <= end){
            int mid = start + (end - start) /2 ;
            int prev = (mid + N - 1 ) % N;
            int next = (mid + 1) % N;

            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                return mid;
            }
            //sorted or not

            else if(arr[start] <= arr[mid] ){
                start = mid + 1;
            }
            else if( arr[end] <= arr[mid]){
                 end = mid - 1 ;
             }

        }




        // return
        return -1;
    }

}
