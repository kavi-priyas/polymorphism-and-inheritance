package inheritanceexample2;


class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: $" + salary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: $" + bonus);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class inherritance2 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 75000, 5000);
        Developer developer = new Developer("Bob", 60000, "Java");

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
    }
}
