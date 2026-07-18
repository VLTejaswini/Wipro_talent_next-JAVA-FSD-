import java.io.*;
import java.util.Date;

public class EmployeeSerialization {
    public static void main(String[] args) {
        Employee emp = new Employee(
                "Rahul",
                new Date(),
                "IT",
                "Software Engineer",
                55000
        );
        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("data"));
            out.writeObject(emp);
            out.close();
            System.out.println("Employee object serialized successfully.");
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("data"));
            Employee e = (Employee) in.readObject();
            in.close();
            System.out.println("\nEmployee Details:");
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}