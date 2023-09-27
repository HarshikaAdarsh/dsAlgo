package Array;
import java.util.*;
import java.util.Map.Entry;
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] a={3 ,4 ,12, 3, 12, 3, 4, 4, 12, 7, 11, 6, 5};
        ArrayList<Integer> ans = duplicates(a,a.length);
        for (Integer val : ans) System.out.print(val + " ");
        System.out.println();

    }
    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        int i=0;
        int j=0;
        boolean check;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                check = true;
                if(i==j){
                    continue;
                }
                if(arr[i]==arr[j]){
                    for(int k :list){
                        if(k==arr[i]){
                            check= false;
                            break;
                        }
                    }
                    if(check){
                        list.add(arr[i]);
                    }
                }
            }

        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;

    }



}
