import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean contGame = false;
        do {
            // P1 move choice
            String p1Move = "";
            boolean endLoop = false;
            do {
                System.out.print("P1 Move [R/P/S]: ");
                p1Move = in.nextLine().toUpperCase();

                if (p1Move.equalsIgnoreCase("R")) {
                    endLoop = true;
                }
                else if (p1Move.equalsIgnoreCase("P")) {
                    endLoop = true;
                }
                else if (p1Move.equalsIgnoreCase("S")) {
                    endLoop = true;
                }
                else {
                    System.out.println("ERROR: invalid value of '" + p1Move + "'");
                }
            } while (!endLoop);

            // P2 move choice
            String p2Move = "";
            endLoop = false;
            do {
                System.out.print("P2 Move [R/P/S]: ");
                p2Move = in.nextLine();

                if (p2Move.equalsIgnoreCase("R")) {
                    endLoop = true;
                }
                else if (p2Move.equalsIgnoreCase("P")) {
                    endLoop = true;
                }
                else if (p2Move.equalsIgnoreCase("S")) {
                    endLoop = true;
                }
                else {
                    System.out.println("ERROR: invalid value of '" + p2Move + "'");
                }
            } while (!endLoop);

            // Game logic
            if (p1Move.equalsIgnoreCase("R")) {
                if (p2Move.equalsIgnoreCase("R")) {
                    System.out.println("P1 played ROCK and P2 played ROCK. It's a draw!");
                }
                else if (p2Move.equalsIgnoreCase("P")) {
                    System.out.println("P1 played ROCK and P2 played PAPER. PAPER beats ROCK. P2 wins!");
                }
                else {
                    System.out.println("P1 played ROCK and P2 played SCISSORS. ROCK beats SCISSORS. P1 wins!");
                }
            }
            else if (p1Move.equalsIgnoreCase("P")) {
                if (p2Move.equalsIgnoreCase("R")) {
                    System.out.println("P1 played PAPER and P2 played ROCK. PAPER beats ROCK. P1 wins!");
                }
                else if (p2Move.equalsIgnoreCase("P")) {
                    System.out.println("P1 played PAPER and P2 played PAPER. It's a draw!");
                }
                else {
                    System.out.println("P1 played PAPER and P2 played SCISSORS. SCISSORS beat PAPER. P2 wins!");
                }
            }
            else {
                if (p2Move.equalsIgnoreCase("R")) {
                    System.out.println("P1 played SCISSORS and P2 played ROCK. ROCK beats SCISSORS. P2 wins!");
                }
                else if (p2Move.equalsIgnoreCase("P")) {
                    System.out.println("P1 played SCISSORS and P2 played PAPER. SCISSORS beat PAPER. P1 wins!");
                }
                else {
                    System.out.println("P1 played SCISSORS and P2 played SCISSORS. It's a draw!");
                }
            }

            // Continue game prompt
            endLoop = false;
            do {
                System.out.print("Do you wish to play again? [Y/N]: ");
                String contResponse = in.nextLine();

                if (contResponse.equalsIgnoreCase("Y")) {
                    contGame = true;
                    endLoop = true;
                }
                else if (contResponse.equalsIgnoreCase("N")) {
                    contGame = false;
                    endLoop = true;
                }
                else {
                    System.out.println("ERROR: invalid value of '" + contResponse + "'");
                }
            } while (!endLoop);
        } while (contGame);
    }
}