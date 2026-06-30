// Q4. Accept a person's age. If age is greater than or equal to 60, print "Senior Citizen".
import java.util.Scanner;
public class Q4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >=60){
            System.out.println("Senior Citizen");

        }
        else{
            System.out.println("not a senior Citizen");
        }
        
    }
    
}
