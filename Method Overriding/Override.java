// Method Overriding --> Declaring a method in subClass/childClass which is already present in superClass/parentClass.
// .. Method name, data type, parameter must be same.
 
public class Override {
    public static void main(String[] args) {
        
        Person p = new Person();
        p.name = "Tamima";
        p.age = 25;
        p.display();

        Student st = new Student();
        st.name = "Lima";
        st.age = 20;
        st.id = "241-15-564";
        st.university = "Daffodil International University";
        st.display();;
    }
}
