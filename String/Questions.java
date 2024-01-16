package String;

public class Questions {
    public static void main(String[] args) {
        String word = "madam";
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
    }
}
