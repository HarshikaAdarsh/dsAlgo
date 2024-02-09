package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNum {

    public static void main(String[] args) {

        int array[] = {3 , 2, 1, 5};

        Arrays.sort(array);

        int missNum = 0 ;

        for (int i = 1 ; i <= array.length ; i++) {

            if (i == array[i-1] ) {
                continue;
            }
            else if (i != array[i-1]){
                missNum = i ;
                System.out.println(missNum);
                break ;
            }
        }
    }

}
