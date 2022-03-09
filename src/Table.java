
public class Table {
    public static void table(int n) {
        // write your code here
        String tab = "";
        int[][] tabArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tabArr[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] i : tabArr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d * %d = %d\n",i+1,n,((i+1)*n));
        }
    }

    public static void main(String[] args) {
        table(5);
    }
}