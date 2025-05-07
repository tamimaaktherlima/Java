    //  Types of Operator:
    //  1. Arithmetic Operator
    //  2. Assignment Operator
    //  3. Relational Operator
    //  4. Logical Operator
    //  5. Conditional Operator
    //  6. Unary Operator
    //  7. Bitwise Operator
    //  8. Special Operator

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {

        // int num1=20, num2=5, result;

        // By taking User Input doing Arithmetic Operation.
        Scanner input = new Scanner(System.in);
        int num1, num2, result;

        System.out.print("Enter Your First Number : ");
        num1 = input.nextInt();

        System.out.print("Enter Your Second Number : ");
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("Summation is : "+result);

        result = num1 - num2;
        System.out.println("Substractin is : "+result);

        result = num1 * num2;
        System.out.println("Multiplication is : "+result);

        result = num1 / num2;
        System.out.println("Division is : "+result);

        result = num1 % num2;
        System.out.println("Reminder is : "+result);
        
    }
    
}
