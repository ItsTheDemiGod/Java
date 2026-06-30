// Q7. Accept a person's age. Use if-else to print "Minor" or "Adult" (18+).
import java.util.Scanner;
public class Q7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18 && age <100){
            System.out.println("Adult");
        }
        else if (age < 18 && age >0){
            System.out.println("minor");
        }
        else {
            System.out.println("invalid age");
        }

        }
    }

