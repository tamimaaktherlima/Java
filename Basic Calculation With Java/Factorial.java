import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = input.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial is : " +fact);
    }
}
