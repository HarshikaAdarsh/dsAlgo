package Arrays.Questions;

import java.util.ArrayList;

public class unionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4 ,5};
        int[] arr2 = {1 ,2 ,3};
        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> list = new ArrayList<>();
        if(n > m ){
            for(int i = 0 ; i < n ; i++ ){
                for(int j = 0 ; j < m ; j++){
                    if( arr1[i] == arr2[j] ){
                        list.add(arr1[i]);
                        j++; i++;
                    }
                    else if(arr1[i] != arr2[j]){
                        list.add(arr1[i]);
                        list.add(arr2[j]);
                        j++; i++;
                    }
                    else{
                        list.add(arr1[i]);
                        i++; j++;
                    }

                }
            }

        }
        else if(m > n ){
            for(int i = 0 ; i < n ; i++ ){
                for(int j = 0 ; j < m ; j++){
                    if( arr1[i] == arr2[j] ){
                        list.add(arr1[i]);
                        j++; i++;
                    }
                    else if(arr1[i] != arr2[j]) {
                        list.add(arr1[i]);
                        list.add(arr2[j]);
                        j++; i++;
                    }
                    else{
                        list.add(arr2[j]);
                        j++; i++;
                    }

                }
            }

        }
        if(n == m){
            for(int i = 0 ; i < n ; i++ ){
                for(int j = 0 ; j < m ; j++){
                    if( arr1[i] == arr2[j] ){
                        list.add(arr1[i]);
                        j++; i++;
                    }
                    else {
                        list.add(arr1[i]);
                        list.add(arr2[j]);
                        j++; i++;
                    }

                }
            }

        }
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
