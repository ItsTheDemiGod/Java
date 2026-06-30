// Q12. A bank loan is approved only if income > 50000 AND credit score > 700. Use 
// nested if to check both conditions and print the result. 
import java.util.Scanner;
public class Q12 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double Credit_sc = sc.nextDouble();
        if (income>50000 &&Credit_sc>700){
            System.out.println("Approved");
        }
        else{
            System.out.println("Disapproved");
        }
    }
    
}
