import java.util.Scanner;
public class Q3 {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        for (int i = 1 ;i<=num ; i++){
            int fac = num * i;
            System.out.println(fac);
        }
    }
    
}
