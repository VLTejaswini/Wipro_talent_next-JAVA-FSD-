import java.util.*;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public String toString() {
        return empId + " " + empName + " " + email + " " + gender + " " + salary;
    }
}

public class EmployeeVectorDemo {

    public static void main(String[] args) {

        Vector<Employee> vector = new Vector<>();

        vector.add(new Employee(101, "Rahul", "rahul@gmail.com", "Male", 45000));
        vector.add(new Employee(102, "Anitha", "anitha@gmail.com", "Female", 55000));
        vector.add(new Employee(103, "Ravi", "ravi@gmail.com", "Male", 50000));

        System.out.println("Using Iterator:");

        Iterator<Employee> itr = vector.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nUsing Enumeration:");

        Enumeration<Employee> en = vector.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}