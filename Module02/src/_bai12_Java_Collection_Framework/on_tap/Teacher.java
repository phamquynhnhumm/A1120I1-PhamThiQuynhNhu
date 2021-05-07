package _bai12_Java_Collection_Framework.on_tap;

public class Teacher extends Person {
    private int salary;
    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
    public Teacher() {
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + super.getName()+ '\'' +
                ", age=" + super.getAge() +","+
                "salary=" + salary +
                '}';
    }
    @Override
    public void showInfo() {
        this.toString();
    }
}
