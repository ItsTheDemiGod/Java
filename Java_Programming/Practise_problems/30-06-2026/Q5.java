// 5. Accept a number and check whether it is even or odd using if-else. 
import java.util.Scanner;
public class Q5 {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
