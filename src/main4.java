import java.util.ArrayList;


public class main4 {
    public static void main(String[] args) {
        Engineer0 engineer = new Engineer0("John", 1, 3000, "Software");

    }
}


abstract class Employee0 {

    String name;
    int id;
    int salary;

    public Employee0(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }



    public  void getDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Salary: "+salary);
    }
}

class Manager0 extends Employee0 {

    String department;


    public Manager0(String name, int id, int salary, String department) {
        super(name, id, salary);
        this.department = department;
    }


    public void getDetails(){
        super.getDetails();
        System.out.println("Department: "+department);
    }
}

class Engineer0 extends Employee0 {

    String specialty;

    public Engineer0(String name, int id, int salary,String specialty) {
        super(name, id, salary);
        this.specialty = specialty;
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("Specialty: "+specialty);
    }

}

class Company {
    private ArrayList<Employee0> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee0 employee) {
        System.out.println("Employee added: " + employee.name);
        employees.add(employee);
    }

    public void removeEmployee(Employee0 employee) {
        System.out.println("Employee removed: " + employee.name);
        employees.remove(employee);
    }

    public void removeEmployee(int id) {
        for (Employee0 employee : employees) {
            if (employee.id == id) {
                System.out.println("Employee removed: " + employee.name);
                employees.remove(employee);
            }
        }
        System.out.println("Employee not found with id " + id);
    }

    public void remove_allEmployees() {
        System.out.println("All employees removed:");
        employees.clear();
    }


    public void displayAllEmployees() {
        System.out.println("Displaying all employees:");
        for (Employee0 employee : employees) {
            employee.getDetails();
        }
    }



}