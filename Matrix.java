import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int matA[][] = new int[2][3]; 
        // int matB[][] = new int[2][3];

        // System.out.println("Enter the matrix A");
        // for(int row=0; row<2; row++){
        //     for(int col=0; col<3; col++){
        //         System.out.printf("A[%d][%d] = ", row,col); // A[0][0] take the input like this.
        //         matA[row][col] = input.nextInt();
        //     }
        // }
        // System.out.println("Enter the matrix B");
        // for(int row=0; row<2; row++){
        //     for(int col=0; col<3; col++){
        //         System.out.printf("B[%d][%d] = ", row,col);
        //         matB[row][col] = input.nextInt();
        //     }
        // }


        // System.out.println("matA = ");
        // for(int row=0; row<2; row++){
        //     for(int col=0; col<3; col++){
        //         System.out.print(" " +matA[row][col]);
        //     }
        //     System.out.println();
        // }
        // System.out.println("matB = ");
        // for(int row=0; row<2; row++){
        //     for(int col=0; col<3; col++){
        //         System.out.print(" " +matB[row][col]);
        //     }
        //     System.out.println();
        // }


        // Taking user input (Row, col)
        System.out.print("Enter the Row : ");
        int row = input.nextInt();
        System.out.print("Enter the Col : ");
        int col = input.nextInt();
        int matA[][] = new int[row][col]; 
        int matB[][] = new int[row][col];

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

        // Printing the Matrix
        System.out.println("matA = ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(" " +matA[i][j]);
            }
            System.out.println();
        }
        System.out.println("matB = ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(" " +matB[i][j]);
            }
            System.out.println();
        }
    }
}
