// 2. Accept a year from the user. If it is divisible by 4, print "Possibly a Leap Year".
import java.util.Scanner;
public class Q2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
