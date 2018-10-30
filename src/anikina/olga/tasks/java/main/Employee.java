package anikina.olga.tasks.java.main;

public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private int salary;

    public Employee(int id, String firstName, String LastName, int salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    };

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary () {
        return salary * 12;
    }

    public  double raiseSalary (int percent) {
        return (salary * (100 + percent)) / 100;
    }

    @Override
    public String toString() {
        return " ID : " + id + " , last name : "
                + lastName + " , first name : " + firstName;
    }
}
