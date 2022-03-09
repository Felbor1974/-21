public class DrawRectangle {

    public static void drawRectangle(int n, int m, String s) {
        // write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == (n - 1)) {
                    System.out.print(s);
                }
                else if(j == 0 || j == (m-1))System.out.print(s);
                else System.out.print(" ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        drawRectangle(3, 6, "+");
    }
}
