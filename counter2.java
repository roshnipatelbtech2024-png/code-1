class Counter2 {
    int id;        // instance variable
    String name;   // instance variable

    public static void main(String[] args) {
        Counter2 s1 = new Counter2(); // ✅ correct type
        s1.id = 101;
        s1.name = "Alice";
        System.out.println(s1.id + " " + s1.name);
    }
}
