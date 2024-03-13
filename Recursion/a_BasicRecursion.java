package Recursion;

public class a_BasicRecursion {
    public static void main(String[] args) {
        PrintNumber(5);
        System.out.println("---------------------------------------------------------");
        PrintNumberUsingRecursion(5);
    }

    // Normal way
    static void PrintNumber(int n ){
       for(int i = 1 ; i <= n ; i++){
           System.out.println(i);
       }
    }

    // recursion way
    static int PrintNumberUsingRecursion(int n){
        if(n<0){
            return 0;
        }
        System.out.println(n);
        return PrintNumberUsingRecursion(n-1);

    }
}
