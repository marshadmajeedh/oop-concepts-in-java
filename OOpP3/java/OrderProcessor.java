import exception.InsufficientQuantity;
import exception.QuantityNotNumeric;
import exception.QuantityOutOfRange;
import validator.Validator;

import java.util.Scanner;

public class OrderProcessor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter your order quantity : ");
                int quantity1 = sc.nextInt();
                Validator.validateQuantity(quantity1);
                break;

            } catch (InsufficientQuantity e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter your order quantity : ");
                int quantity2 = sc.nextInt();
                Validator.validateQuantityRange(quantity2);
                break;

            } catch (QuantityOutOfRange e) {
                System.out.println(e.getMessage());
            }
        }

        sc.nextLine();
        while (true) {
            try {
                System.out.println("Enter your order quantity : ");
                String quantity3 = sc.nextLine();
                Validator.validateInput(quantity3);
                break;

            } catch (QuantityNotNumeric e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
