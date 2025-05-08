// Celsius to Fahrenheit & Kelvin

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cels;
        System.out.print("Enter Temperature in Celsius Degree : ");
        cels = input.nextDouble();
        
        double farh, kel;
        farh = ((9/5) * cels) + 32;
        kel = cels + 273.15;

        System.out.println("In Fahrenheit : "+farh);
        System.out.println("In Kelvin : "+kel);
    }
}
