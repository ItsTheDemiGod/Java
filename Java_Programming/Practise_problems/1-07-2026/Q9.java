import java.util.Scanner;
public class Q9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            sum = n+sum;
            n = sc.nextInt();

        }
        System.out.println(sum);
    }
    
}
