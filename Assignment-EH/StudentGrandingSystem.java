class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

class NullNameException extends Exception {
    public NullNameException(String msg) {
        super(msg);
    }
}

public class StudentGrandingSystem {
    public static void main(String[] args) {

        String name = null;
        int marks = 105;

        try {

            if (name == null) {
                throw new NullNameException("Name cannot be null");
            }

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks must be between 0 and 100");
            }

            System.out.println("Student: " + name + " Marks: " + marks);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process Completed");
        }
    }
}