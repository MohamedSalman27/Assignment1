package entityclassassignment1.copy;

public class Student {
    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.printf("Roll No: %d | Name: %s | Age: %d%n",
                          rollNo, name, age);
    }
}
