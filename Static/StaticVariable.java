public class StaticVariable {
    // Non-static Variable --> for this mst be create an object 
    // String university_name = "Daffodil International University";

    static String university_name = "Daffodil International University";

    int count = 0; // non static variable e different different palce hold kore for object. thst's why count different object er jonno 1 e hbe

    static int count1 = 0;

    StaticVariable(){
        // count++;
        count1++;
    }

    void display(){
        // System.out.println("Total count : "+count);
        System.out.println("Total count : "+count1);
    }

}
