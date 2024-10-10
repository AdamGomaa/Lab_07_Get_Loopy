public class Loop_06 {
    public static void main(String[] args){
        int row = 5;
        for (int c = row; c > 0; c--){
            for (int j = 0; j < c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
