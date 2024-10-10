import java.util.Random;
public class Die_Roller {
    public static void main(String[] args) {
        Random gen = new Random();
        int die1, die2, die3 = 0;
        int dieRoll = 0;
        do{
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            dieRoll++;
            System.out.printf("%6d\t%4d\t%4d\t%4d\n",dieRoll,die1,die2,die3);
        }while(!(die1==die2 && die2 == die3));
    }
}