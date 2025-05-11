import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num = input.nextInt();
        
        if(num > 0 || num%2 == 0){
            System.out.println("Positive");
        }
        else if(num < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
