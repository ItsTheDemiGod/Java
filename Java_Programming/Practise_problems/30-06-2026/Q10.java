// Q10. Accept age and citizenship status (boolean). Using nested if, print "Eligible to Vote" 
// only if age >= 18 AND the person is a citizen. 
import java.util.Scanner;
public class Q10 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean is_citizen = sc.nextBoolean();
        if (age >=18 && is_citizen==true){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("not eligible");
            
        }

    }
    
}
