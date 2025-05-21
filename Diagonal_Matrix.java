import java.util.Scanner;

public class Diagonal_Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Row : ");
        int row = input.nextInt();
        System.out.print("Enter the Col : ");
        int col = input.nextInt();
        int [][]matA = new int[row][col]; 

        int sum = 0;
        int upper_sum =0 ;
        int lower_sum = 0; 

        // Taking Matrix Input
        System.out.println("Enter the matrix A");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("A[%d][%d] = ", i,j); // A[0][0] take the input like this.
                matA[i][j] = input.nextInt();
            }
        }

        System.out.print("Diagonal Elements are : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i == j){
                    System.out.print(" " + matA[i][j]);
                    sum += matA[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum of Diagonal is : "+sum);
        System.out.println();

        // Upper triangle
        System.out.print("Upper Triangle Elements are : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i < j){
                    System.out.print(" " + matA[i][j]);
                    upper_sum += matA[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum of Upper triangle : "+upper_sum);
        System.out.println();
        

        // Lower triangle
        System.out.print("Lower Triangle Elements are : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i > j){
                    System.out.print(" " + matA[i][j]);
                    lower_sum += matA[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum of Lower triangle : "+lower_sum);
    }
    
}
