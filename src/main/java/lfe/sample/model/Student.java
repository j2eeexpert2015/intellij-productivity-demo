package lfe.sample.model;

public class Student extends Person
{
    private String rollNumber ;
    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
