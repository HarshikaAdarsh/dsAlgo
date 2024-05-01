package String.Questions;

public class sortString {
    public static void main(String[] args) {
        String sentence = "anmt";
        int [] arr = new int[26];
        for( int i = 0 ; i< sentence.length() ; i++){
            arr[sentence.charAt(i) - 'a'] = 1;
        }
        for( int i = 0 ; i < 26 ; i++ ){
            if(arr[i] == 0){
                System.out.println(false);
            }
            else{
                System.out.println(true);
            }
        }

    }
}
