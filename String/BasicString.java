package String;

public class BasicString {
//memory management
/* create pool in heap
   if different reference have same value then it refers to same object
*/

    public static void main(String[] args) {
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
