
public class RotateImage {
    public static void main(String[] args) {
        int nums [][]= {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        RotateImage callRotateImage = new RotateImage();
        callRotateImage.rotate(nums);

    }
    public void rotate(int[][] matrix) {

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //Traverse
        for(int i = 0; i<matrix.length-1; i++){
            for(int j = 1; j<matrix.length;j++){
                if (i!=j && j>i) {
                int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
            System.out.println();
        

        //reverse

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
            int temp = matrix[i][matrix.length-1-j];
            matrix[i][matrix.length-1-j] = matrix[i][j];
            matrix[i][j] = temp;
        }
    }

    for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        }


    }
