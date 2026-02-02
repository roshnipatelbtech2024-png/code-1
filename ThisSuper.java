class A {
    int x = 10;
}

class B extends A {
    int x = 20;

    void show() {
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        new B().show();
    }
}

