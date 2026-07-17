import java.util.Scanner;

// User-defined exception for negative marks
class NegativeMarkException extends Exception {
    public NegativeMarkException(String msg) {
        super(msg);
    }
}

// User-defined exception for marks greater than 100
class InvalidMarkException extends Exception {
    public InvalidMarkException(String msg) {
        super(msg);
    }
}

public class StudentMarks {

    public static void validateMarks(int marks)
            throws NegativeMarkException, InvalidMarkException {

        if (marks < 0)
            throw new NegativeMarkException("Marks cannot be negative.");

        if (marks > 100)
            throw new InvalidMarkException("Marks should be between 0 and 100.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student " + i + " Name:");
                String name = sc.nextLine();

                int total = 0;

                for (int j = 1; j <= 3; j++) {

                    System.out.println("Enter Marks " + j + ":");

                    int mark = Integer.parseInt(sc.nextLine());

                    validateMarks(mark);

                    total += mark;
                }

                double average = total / 3.0;

                System.out.println("Student: " + name);
                System.out.println("Average = " + average);
                System.out.println();
            }

        }

        catch (NumberFormatException e) {
            System.out.println("Only integer values are allowed.");
        }

        catch (NegativeMarkException | InvalidMarkException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}