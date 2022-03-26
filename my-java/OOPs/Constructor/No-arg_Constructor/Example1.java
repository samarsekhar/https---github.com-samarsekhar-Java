// Java Program to illustrate calling a
// no-argument constructor.

class Pack {
    int num;
    String name;

    // this would be invoked while an object
    // of that class is created.

    Pack() {
        System.out.println("Constructor called");
    }
}

class Pack1 {
    public static void main(String[] args) {
        // This would invoke default constructor.
        Pack a1 = new Pack();

        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(a1.name);
        System.out.println(a1.num);
    }
}