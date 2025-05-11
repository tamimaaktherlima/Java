import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char c = input.next().charAt(0); // jodi tamima input dewa hoy tobe only [0] index er character ta nibe.

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.printf("%c is a vowel\n", c);
        }
        else {
            System.out.printf("%c is a constant\n",c);
        }

    }
}
