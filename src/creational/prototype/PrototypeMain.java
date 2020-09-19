package creational.prototype;

import java.util.List;

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        final Employee employee = new Employee();
        employee.loadEmployees();

        final Employee otherEmployee = (Employee) employee.clone();
        final List<String> otherEmployees = otherEmployee.getEmployees();
        otherEmployees.add("Sandy");

        final Employee anotherEmployee = (Employee) employee.clone();
        final List<String> anotherEmployees = anotherEmployee.getEmployees();
        anotherEmployees.remove("Mayank");

        System.out.println("Another Employees: " + anotherEmployees);
        System.out.println("Other Employees: " + otherEmployees);
        System.out.println("Employees: " + employee.getEmployees());
    }

}
