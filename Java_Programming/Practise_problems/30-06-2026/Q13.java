// Q13. Accept marks and attendance percentage. Using nested if, print "Eligible for Exam" 
// only if marks >= 35 AND attendance >= 75. 
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        int att = sc.nextInt();
        if (marks >= 35 && att>=75){
            System.out.println("Eligible for Exam");
        }
        else{
            System.out.println("not Eligible");
        }
    }
    
}
