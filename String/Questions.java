package String;

public class Questions {
    public static void main(String[] args) {

     /* 1st method
        String word = "maam";
         word.toCharArray();
         for(int i=0;i< word.length();i++){
             for (int j=word.length() -1;j >= 0;j--){
                 if (word.charAt(i) == word.charAt(j) ){
                     i++;

                 }else{
                     System.out.println("Not palindrome");
                     return;
                 }
             }
         }
        System.out.println("palindrome");


      */


        // 2nd Method
         String str = "abcdcba";
        System.out.println(isPalindrome(str));

    }
    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for(int i =0; i<=str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1 -i);

            if (start!= end){
                return false;
            }

        }
        return true;
    }
}