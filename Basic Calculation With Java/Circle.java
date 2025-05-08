import java.util.*;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius,area;
        System.out.print("Enter Radius value : ");
        radius = input.nextDouble();

        area = 3.1416*radius*radius;
        System.out.println("Area of Circle is : "+area);
        System.out.printf("Area of Circle is : %.2f",area);
    }
}
