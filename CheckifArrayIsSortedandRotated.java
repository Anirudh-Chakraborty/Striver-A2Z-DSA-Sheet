public class CheckifArrayIsSortedandRotated {
    public static void main(String[] args) {
     int arr []= {1,1,1};
        System.out.println(check(arr));
    }

    public static boolean check(int[] A) {
        int B [] = new int [A.length];
        int x = 0;
        boolean returner = false;
    
        while (x<B.length && returner == false) {
            x++;
            for(int i = 0; i<B.length; i++){
                B[i] = A[(i+x) % A.length ];
            }

        returner = true;

        for(int i = 0; i<B.length-1; i++){
            if ((B[i]<B[i+1])||(B[i]==B[i+1])) {
            }
            else{
                returner = false;
            }
        }
        System.out.println("Arr");
        for(int i = 0; i<B.length; i++){
            System.out.print(B[i]+" ");
        }

        System.out.println("Nums");
        for(int i = 0; i<B.length; i++){
            System.out.print(A[i]+" ");
        }
        }
        
        return returner;
    }
}
