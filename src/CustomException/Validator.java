package CustomException;

public class Validator {

    public static void gradeValidator(int grade) throws InvalidGradeException {

        if (grade < 0 ) {

            throw new InvalidGradeException("Invalid grade, grade must be greater than zero");
        }

        if (grade > 100) {

            throw new InvalidGradeException("Invalid grade : grade cannot exceed 100");
        }

        System.out.println("Grade: " + grade);
    }
}
