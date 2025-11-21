import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        int num = sc.nextInt(),original=num,sum=0; 
        

        // Find number of digits
        int digits = String.valueOf(num).length();

        // Calculate sum of digits raised to the power of 'digits'
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        // Check Armstrong condition
        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");
    }
}
