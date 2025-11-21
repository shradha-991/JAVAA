public class SwapNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // method 1
        System.out.println("Method1 Temp variable");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a + ",b=" + b);

        a = 5;
        b = 10;

        // Method 2
        System.out.println("Method 2: operater");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + ",b =" + b);

        a = 5;
        b = 10;

        // Method3 Using bitwise 
        System.out.println("Method 3: XOR");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a=" + a + ",b=" + b);
    }
}