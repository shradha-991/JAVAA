public class arg_sum {
    int sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
        return a + b;
    }
    double sum(int a, float b, double c) {
        System.out.println("Sum: " + (a + b + c));
        return a + b + c;
    }   

    public static void main(String[] args) {
        arg_sum obj = new arg_sum();
        obj.sum(0, 0);
        obj.sum(1, 2.5f, 3.5);
       
    }                               
}
