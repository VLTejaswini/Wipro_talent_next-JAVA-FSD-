import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> vector = new Vector<>();

        vector.add(new Employee(101,"Rahul",
                "rahul@gmail.com","Male",40000));

        vector.add(new Employee(102,"Anitha",
                "anitha@gmail.com","Female",65000));

        for(Employee e : vector)
            e.getEmployeeDetails();
    }
}