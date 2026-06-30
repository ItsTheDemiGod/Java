// Q14. Accept a username and password. Using nested if, check if username equals 
// "admin" first, then check if password equals "1234" inside it. Print "Login Successful" or 
// appropriate failure messages at each level. 
import java.util.Scanner;
public class Q14 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String pas = sc.nextLine();
        if (username =="admin" && pas == "1234"){
            System.out.println("Login Succesfull");

    }
    else if (username == "admin" && pas !="1234"){
        System.out.println("incorrect Password");
    }
    else if (username != "Admin"&& pas == "1234"){
        System.out.println("incorrect username");
    }
    else {
        System.out.println("username and password are incorrect");
    }
    
}
}
