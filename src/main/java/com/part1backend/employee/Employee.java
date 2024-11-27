package main.java.com.part1backend.employee;
import java.time.LocalDate;

import main.java.com.part1backend.mylist.GenericMyList;

public class Employee {
    private String id;
    private String name;
    private int age;
    private LocalDate dateOfJoining;

    //constructor
    public Employee(String id, String name, int age,LocalDate dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee {id='" + id + "', name='" + name + "', age=" + age + ", dateOfJoining=" + dateOfJoining + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id.equals(employee.id);
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    public static void main(String[] args) {
        // Example usage
        GenericMyList<Employee> employeeList = new GenericMyList<>();

        // Adding employees
        employeeList.add(new Employee("E1", "A", 25, LocalDate.of(2024, 11, 15)));
        employeeList.add(new Employee("E2", "B", 26, LocalDate.of(2024, 12, 10)));
        employeeList.add(new Employee("E3", "C", 27, LocalDate.of(2024,12 , 22)));

        // Printing the list
        employeeList.print();

        // Deleting by index
        employeeList.deleteByIndex(1);
        employeeList.print();

        // Deleting by value
        employeeList.deleteByValue(new Employee("E3", "C", 27, LocalDate.of(2024, 12, 22)));
        employeeList.print();
    }
}
    



