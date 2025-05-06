public class FormatSpacifier {
    public static void main(String[] args){

        boolean b = false;
        char c = 'B';
        int n = 85;
        double d = 23.1452;  
        float f = 20.4f;

        System.out.printf("Boolean = %b\n", b);
        System.out.printf("Character = %c\n", c);
        System.out.printf("Integer = %d\n", n);
        System.out.printf("Double = %.4f\n", d);
        System.out.printf("Float = %.2f\n", f);
    }
}
