package String;

public class String_Performance {
    public static void main(String[] args) {
        String series = " ";
        for (int i=0; i< 26; i++){
            char ch = (char)('a' + i);
            series = series+ ch ;

        }
        System.out.println(series);
        // we can see here that it's copying the old object
        // and appending the new changes
        // and new object is created everytime as string immutability
        //this will have the complexity of O(N^2)
        //a,ab,abc.................xyz
        // which means 1+2+3+4+5.......n
        // N(N+1)/2 = ( N^2 + N )/2

    }
}
