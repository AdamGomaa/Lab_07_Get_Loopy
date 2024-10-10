import java.util.Random;
import java.util.Scanner;

public class Die_Roller {
    public static void main(String[] args) {
        boolean done = false;
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int die1, die2, die3, sum = 0;
        int dieRoll = 0;

        do {
               dieRoll = 0;
            do {
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                dieRoll++;
                System.out.printf("%6d\t%4d\t%4d\t%4d\t%6d\n", dieRoll, die1, die2, die3,sum);
            } while (!(die1 == die2 && die2 == die3));

            System.out.print("Play again? [Y/N]: ");
            String continueYN = in.nextLine();
            if (continueYN.equalsIgnoreCase("n"))
                done = true;
        }while (!done);
    }
}