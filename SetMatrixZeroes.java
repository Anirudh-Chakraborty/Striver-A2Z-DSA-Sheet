import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int matrix [][]={{1,1,1,8},{1,0,1,0},{0,1,1,1}};
        SetMatrixZeroes callSetMatrixZeroes = new SetMatrixZeroes();

        callSetMatrixZeroes.setZeroes(matrix);
    }

     public void setZeroes(int[][] matrix) {
        List<Integer> list_i = new ArrayList<>();
        List<Integer> list_j = new ArrayList<>();
        int m = matrix.length;   // i
        int n = matrix[0].length;      // j


        //Tracking Zeroes
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix[i].length;j++){
                if (matrix[i][j]==0) {
                    list_i.add(i);
                    list_j.add(j);
                }
            }
        }

        System.out.println(list_i);
        System.out.println(list_j);
        System.out.println();
        System.out.println(list_i.size());
        System.out.println(list_j.size());
        System.out.println();

        System.out.println();
        System.out.println("Initial Matrix");
        for(int i=0; i< m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        //setting colums = 0
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < list_j.size() ; j++){
                matrix[i][list_j.get(j)] = 0;
            }
        }

        //setting rows
        for(int j = 0; j < n ; j++){
            for(int i = 0; i<list_i.size(); i++){
                matrix[list_i.get(i)][j] = 0;
            }
        }

        System.out.println();
        System.out.println("Initial Matrix");
        for(int i=0; i< m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }
}
