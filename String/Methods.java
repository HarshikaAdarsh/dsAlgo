package String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Alex" ;
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('x'));
        System.out.println("   Alex johnson   ".strip());
        System.out.println(Arrays.toString(name.split("")));
        System.out.println(name.trim());
    }
}
