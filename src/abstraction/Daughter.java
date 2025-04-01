//package abstraction;

public class Daughter extends Parent {

    //private int age;
    
        public Daughter(int age){
            super(age);
            this.age = age;
    }

    @Override
    void career() {
        
        System.out.println("I want to became an software engnieer");
    }

    @Override
    void partner() {
       
       System.out.println("I love shopping");
    }
    
    
}
