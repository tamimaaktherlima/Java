public class Person {

    // Default
    // String name;
    // int age;

    // Private
    private String name;
    private int age;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return this.age;
    }

    public void display1(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}