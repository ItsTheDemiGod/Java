// 1. Accept a number from the user. If it is positive, print "Positive Number". 
import java.util.Scanner;
class Q1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        if (num>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("negative number");
        }
    }
}