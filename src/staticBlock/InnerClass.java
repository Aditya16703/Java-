 //package staticBlock;


// class Test {
//     static String name;
//     public Test(String name){
//         Test.name = name;
//     }
// }

public class InnerClass {
    static class Test {
         String name;
        public Test(String name){
            this.name = name;
        }
        @Override // System.out.println(a);
        public String toString(){
            return name;
        }

        
    }

    public static void main(String[] args){
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");
        System.out.println(a);

        System.out.println(a.name);// here prinln is a method , out is variable and System is a class in System.out.println();and . is used to bing the instance variables or instance methods with reference variables 
        System.out.println(b.name);
    }
    
    
}
