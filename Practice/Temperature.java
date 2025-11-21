//Temperature check for outdoor activities
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp= sc.nextInt();

        if (temp > 0) {
            System.out.println("Safe for outdoor activities");
        } else {
            System.out.println("Too cold for outdoor activities");
        }
        sc.close();
    }
} 