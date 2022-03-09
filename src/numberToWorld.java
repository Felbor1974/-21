public class numberToWorld {
    public static void numberToWorld(int number) {
        boolean even = (number % 2 == 0);
        int numQuantity = ("" + number).length();
        System.out.println(numQuantity);
        if(even) {
            switch (numQuantity) {
                case 1:
                    System.out.println("even single digit number");
                    break;
                case 2:
                    System.out.println("even two-digit number");
                    break;
                case 3:
                    System.out.println("even three-digit number");
                    break;
            }
        }
        if(!even){
            switch (numQuantity){
                case 1:
                    System.out.println("odd single digit number");
                    break;
                case 2:
                    System.out.println("odd two-digit number");
                    break;
                case 3:
                    System.out.println("odd three-digit number");
                    break;
            }
        }

    }
    public static void main (String[]args){
        numberToWorld(0);

    }
}

