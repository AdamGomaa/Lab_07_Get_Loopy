public class Loop_07 {
    public static void main(String[] args){
        int row = 1;
        for (int c = 5; c >= row; c--){
            for (int j = 5; j >= row; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
