public class Main {
    public static void main(String[] args) {
        
        Student st1 = new Student("Tamima Akther Lima", 564, 3.87);
        st1.display();

        Student st2 = new Student("Habibur Bashar", 938, 3.07);
        st2.display();

        Student st3 = new Student("Rahima Khanom", 236, 3.96);
        st3.display();

    // For Static Variable -->
        // StaticVariable obj = new StaticVariable();

    // Static variable are related to Class not an Object. 
        System.out.println("University name is : "+StaticVariable.university_name+"\n\n");


    // Static variable
        StaticVariable obj = new StaticVariable();
        obj.display(); // 1 --> 1

        StaticVariable obj1 = new StaticVariable();
        obj.display(); // 1 --> 2

        StaticVariable obj2 = new StaticVariable();
        obj.display(); // 1 --> 3
        System.out.println();

    // Static Method
        StaticMethod st = new StaticMethod(); // Non static method must have object
        st.display1();

        // Static method have not an object . It can access directly by Class name.
        StaticMethod.display2();

    }
}
