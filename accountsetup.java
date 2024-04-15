import java.util.*;
public class accountsetup{
    public static void main(String[]args){
        String username;
        String password;
        int length;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        username = input.next();
        System.out.print("Enter a password 8 characters long (Only one word): ");
        password = input.next();
        length = password.length();
        while(length<7){
            System.out.print("Enter a password 8 characters long: ");
            password = input.next();
            length = password.length();
        }
        password = password.toLowerCase();
        username = username.toLowerCase();
        System.out.println("Your username is "+username+" and your password is "+password+".");
    }
}