/* There are many format specifiers we can use. Here are some common ones:

        %c - Character
        %d - Decimal number (base 10)
        %e - Exponential floating-point number
        %f - Floating-point number
        %i - Integer (base 10)
        %o - Octal number (base 8)
        %s - String
        %u - Unsigned decimal (integer) number
        %x - Hexadecimal number (base 16)
        %t - Date/time
        %n - Newline  */

package String;

public class Pretty_Printing {
    public static void main(String[] args) {
        float a= 453.4423483f;
        System.out.printf("the number is %.2f",a);
        System.out .println(Math.PI);
        System.out.printf("Pie : %.3f",Math.PI);
        System.out.printf("Hello my name is %s and %s","Alex", "Ben");
    }
}
