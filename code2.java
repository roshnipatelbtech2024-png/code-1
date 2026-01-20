class Code2 {
    static int count = 0;

    // Constructor
    Code2() {
        count++;
        System.out.println("Object created. Current count: " + count);
    }

    public static void main(String[] args) {
        Code2 obj1 = new Code2();
        Code2 obj2 = new Code2();
        Code2 obj3 = new Code2();

        System.out.println("Final count: " + Code2.count);
    }
}

