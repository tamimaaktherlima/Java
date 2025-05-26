public class Teacher {

    String name, department_name, gender;
    int age, phone;
    float salary;

    // Constructor Overloading
// Default Constructor
    Teacher(){
        // System.out.println("Teacher Name : "+this.name);
        // System.out.println("Department Name : "+this.department_name);
        // System.out.println("Gender : "+this.gender);
        // System.out.println("Age : "+this.age);
        // System.out.println("Phone Number : "+this.phone);
        // System.out.println("Salary : "+this.salary);
        System.out.println("No Information !!! ");
    }
// Parameterized Constructor
    Teacher(String name, String department_name){
        this.name = name;
        this.department_name = department_name;
    }

    Teacher(String name, int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    Teacher(String name, String department_name, String gender, int age, int phone, float salary){
        this.name = name;
        this.department_name = department_name;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }

    void display(){
        System.out.println("Teacher Name : "+this.name);
        System.out.println("Department name : "+this.department_name);
        System.out.println("Gender : "+this.gender);
        System.out.println("Age : "+this.age);
        System.out.println("Phone Number : "+this.phone);
        System.out.println("Salary : "+this.salary);
        System.out.println();
    }
}