import java.util.*;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println("Give Numbers");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(reverse(x));

    }

    static int reverse(int x) {
        int reverse = 0;

        if (x >= 0) {
            int n = String.valueOf(x).length() - 1;

            int z = 0;
            for (int i = n; i >= 0; i--) {
                z = x % 10;
                if ((reverse + z * Math.pow(10, i)) > Integer.MAX_VALUE
                        || (reverse + z * Math.pow(10, i)) < Integer.MIN_VALUE) {
                    return 0;
                }
                reverse += z * Math.pow(10, i);
                x = x / 10;
            }
            x = reverse;

        } else {

            x = x * (-1);
            int n = String.valueOf(x).length() - 1;

            int z = 0;

            for (int i = n; i >= 0; i--) {
                z = x % 10;
                if ((reverse + z * Math.pow(10, i)) > Integer.MAX_VALUE
                    || (reverse + z * Math.pow(10, i)) < Integer.MIN_VALUE) {
                    
                    return 0;
                }
                reverse += z * Math.pow(10, i);
                x = x / 10;
            }
            x = reverse * -1;
        }
        return x;
    }
}