public class checkDay {
    public static void signal(double time) {
        // write your code here
        double ans = time % 5;
        if (ans > 0 && ans <= 3) System.out.println("green");
        else if (ans > 3 && ans <= 4) System.out.println("yellow");
        else if (ans > 4 || ans == 0) System.out.println("red");
    }


    public static void main(String[] args) {
        signal(0);
    }
}