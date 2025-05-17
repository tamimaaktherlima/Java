import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        int tmp = n;
        int sum = 0;
        while(tmp !=0){
            int mod = tmp%10;
            tmp/=10;
            sum+=mod;
        }
        System.out.println("Sum of digit is : "+sum);
    }
}
