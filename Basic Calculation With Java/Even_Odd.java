import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("This is Even Number");
        }
        else{
            System.out.println("This is Odd Number");
        }
    }
}
