package Arrays;

public class maximumItem {
    public static void main(String[] args) {
        int[] arr = {1,8,4,2,5,9,4,1,2,3};
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++ ){
             if(arr[i] > max){
                 max = arr[i];
             }else{
                 continue;
             }
        }
        System.out.println(max);

    }
}
