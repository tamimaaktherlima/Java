import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        // t1.name = "Alif";
        // t1.age = 25;
        Scanner input = new Scanner(System.in);
        ///System.out.print("Enter Teacher name : ");
        //t1.name = input.nextLine();
        //System.out.print("Enter department name : ");
        //t1.deptName = input.nextLine();
        //System.out.print("Enter your age : ");
        //t1.age = input.nextInt();

        //t1.display2();


        // Private Variable Access.
        Student st = new Student();
        st.setName("Tamima Akther Lima");
        st.setAge(25);

        System.out.println(st.getName());
        System.out.println(st.getAge());

        Programmer p = new Programmer();
        System.out.println(p instanceof Programmer);
        System.out.println(p instanceof Student);
    }
}
