package String.Questions;

public class reverseString {
    public static void main(String[] args) {
        String str = "AlexJohnson";
        System.out.println(ReverseString(str));

    }
    public static char[] ReverseString(String str){
        char[] ch = new char[str.length()];
        for(int i =0; i<str.length(); i++){
            ch[i] = str.charAt(i);
        }

        int start = 0;
        int end = str.length()-1;
        while(start < end){

            char temp = ch[start];
            ch[start]= ch[end];
            ch[end] = temp;
            start++; end --;
        }
        return ch;
    }

}
/*

for(int i=0;i<photo.length(); i++) {

 if( boy == blind && looks == shit ){
     print (" he is the boy ")
 }
 else{
    print ("she did it herself for popularity")
 }
 */



























