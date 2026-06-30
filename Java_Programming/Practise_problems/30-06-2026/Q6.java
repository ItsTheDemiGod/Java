// Q6. Accept two numbers and print which one is greater (or if they are equal). 
import java.util.Scanner;
public class Q6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        if (num1!=num2){
        System.out.println(Math.max(num1,num2));
        }
        else{
            System.out.println("they are equal");
        }
    }
    
}
