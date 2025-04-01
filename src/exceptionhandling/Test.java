public class Test {

    public static void main(String[] args) {
    //     int[] numerators = {10,200,30,40};
    //     int[] denominator = {1,2,0,4};
    //     for(int i = 0; i < numerators.length; i++){
    //         System.out.println(divide(numerators[i],denominator[i]));
    //     }

    //     System.out.println("la la la la ");

    // }

    // public static int divide(int a, int b){
    //     try{
    //         return a/b;
    //     }catch(ArithmeticException e){
    //         System.out.println(e);
    //         return -1;
    //     }


    BankAccount bankAccount = new BankAccount(10);
    try{
        bankAccount.withdraw(11);
    }catch(Exception e){
        System.out.println(e);
    }
         
    }
    
}
