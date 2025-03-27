import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Salary: $%.2f%n", salary);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int employeeCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < employeeCount; i++) {
            System.out.println("\nEnter details for employee #" + (i + 1));
            
            System.out.print("ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Salary: ");
            double salary = Double.parseDouble(scanner.nextLine());

            employees.add(new Employee(id, name, salary));
        }

        System.out.println("\nEmployee Management System");
        System.out.println("==========================");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        scanner.close();
    }
}