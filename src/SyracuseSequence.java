public class SyracuseSequence {
    public static void syracuseSequence(int number) {
        // write your code here
        int count = 0;
        String ans = "" + number;
        while (true) {
            count++;
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = 3 * number + 1;
            }
            ans = ans + " -> " + number;
            if (number == 1) break;
        }
        System.out.println(count + "\n" + ans);
    }
}