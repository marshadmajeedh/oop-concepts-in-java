import exception.InvalidPasswordLengthException;
import exception.InvalidUserNameException;
import validator.ValidatePassword;
import validator.ValidateUserName;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Welcome to the program where you get exceptions");

        while (true) {
             try {
                 System.out.println("Enter a username: ");
                 String userName = sc.nextLine();
                 ValidateUserName.validateUserName(userName);
                 break;
            } catch (InvalidUserNameException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
             System.out.println("Something went wrong");
            }
        }
        while (true) {
            try {
                System.out.println("Enter a password: ");
                String password = sc.nextLine();
                ValidatePassword.validatePassword(password);
                break;
            } catch (InvalidPasswordLengthException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
        }
    }
}
