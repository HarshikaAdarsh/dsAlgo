package Arrays.Questions;

import java.util.Arrays;

public class removeduplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = 1;
        int[] temp = new int[nums.length];
        if(nums.length == 0){
            k=0;
        }
        for(int i = 0 ; i < nums.length; i++){
            for(int j = 1 ; j< nums.length;j++){
                if(nums[i]== nums[j]){
                    temp[i] = nums[i];
                    nums[i] = nums[j];
                }
                else if (nums[i] != nums[j]){
                    k = k+1;
                    i++;
                    j++;
                }
            }
        }
        System.out.println("k is "+ k +" array is " + Arrays.toString(nums));
    }
}
