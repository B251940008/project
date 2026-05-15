package lab10;

public class Student extends Person {

    private String school;

    public Student(String name, int age, String school) {
        super(name, age); 
        this.school = school;
    }

    public void display() {
        info(); 
        System.out.println("Сургууль: " + school);

    }
}