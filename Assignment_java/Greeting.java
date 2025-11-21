public class Greeting {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }

    public static void main(String[] args) {

        Greeting obj = new Greeting();
        obj.sayHello("Shradha"); 
    }
}
