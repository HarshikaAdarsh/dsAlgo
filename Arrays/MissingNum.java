package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNum {

    public static void main(String[] args) {

        int array[] = {3 , 2, 1, 5 , 4 ,6, 8};
        int n= array.length+1;
        int missNum = 0 ;
        int arraySum = 0;
        int TotalSum = 0;
        for(int i = 0 ; i < array.length  ; i++ ){
            arraySum = arraySum + array[i];

        }
        TotalSum = (n* (n+1))/2;

        missNum = TotalSum - arraySum ;
        System.out.println(missNum); ;
    }

}
