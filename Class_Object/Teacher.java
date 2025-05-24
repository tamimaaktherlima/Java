public class Teacher {

    // Instance Variable
    String name , gender, department_name;
    int phone, salary;

    // Constructor --> Special types of method used to initialize the object.
    // It has no return type not even Void.
    // It has the same name as the Class Name as.
    // It's called Automatically.
    // Types of constructor --> Default(No Parameter), Parameterized.
    Teacher(String name, String department_name, String gender, int phone, int salary)  // paramerized constructor.
    {
        this.name = name;
        this.department_name = department_name;
        this.gender = gender;
        this.phone = phone;
        this.salary = salary;
    }

    // Method
    void displayInfo(){
        System.out.print("Name : "+name+"\n"+"Department : "+department_name+"\n"+"Gender : "+gender+"\n"+"Phone Number : "+phone+"\n"+"Salary : "+salary+"\n"+"\n");
    }

    // Parameterized Method
    void set_Info(String name, String department_name, String gender, int phone, int salary){
        this.name = name;
        this.department_name = department_name;
        this. gender = gender;
        this.phone = phone;
        this.salary = salary;
    }
}