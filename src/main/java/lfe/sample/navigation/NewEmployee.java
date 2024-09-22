package lfe.sample.navigation;

public class NewEmployee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public NewEmployee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working in the " + department + " department.");
    }

    public void takeBreak() {
        System.out.println(name + " is taking a break.");
    }

    public void getSalaryDetails() {
        System.out.println(name + " earns " + salary + " annually.");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    /*
    Setter for newname
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

