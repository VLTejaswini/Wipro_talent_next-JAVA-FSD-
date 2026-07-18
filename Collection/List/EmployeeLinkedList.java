import java.util.LinkedList;

public class EmployeeLinkedList {

    public static void main(String[] args) {

        LinkedList<Employee> list = new LinkedList<>();

        list.add(new Employee(101,"Rahul",
                "rahul@gmail.com","Male",45000));

        list.add(new Employee(102,"Anitha",
                "anitha@gmail.com","Female",55000));

        for(Employee e : list)
            e.getEmployeeDetails();
    }
}