import java.util.Scanner;

public class doW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= sc.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i<=n);
    }
    
}
