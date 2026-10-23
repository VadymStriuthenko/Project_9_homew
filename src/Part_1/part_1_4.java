package Part_1;
// 1.1. Class declaration
class MyClass {
}
// 1.2. Public method
class MyClassWithMethod {
    public void print(String s) {
        System.out.println(s);
    }
}
// 1.3. Private method
class MyClassWithPrivate {
    private void print(String l) {
        System.out.println(l);
    }
}
// 1.4-1.7
class MyClassWithConstructor {
    // 1.4. Constructor
    public MyClassWithConstructor() {
        System.out.println("Task 1.4: Constructor called!");
    }
    // 1.5. Public properties
    public int day;
    public String mistake;
    public boolean da;
    public double posti;
    // 1.6. Private properties
    private int age;
    private String mistake2;
    private boolean net;
    private double nuposti;
    // 1.5. Methods that access public properties
    public int printDay() {
        day = 199;
        return day;
    }
    public String printStr() {
        mistake = "O neeeet";
        System.out.println(" Second String: "+ mistake);
        return mistake;
    }
    public void printDa() {
        da = false;
        System.out.println(" Answer: "+ da);
    }
    public double printPosti() {
        posti = 13.23;
        System.out.println(" Doubt number: "+ posti );
        return posti;
    }
    // 1.6. Public methods that access private properties
    public int printAge() {
        age = 199;
        return age;
    }
    public String printMistake2() {
        mistake2 = "O daaaaa";
        return mistake2;
    }
    public void printNet() {
        net = false;
        System.out.println(" Answer: "+ net);
    }
    public double printNuPosti() {
        nuposti = 13.23;
        System.out.println(" Doubt number: "+ nuposti );
        return nuposti;
    }
    // 1.7. Getters and setters for private properties
    public void setAge(int enrolmentYear) {
        this.age = enrolmentYear;
    }
    public int getAge() {
        return age;
    }
    public void setMistaken(String enrolmentYear2) {
        this.mistake2 = enrolmentYear2;
    }
    public String getMistaken() {
        return mistake2;
    }
    public void setDa(boolean enrolmentYear3) {
        this.net = enrolmentYear3;
    }
    public boolean getDa() {
        return net;
    }
    public void setDoubt(double enrolmentYear4) {
        this.nuposti = enrolmentYear4;
    }
    public double getDoubt() {
        return nuposti;
    }
}
// 1.8. Constructor with arguments
class Info{
    private String name;
    private String country;
    public Info(String name, String country) {
        this.name = name;
        this.country = country;
    }
    public void printInfo() {
        System.out.println("Name: " + name + ", Country: " + country);
    }
}
public class part_1_4 {
    public static void main(String[] args) {
        // 1.1 Object creation
        Part_1.MyClass ob = new Part_1.MyClass();
        // 1.2 Public method call
        Part_1.MyClassWithMethod go = new Part_1.MyClassWithMethod();
        go.print("Task 1.2: print it");
        // 1.3 Private method call
        // Part_1.MyClassWithPrivate ege = new Part_1.MyClassWithPrivate();
        // ege.print("Task 1.3: print it");
        // 1.4 Constructor call during object creation
        Part_1.MyClassWithConstructor ho = new Part_1.MyClassWithConstructor();
        // 1.5 Access to public properties
        System.out.println("Task 1.5 : ");
        ho.day = 17;
        System.out.println(" Day: "+ ho.day);
        System.out.println(" New Day: " + ho.printDay());
        ho.mistake = "Hello";
        System.out.println(" First String: " + ho.mistake);
        ho.printStr();
        ho.da = true;
        System.out.println(" Do you have money? "+ ho.da);
        ho.printDa();
        ho.printPosti();
        ho.posti = 1.5;
        System.out.println(" Doubt: " + ho.posti);
        // 1.6 Access to private properties
        System.out.println("Task 1.6 : ");
        // ho.age = 17;
        // ho.mistake2 = "Hello";
        // ho.net = true;
        // ho.nuposti = 1.5;
        System.out.println(" Age: " + ho.printAge());
        System.out.println(" String: " + ho.printMistake2());
        ho.printNet();
        ho.printNuPosti();
        // 1.7 Getters and setters
        System.out.println("Task 1.7 : ");
        ho.setAge(18);
        System.out.println(" Age: "+ ho.getAge());
        ho.setMistaken("Gg");
        System.out.println(" String: "+ ho.getMistaken());
        ho.setDa(false);
        System.out.println(" Boolean: "+ ho.getDa());
        ho.setDoubt(2.5);
        System.out.println(" Double: "+ ho.getDoubt());
        // 1.8 Objects created with constructor arguments
        System.out.println("Task 1.8 : ");
        Part_1.Info hum1 = new Part_1.Info("Gosko", "Hong kong");
        Part_1.Info hum2 = new Part_1.Info("Shaitan", "USA");
        hum1.printInfo();
        hum2.printInfo();
    }
}