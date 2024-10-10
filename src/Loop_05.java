public class Loop_05 {
    public static void main(String[] args){
        int row = 5;
        for (int c = 1; c <= row; c++){
            for (int j = 1; j <= c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
