public class test {

    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            //打印空格
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //打印*
            for (int x = n + 1 - i; x >= 1; x--) {
                System.out.print("*");
                System.out.print(" ");
            }

            System.out.println();
        }
    }
        void Print ( int n){
            for (int i = 1; i <= n; i++) {
                //打印空格
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                //打印*
                for (int x = n + 1 - i; x >= 1; x--) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

}