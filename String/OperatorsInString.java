// In java we can not overload operator but its exception in case of JAva

package String;

import java.util.ArrayList;

public class OperatorsInString {
    public static void main(String[] args) {
        System.out.println('a'+'b'); //output => 195 // its adding their ASCII values

        System.out.println("a" + "b"); // output => ab // its just concatenating two strings

        System.out.println('a' + 3); // output => 100 //'a' has an ASCII value of 97 and 97 (ASCII value of 'a') + 3 = 100.

        System.out.println("a" + 1); // output => a1 //The string "a" is concatenated with the integer 1.
        // Since the integer is not a string, it gets implicitly converted to its string representation.
        // Therefore, the output will be the concatenation of the string "a" and the string representation of 1, resulting in: a1
        // How it do => integer will be converted to integer that will call toString.

        System.out.println("Kunal" + new ArrayList<>()); // output => kunal[] // this object will call toString

        System.out.println("Kunal" + new Integer(50)); //output => kunal56 // again this will call toString

        // System.out.println(new Integer(56) + new ArrayList<>());// This will give error
        // because
        // 1) In java "+" operator is only for primitves and string
        String ans = new Integer(56) + " " + new ArrayList<>();
        System.out.println(ans); // output => 56 [] //


         }


}
