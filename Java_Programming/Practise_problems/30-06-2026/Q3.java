// Q3. Accept marks. If marks are greater than or equal to 90, print "Excellent 
// Performance". 
import java.util.Scanner;
public class Q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks >=90){
            System.out.println("excellent performance");
        }
        else{
            System.out.println("Good");
        }
    }
}
