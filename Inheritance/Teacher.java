public class Teacher extends Person {
    
    String deptName;

    void display2(){
        display1();
        System.out.println("Department name : "+deptName);
    }
}
