package Arrays.Questions;

public class Movezero {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        for(int i = nums.length-1 ; i >= 0 ; i--){
            if(nums[i] == 0 ){
                int temp = nums[i];

                for(int j = i+1 ; j < nums.length ; j++){
                    nums[ j -1 ] = nums[j];
                }
                nums[nums.length -1 ] = temp ;
                i--;

            }
            else{
                continue;
            }
        }
        for(int i = 0 ; i< nums.length ; i++){
            System.out.println( nums[i]);
        }

    }
}
