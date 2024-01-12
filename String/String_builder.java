// String Builder is Mutable as we make changes in the new object or string
package String;

public class String_builder {
    public static void main(String[] args) {
     StringBuilder builder = new StringBuilder();
     for(int i =0 ; i < 26 ; i++){
         char ch = (char) ('a' + i);
         builder.append(ch);
     }
        System.out.println(builder);
        System.out.println(builder.toString());
    }
}
