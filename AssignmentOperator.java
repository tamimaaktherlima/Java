import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        // int x = 10;
        // int y = 5;

        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.print("Enter x value : ");
        x = input.nextInt();
        System.out.print("Enter y value : ");
        y = input.nextInt();

        x+=y;  // X=X+Y
        System.out.println("X = "+x);

        x-=y;   // X=X-Y
        System.out.println("X = "+x);

        x*=y;   // X=X*Y
        System.out.println("X = "+x);

        x/=y;   // X=X/Y
        System.out.println("X = "+x);

        x%=y;   // X=X%Y
        System.out.println("X = "+x);
    }
    
}
