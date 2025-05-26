public class OverloadingTest {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Tamima", "CSE");
        System.out.println("For 2 parameter --- ");
        teacher2.display();

        Teacher teacher3 = new Teacher("Lima", 28,30000);
        System.out.println("For 3 parameter --- ");
        teacher3.display();

        Teacher teacher4 = new Teacher("Tamima", "CSE","Female",30,1777219733,25000);
        System.out.println("For all parameter ---- ");
        teacher4.display();

    }
}
