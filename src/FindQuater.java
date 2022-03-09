import java.util.Scanner;

public class FindQuater {
    public static void findQuarter(int x, int y) {
        // write your code here


        int ans = 0;
        if (x > 0 && y > 0) ans = 1;
        else if (x < 0 && y > 0) ans = 2;
        else if (x < 0 && y < 0) ans = 3;
        else if (x > 0 && y < 0) ans = 4;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        findQuarter(x,y);
    }
}


