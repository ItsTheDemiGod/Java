import java.util.Scanner;
public class Q8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // while(n!=n){
            String str = Integer.toString(n); // Interger.toastring(n) converts the integer n to a string representation of that integer.
            String rev = new StringBuilder(str).reverse().toString();
            System.out.println(rev);

        // }
        // System.out.println(rev);
    }
    
}
