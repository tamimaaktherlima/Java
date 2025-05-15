public class Array_2D {
    public static void main(String[] args) {
        // creat 2D array
        int[][] numbers = new int[2][3];

        // initialize every elements
        numbers[0][0] = 10; 
        numbers[0][1] = 20; 
        numbers[0][2] = 30; 
        numbers[1][0] = 40; 
        numbers[1][1] = 50; 
        numbers[1][2] = 60; 

        // Print the elements
        // System.out.println(numbers[0][0]);
        // System.out.println(numbers[0][1]);
        // System.out.println(numbers[0][2]);
        // System.out.println(numbers[1][0]);
        // System.out.println(numbers[1][1]);
        // System.out.println(numbers[1][2]);

        // Print using Loop
        for(int row=0; row<2; row++){
            for(int col=0; col<3; col++){
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }

    }
}
