package CustomException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            try {
                System.out.print("Enter your grade: ");
                int grade = sc.nextInt();

                Validator.gradeValidator(grade);
                break;

            } catch (InputMismatchException | InvalidGradeException e) {

                System.out.println("Exception caught : " + e.getMessage());
                sc.nextLine();
            }
        }
    }
}
