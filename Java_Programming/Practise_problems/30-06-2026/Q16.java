// Q16. Accept a character grade ('A', 'B', 'C', 'D', 'F') and use switch to print the remark 
// ("Excellent", "Good", "Average", "Below Average", "Fail"). 
import java.util.Scanner;
public class Q16 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                
                break;
        }
    }
    
}
