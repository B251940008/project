package lab10;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void info() {
        System.out.println("Нэр: " + name + ", Нас: " + age);
    }
}