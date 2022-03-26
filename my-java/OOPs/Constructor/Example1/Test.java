// Java program to illustrate constructor overloading 
// Using same task (Addition operation) for different
// Type of arguments.

class Pack1 {
    // Constructor with one argument
    Pack1(String name) {
        System.out.println("Constructor with one" + "argument - String : " + name);
    }

    // Constructor with two arguments
    Pack1(String name, int age) {
        System.out.println("Constructor with two arguments : " + "String and Interger : " + name + " " + age);
    }

    // Constructor with one argument but with different
    // type than previous
    Pack1(long id) {
        System.out.println("Constructor with one argument : " + "Long" + id);
    }
}

class Pack2 {
    public static void main(String[] args) {
        // Creating the objects of the class named "Pack1"
        // by passing different arguments

        // Invoke the constructor with one argument of
        // type "String".

        Pack1 a1 = new Pack1("Samir");
        // Invoke the constructor with two arguments
        Pack1 a2 = new Pack1("Sekhar", 26);
        // Invoke the constructor with one argument of
        // type "Long".
        Pack1 a3 = new Pack1(325614568);
    }
}