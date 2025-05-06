import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // How to take Integer input from User. --> nextInt()
        Scanner input = new Scanner(System.in);  // Take User Input in Java 
        System.out.print("Enter any Integer number : ");
        int number = input.nextInt();   // Store user input into the number variable
        System.out.println("Integer number is : "+number);

        // String input from user ---> next() / nextLine()
        Scanner str = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        //String name = str.next();  // next() --> space er porer part input nite pare nah ..
        String name = str.nextLine();  // nextLine() --> space soho full string k input ney..
        System.out.println("Your name is : "+name);

        // Double input from user --> nextDouble()
        Scanner d = new Scanner(System.in);
        double num1;
        System.out.print("Enter your double value : ");
        num1 = d.nextDouble();
        System.out.println("Double number is : "+num1);
    }
}
