public class CheckifArrayIsSortedandRotated {
    public static void main(String[] args) {
     int arr []= {5,4,1,2,3};
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

        //For Printing
        
        for(int i = 0; i<B.length; i++){
            System.out.print(B[i]+" ");
        }
        System.out.println("B");

        for(int i = 0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("A");
        }
        
        return returner;
    }
}
