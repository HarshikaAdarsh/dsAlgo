package Binary_Linear_Search.Questions;


    public class Order_Agnostic_Binary_Search {
        public static void main(String[] args) {
            int[] arr={56,54,34,23,12,11,9,6,3,1};
            int target=1;
            int ans=orderAgnosticBs(arr,target);
            System.out.println(ans);
        }
        public static int orderAgnosticBs(int[] arr , int target){
            int start=0;
            int end= arr.length-1;

            //find whether the array is sorted in ascending or descending
            //for that we can use boolean check

//        boolean isAsc ;
//        if (arr[start]<arr[end]){
//            isAsc= true;
//        }
//        else {
//            isAsc = false;
//        }

            boolean isAsc = arr[start]<arr[end];

            while (start<=end){

                //find middle element
                int mid = start + (end-start)/2;

                if (target == arr[mid]) {
                    return mid;
                }

                // if it is ascending
                if (isAsc) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else if (target > arr[mid]) {
                        start = mid + 1;
                    }
                }

                //if it is dscending
                else{
                    if (target >arr[mid]) {
                        end = mid - 1;
                    } else if (target < arr[mid]) {
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }
    }


