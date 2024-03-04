package Binary_Linear_Search;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {2,7,4,3,7,3,4,5};
        int ans = LinearSearching(arr,5);
        System.out.println(ans);
    }
    public static  int LinearSearching(int[] arr, int target) {
 // test case1 //
       if (arr.length == 0){
           return -1 ;
       }

 // main code //
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] == target){
               return i;
           }
        }
  // test case2 if element do not found//
        return -1;
    }
}
