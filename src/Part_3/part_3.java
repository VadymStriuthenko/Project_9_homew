package Part_3;

// 3.1-3.2. Class with static variable and static methods
class MyStaticClass {
    // 3.1. Static variable, shared by all objects of the class
    public static int staticVar = 0;

    // 3.2. Static method
    public static void staticMethod() {
        System.out.println("Static method called, staticVar = " + staticVar);
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Non-static method called");
    }

    // 3.2. Access to the static method inside a static method
    public static void callStaticFromStatic() {
        staticMethod();
        // Error: non-static method cannot be called from a static context
        // nonStaticMethod();
    }

    // 3.2. Access to the static method inside a non-static method
    public void callStaticFromNonStatic() {
        staticMethod();
    }
}

public class part_3 {
    public static void main(String[] args) {
        // 3.1 Access to the static variable using the class name
        MyStaticClass.staticVar = 5;
        System.out.println("Task 3.1: staticVar = " + MyStaticClass.staticVar);

        // 3.1 Create two objects
        MyStaticClass obj1 = new MyStaticClass();
        MyStaticClass obj2 = new MyStaticClass();

        // 3.1 Modify the static variable
        MyStaticClass.staticVar = 10;

        // 3.1 Check the value of the static variable using objects
        System.out.println("obj1.staticVar = " + obj1.staticVar);
        System.out.println("obj2.staticVar = " + obj2.staticVar);
        System.out.println("Values are equal: " + (obj1.staticVar == obj2.staticVar));

        // 3.2 Call the static method using the class name
        System.out.println("Task 3.2: ");
        MyStaticClass.staticMethod();

        // 3.2 Static method called inside a static method
        MyStaticClass.callStaticFromStatic();

        // 3.2 Static method called inside a non-static method
        obj1.callStaticFromNonStatic();
    }
}