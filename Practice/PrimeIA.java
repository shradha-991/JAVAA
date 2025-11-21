public class PrimeIA {
    
    private int number; // Instance variable
    
    private static int objectCount = 0; // Static variable

    
    public PrimeIA(int number) {
        this.number = number;
        objectCount++;
    }

    
    public boolean isPrime() {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    
    public void printDetails() {
        System.out.println("Object: " + this);
        System.out.println("Class: " + this.getClass().getName());
        System.out.println("Field (number): " + this.number);
        System.out.println("Is prime: " + isPrime());
    }

    
    public static void printObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    public static void main(String[] args) {
        PrimeIA obj1 = new PrimeIA(7);
        PrimeIA obj2 = new PrimeIA(10);

        obj1.printDetails();
        System.out.println();
        obj2.printDetails();

        System.out.println();
        PrimeIA.printObjectCount();
    }
}