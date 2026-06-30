// Q8. Accept a number. Print "Positive" if greater than 0, otherwise print "Non-Positive". 
import java.util.Scanner;
public class Q8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >0){
            System.out.println("positive number");
        }
        else {
            System.out.println("Non-Positive");
        }
    }
}
