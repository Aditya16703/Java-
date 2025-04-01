//package abstraction;

public class Son extends Parent{

    //private int age;
    
        public Son(int age){
            super(age);
            this.age = age;
    }

    @Override
    void career() {
        
        System.out.println("I want to became an army");
    }

    @Override
    void partner() {
        
        System.out.println("I love criket");
    }

     
}
