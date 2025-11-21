public class RecursionFibonacci {
    public static int getFibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return getFibonacci(num - 1) + getFibonacci(num - 2);
        }
    }
    public static void main(String[] args) {
       System.out.println("The fibonacci for num 5 is: " + getFibonacci(5));
    }
}