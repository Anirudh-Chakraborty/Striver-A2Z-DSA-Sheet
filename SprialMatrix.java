import java.util.List;
import java.util.ArrayList;

public class SprialMatrix {
    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        SprialMatrix callsprialMatrix = new SprialMatrix();
        callsprialMatrix.PrintMatrix(nums);
        System.out.println(callsprialMatrix.spiralOrder_1(nums));
        //System.out.println(callsprialMatrix.spiralOrder(nums));
        // output = [1,2,3,6,9,8,7,4,5]
    }

    void PrintMatrix(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        // matrix[i].length ==3;
        // matrix.length == 3;

        int i = 0;
        int j = 0;
        int k = 0;

        for (j = 0; j < matrix[i].length; j++) {
            list.add(matrix[i][j]);
        }
        System.out.println();
        System.out.println("1st");
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println();

        i++;
        j = j - i;

        System.out.println("2nd");
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println();

        for (; i < matrix.length; i++) {
            list.add(matrix[i][j]);
        }

        System.out.println("3rd");
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println();

        i--;
        j = matrix[i].length - i;

        System.out.println("4th");
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println();

        for (; j >= 0; j--) {
            list.add(matrix[i][j]);
        }

        System.out.println("5th");
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println();
        i--;
        j = j + i;

        System.out.println("5th");
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println();
        for (; j < matrix.length - 1; j++) {
            list.add(matrix[i][j]);
        }
        return list;
    }


    public List<Integer> spiralOrder_1(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        int size = matrix[0].length * matrix.length;
        int k = 0;
        int n = matrix.length;
        while (k<n) {
        int j = 0;
        int i = 0;
            
        for( ; j < matrix.length ; j++ ){
            list.add(matrix[i][j]);
        }
        if (list.size()==size) {
            return list;
        }
        i++;
        j--;
        for( ; i < matrix.length ; i++){
            list.add(matrix[i][j]);
        }
        if (list.size()==size) {
            return list;
        }
        i--;
        j--;
        for(; j >= 0 ; j--){
            list.add(matrix[i][j]);
        }
        if (list.size()==size) {
            return list;
        }
        j++;
        i--;
        for( ;i>=1;i--){
            list.add(matrix[i][j]);
        }
        if (list.size()==size) {
            return list;
        }
        k++;
    }
        return list;
    }


    public List<Integer> spiralOrder_answer(int[][] matrix) {
    List<Integer> list = new ArrayList<>();

    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {

        // left → right
        for (int j = left; j <= right; j++) {
            list.add(matrix[top][j]);
        }
        top++;

        // top → bottom
        for (int i = top; i <= bottom; i++) {
            list.add(matrix[i][right]);
        }
        right--;

        if (top <= bottom) {
            // right → left
            for (int j = right; j >= left; j--) {
                list.add(matrix[bottom][j]);
            }
            bottom--;
        }

        if (left <= right) {
            // bottom → top
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
    }

    return list;
}

}
