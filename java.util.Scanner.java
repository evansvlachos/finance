

import java.util.Scanner;  // Import the Scanner class

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter gcp");
    int GCP = myObj.nextBoolean();  // Read user input
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter old");
    int old = myObj.nextBoolean();  // Read user input
      
     //gcp select LOOP ,describe if economy grows
     if (GCP < OLD) {
     System.out.println("Depresion");
     } 
     else (GCP=OLD){
     System.out.println("stable");
     }   
     else (GCP>OLD){
     System.out.println ("growth");
     
      // object  growth
     myclass growth = new myclass;
      
     growth=100*(GCP/OLD) 
   
     }
  }
}
    
