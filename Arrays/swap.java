package Arrays;
import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        SwapNumbers(arr,1,2);
        System.out.println(Arrays.toString(arr));
    }
    static void SwapNumbers(int[]arr ,int  index1 , int index2){
        int temp ;
        temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] = temp ;
    }
}
