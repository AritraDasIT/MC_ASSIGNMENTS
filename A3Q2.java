/* Consider a class "Enmployee". The class Employee" has the following attributes: (i) name
and (ii) age. It should be possible to print the name of an employee object.
Consider another class "Manager" which is a specialization of the class "Employee". Each
manager object contains a list of employees that the manager supervises. Printing a manager object involves printing his/her name, age and the details of the employees that he/she is
managing. Each employee object must also have a reference to his/her manager. An employee may be queried about his/her manager. Implement the classes "Employee" and
"Manager" in JAVA.   */






import java.util.ArrayList;
import java.util.List;

class Employee {
    protected String name;
    protected int age;
    protected Manager manager;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.manager = null; // initially no manager
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void printDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        if (manager != null) {
            System.out.println("Manager: " + manager.name);
        } else {
            System.out.println("Manager: None");
        }
    }
}

class Manager extends Employee {
    private List<Employee> team;

    public Manager(String name, int age) {
        super(name, age);
        this.team = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        team.add(emp);
        emp.setManager(this);
    }

    public void printDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Managing Employees:");
        for (Employee e : team) {
            System.out.println(" - " + e.name + ", Age: " + e.age);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Alice", 40);
        Employee e1 = new Employee("Bob", 25);
        Employee e2 = new Employee("Charlie", 30);

        m1.addEmployee(e1);
        m1.addEmployee(e2);

        System.out.println("Manager Details:");
        m1.printDetails();

        System.out.println("\nEmployee Details:");
        e1.printDetails();
        System.out.println();
        e2.printDetails();
    }
}
