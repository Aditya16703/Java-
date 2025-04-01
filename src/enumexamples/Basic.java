//package enumexamples;

public class Basic {
    enum Week implements A {
        Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday;
        //  these  are enum constants 
        //  public , static and final 
        //  since its final you can create child enums 
        // type is Week 
        //  enum can not extands class 

        // where as it can implements as many as interfaces 
        Week(){
            System.out.println("Constructor called for" + this);  // here actually this  is getting overidden with the week day names 
        }
        // this is not public or protected , only private or default
        // why? we dont want to create new objects because  
        // this is not the enum concept , that's why 

        // internally it work something like this : public static final Week Monday = new Week();
    
    
          @Override    // enum can implement as many as interface it can   but it can't extrate classes 
          public void hello(){
            System.out.println("Hello enum ");

          }
          // abstract are not allow in enum   that is  function body is required 
    }

    

    public static void main (String[]  args){

        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));
        // System.out.println(week.ordinal());

        // for(Week day : Week.values())  {
        //     System.out.print(day+" ");
        // }
        
    }
    
}

