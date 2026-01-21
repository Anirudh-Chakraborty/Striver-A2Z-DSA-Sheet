import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Number to Check");
        int x = sc.nextInt();

        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        int reverse = 0;
        int y = x;
        if (x>=0) {
        int length = String.valueOf(x).length();
        for(int i = length-1; i>=0; i--){    
         
            int z = x%10;
            if (reverse + z * Math.pow(10, i)>Integer.MAX_VALUE) {
                return false;
            }
            reverse += z * Math.pow(10, i);
            x = x/10;
        }
    }
    else{
        x = x * -1;
        int length = String.valueOf(x).length();
        for(int i = length-1; i>=0; i--){    
         
            int z = x%10;
            reverse += z * Math.pow(10, i);
            x = x/10;
        }
        reverse = reverse * -1;
    }
        return reverse == y;
    }

}
