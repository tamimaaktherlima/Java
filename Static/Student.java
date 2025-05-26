public class Student {

// Instance Variable
    String name;
    int id;
    double cgpa;
// Static Variable
    static String universityName = "DIU";  // Daffodil International University
    static String departmentName = "CSE";

// Constructor
    Student(String name, int id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    void display(){
        System.out.println("Student Name : "+ name+ "\n" + "ID : "+ id + "\n" + "CGPA : "+ cgpa + "\n" + "University Name : "+ universityName + "\n" + "Department Name : "+ departmentName + "\n\n");
    }


}