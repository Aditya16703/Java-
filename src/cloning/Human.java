package cloning;

public class Human {
    int age;
    String name;


    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }


    public Human(int age, String name) {
        //TODO Auto-generated constructor stub
        this.age = age;
        this.name = name;
    }


    // public Human(int i, String string) {
    //     //TODO Auto-generated constructor stub
    // }
}
