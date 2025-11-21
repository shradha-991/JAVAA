//Data Recovery- Reversing the sensor log
import java.util.Scanner;

public class reversingsensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temps = new int[n];
        for (int i = 0; i < n; i++) {
            temps[i] = sc.nextInt();
        }
       
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(temps[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}