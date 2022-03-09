
import java.util.Arrays;

public class triangleOfPaskal {


    //public class Main {
    public static short size = 3;
    public static int[][] ints = new int[size][];

    public static void main(String[] args) {
        // code here...
        int count = 1;
        for (int i = 0; i < size; i++) {
            ints[i] = new int[count++];
            for (int j = 0; j < ints[i].length; j++) {
                    if((j == 0) || (j == ints[i].length - 1)){
                    ints[i][j] = 1;
                    continue;
                }
                ints[i][j] = ints[i - 1][j] + ints[i - 1][j -1];
            }
        }
        for (int i = 0; i < size ; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
    }
}

