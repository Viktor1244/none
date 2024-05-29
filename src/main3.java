import java.util.ArrayList;

public class main3 {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book harryPotter = new Book("Harry Potter", "JK Rowling", 500, 400);
        books.add(harryPotter);

        Library library = new Library();
        library.addbook(harryPotter);


        Bank_account account = new Bank_account(1000);

        account.addMoney(100);
        System.out.println(account.getBalance());
        account.removeMoney(100);
        System.out.println(account.getBalance());







    }

}

class Book {
    String name;
    String author;
    int price;
    int pages;


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }




    public Book(String name, String author, int price, int pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }
}


class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addbook(Book book) {
        this.books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public static int number_of_books(ArrayList<Book> books){
        return books.size();
    }


}



class Bank_account {
    private int balance;
    private boolean isBlocked;

    public Bank_account(int balance) {
        this.balance = balance;
        this.isBlocked = false;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void addMoney(int money) {
        if (!isBlocked) {
            this.balance += money;
        } else {
            System.out.println("Account is blocked, cannot add money.");
        }
    }

    public void removeMoney(int money) {
        if (!isBlocked && this.balance >= money) {
            this.balance -= money;
        } else {
            System.out.println("Account is blocked or has insufficient funds, cannot remove money.");
        }
    }

    public void money_transfer_between_accounts(Bank_account fromAccount, Bank_account toAccount, int amount) {
        fromAccount.removeMoney(amount);
        toAccount.addMoney(amount);
        System.out.println("Money transfer of $" + amount + " successful from account " + fromAccount.getBalance() + " to account " + toAccount.getBalance());
    }


    public void blockAccount() {
        this.isBlocked = true;
    System.out.println("Account has been blocked.");
}

    public void unblockAccount() {
        this.isBlocked = false;
        System.out.println("Account has been unblocked.");
}
}


class Bank {
    private ArrayList<Bank_account> accounts;

    public void setAccounts(ArrayList<Bank_account> accounts) {
        this.accounts = accounts;
    }

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public ArrayList<Bank_account> getAccounts() {
        return accounts;
    }

    public void addAccount(Bank_account account) {
        this.accounts.add(account);
    }

    public void blockAccount(Bank_account account) {
        if (this.accounts.contains(account)) {
            account.blockAccount();
            System.out.println("Account " + account.getBalance() + " has been blocked.");
        } else {
            System.out.println("Account not found in the bank.");
        }
    }

    public void unblockAccount(Bank_account account) {
        if (this.accounts.contains(account)) {
            account.unblockAccount();
            System.out.println("Account " + account.getBalance() + " has been unblocked.");
        } else {
            System.out.println("Account not found in the bank.");
        }
    }
}




abstract class Employee {
    String name;
    double salary;
    String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public abstract void displayInfo();
}


class Manager extends Employee {
    public Manager(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Department: " + department + ", Role: Manager");
    }
}

class Engineer extends Employee {
    public Engineer(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Department: " + department + ", Role: Engineer");
    }
}

// Personnel Management System
class PersonnelManagementSystem {
    private ArrayList<Employee> employees;

    public PersonnelManagementSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static double calculateAverageSalary(ArrayList<Employee> employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employees.size();
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}





