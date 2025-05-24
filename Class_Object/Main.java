public class Main {
    public static void main(String[] args) {
        Teacher teacher1; // object declare
        teacher1 = new Teacher("tamima", "CSE","Female",1777219733,3000); // object create

        // Manually Initialized value
        teacher1.name = "Tamima Akther Lima";
        teacher1.department_name = "CSE";
        teacher1.gender = "Female";
        teacher1.phone = 1777219733;
        teacher1.salary = 30000;

        // Manually Printing
        System.out.print("Name : "+teacher1.name+"\n"+"Department : "+teacher1.department_name+"\n"+"Gender : "+teacher1.gender+"\n"+"Phone Number : "+teacher1.phone+"\n"+"Salary : "+teacher1.salary+"\n"+"\n");

        teacher1.set_Info("Asif Iqbal", "Software", "Male", 1777219733, 35000);
        teacher1.displayInfo();

        Teacher teacher2 = new Teacher("anisul islam", "MCT", "male",17256478, 20000);
        // Manually Value Initialized 
        teacher2.name = "Ashiqur Rahnam";
        teacher2.department_name = "EEE";
        teacher2.gender = "Male";
        teacher2.phone =  177546386;
        teacher2.salary = 20000;

        // Manually Printing
        System.out.print("Name : "+teacher2.name+"\n"+"Department : "+teacher2.department_name+"\n"+"Gender : "+teacher2.gender+"\n"+"Phone Number : "+teacher2.phone+"\n"+"Salary : "+teacher2.salary);
        
        teacher2.set_Info("Lima Akther", "CSE", "Female", 1777219733, 30000);
        teacher2.displayInfo();
    }
}
