package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> employees;

    Employee() {
        this.employees = new ArrayList<>();
    }

    Employee(final List<String> employees) {
        this.employees = employees;
    }

    public void loadEmployees() {
        this.employees.add("Anuj");
        this.employees.add("Gaurav");
        this.employees.add("Mayank");
        this.employees.add("Pawan");
    }

    public List<String> getEmployees() {
        return this.employees;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        final List<String> temp = new ArrayList<>();
        for (final String employee : this.getEmployees()) {
            temp.add(employee);
        }
        return new Employee(temp);
    }

}
