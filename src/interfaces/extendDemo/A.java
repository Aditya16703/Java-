package interfaces.extendDemo;

public interface A {

    // static interface methods should always hava a body 
    // call via the interface name in main class 
    static void greeting(){
        System.out.println("Hey i am a static method of interfaces ");
    }
    void fun();
}
