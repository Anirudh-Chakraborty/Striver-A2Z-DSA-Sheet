public class fibonacci {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(fib(n));

    }

    public static int fib(int n) {

        //0 1 1 2 3 5 8 13
        //i + j = k
        //i = j
        //j = k
        //1   1   2
        //i + j = k

        if (n == 0) {
            return 0;
        }
        else{

        
        int i = 0;
        int j = 1;

        int k = 1;

        for(int a = 0;a<n-1; a++ ) {
            k = i + j;
            i = j;
            j = k;

        }

        return k;
        }
    }
}
