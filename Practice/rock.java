import java.util.Scanner;

public class rock {
    public static String winningMove(String M) {
        switch (M) {
            case "rock":
                return "paper";
            case "paper":
                return "scissor";
            case "scissor":
                return "rock";
            default:
                return "invalid move";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String M = sc.nextLine();
        System.out.println(winningMove(M));
    }

}