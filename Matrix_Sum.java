import java.util.Scanner;

public class Matrix_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Row : ");
        int row = input.nextInt();
        System.out.print("Enter the Col : ");
        int col = input.nextInt();
        int [][]matA = new int[row][col]; 
        int [][]matB = new int[row][col];
        int [][]matC = new int[row][col];
        int [][]matD = new int[row][col];


        // Taking Matrix Input
        System.out.println("Enter the matrix A");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("A[%d][%d] = ", i,j); // A[0][0] take the input like this.
                matA[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the matrix B");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("B[%d][%d] = ", i,j); // A[0][0] take the input like this.
                matB[i][j] = input.nextInt();
            }
        }

        // Sum of two matrix
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }
        System.out.println("Sum of matrix = ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(" " + matC[i][j]);
            }
            System.out.println();
        }

        // Substract of two matrix
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matD[i][j] = matA[i][j] - matB[i][j];
            }
        }
        System.out.println("Substract of matrix = ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(" " + matD[i][j]);
            }
            System.out.println();
        }
    }
}
