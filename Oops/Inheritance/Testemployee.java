public class Testemployee {
    public static void main(String[] args) {
        employee emp = new employee(
                "Lakshmi Tejaswini",
                500000,
                2026,
                "NI12345"
        );
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Name      : " + emp.getName());
        System.out.println("Salary    : " + emp.getAnnualSalary());
        System.out.println("Year      : " + emp.getYearStarted());
        System.out.println("NI Number : " + emp.getNationalInsuranceNumber());
    }
}