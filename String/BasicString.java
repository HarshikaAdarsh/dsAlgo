package String;
import java.util.Scanner;

public class BasicString {
//memory management
/* create pool in heap
   if different reference have same value then it refers to same object
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      // this wil only give us a single word next()
      //  String s = scanner.next();
        String s = scanner.nextLine();
        // this will give the whole line till it finishes
        System.out.println(s);
        System.out.println(s.length());

        // if you want to use double quotes within the string
//        String sentence = "Alex is a "very" good boy"; // we cannot use it like this so
        // we will use escape character
        String sentence = "Alex is a \"very\" good boy";
        //escape char = it says whatever is written next to \ do not read it just write is as it is
        System.out.println(sentence);
        String a = "harshika";
        String b = "harshika";
        System.out.println(a==b);

        String c = new String("harshika");
        String d = new String("harshika");
        System.out.println(c==d);

        //using equals to method
        // In equal method it compare values not whether they are pointing to it or not
        System.out.println(c.equals(d));

        // CharAt() = for index number
        System.out.println(c.charAt(0) );
    }
}
