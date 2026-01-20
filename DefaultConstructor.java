class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Roshni";
        age = 19;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
    }
}

