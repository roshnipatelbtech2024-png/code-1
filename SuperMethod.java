class A {
    void show() {
        System.out.println("Parent");
    }
}

class B extends A {
    void show() {
        super.show();
        System.out.println("Child");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        new B().show();
    }
}

