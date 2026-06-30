// Q11. Accept three numbers. Using nested if statements (no logical operators), find and 
// print the largest of the three
import java.util.Scanner;
public class Q11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b){
            if (a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else if (b>c){
            if (b>a){
                System.out.println(b);
            }
            else{
                System.out.println(a);
            }

        }
        else if (c>a){
            if(c>b){
            System.out.println(c);}
            else{
                System.out.println(b);
            }
        }
        else {
            System.out.println("error");
        }
        
    }
}
