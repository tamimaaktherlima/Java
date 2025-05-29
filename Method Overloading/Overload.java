public class Overload {

    // Method Overloading -->
    // 1. Same Mathod name but different number and type of parameter.
    public void add(){
        System.out.println("Nothing to added !!");
    }

    public void add(int a,int b){
        System.out.println("a + b = "+(a+b));
    }

    public void add(double a, double b){
        System.out.printf("a + b = %.2f\n",(a+b)); // Setprecision --> Formate Specifier
        
    }

    public void add(int a,int b,int c){
        System.out.println("a + b + c = "+(a+b+c));
    }
}