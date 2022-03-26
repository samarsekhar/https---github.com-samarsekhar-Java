// Java program to demonstrate the Method
// Overloading without super KeyWord

class Pack {
    // Method m1 with 0 parameter.
    public void m1() {
        System.out.println("No parameter method");
    }

    // Method m1 with 1 integer parameter.
    public void m1(int i) {
        System.out.println("Int Parameter");
    }

    // Method m1 with 1 string parameter.
    public void m1(String s) {
        System.out.println("String Parameter");
    }
}

// Main class

class Main {
    public static void main(String[] args) {
        // Creating object for Pack Class.
        // a is object of Pack class.
        Pack a = new Pack();
        // Here, m1 called with string parameter.
        // m1(String s ) method will be called
        a.m1("M");
    }
}