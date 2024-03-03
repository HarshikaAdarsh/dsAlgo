package Binary_Linear_Search;

public class minCount {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,6};
        int [] nums2 = { 2,3,4,5};
        System.out.println(getMin(nums1,nums2));

    }
    public static int getMin ( int[] nums1, int[] nums2){
        for(int i =0; i< nums1.length ; i++){
            int target =  nums1[i];
            int start = 0;
            int end = nums2.length - 1;
            while(start<= end ){
                int mid = start + (end - start)/2;
                if (target> nums2[mid]){
                    start = mid+1 ;
                }
                else if (target < nums2[mid]){
                    end = mid - 1 ;
                }
                else if (target == nums2[mid]) {
                    return nums2[mid];
                }
                else{
                    continue;
                }
            }
        }
        return -1 ;
    }
}
