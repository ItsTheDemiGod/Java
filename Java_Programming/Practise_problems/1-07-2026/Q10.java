import java.util.Scanner;
public class Q10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n  =  sc.nextInt();
        int a = 0;
        int sum = 0;
        while(n>10){
            a = n%10;
            sum = sum+a;
            n=n/10;
        } 
        if(n<10){
            sum = sum+n;
        }
        System.out.println(sum);
    }
    
    
}
