public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println("I'm studying hard for my grade " + grade + ".");
    }
}
Student student1 = new Student("John", 16, 11);
student1.speak();
student1.study();
}
