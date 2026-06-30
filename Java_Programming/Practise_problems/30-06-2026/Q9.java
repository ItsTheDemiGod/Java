// Q9. Accept the price of an item. If price is above ₹1000, print "Premium Product", 
// otherwise print "Standard Product".
import java.util.Scanner;
public class Q9 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float price = sc.nextFloat();
        if (price>1000){
            System.out.println("premium product");
        }
        else{
            System.out.println("Standard product");
        }

    }
}
