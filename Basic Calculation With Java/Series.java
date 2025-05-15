import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = input.nextInt();

        for(int i=1;i<=num;i+=2){
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i=1;i<=num;i++){
            System.out.print(Math.pow(num, i) + " ");
        }
    }
}