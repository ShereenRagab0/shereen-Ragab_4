
package sec_5;
import java.util.Scanner;
public class Sec_5 {
  
    
 
    public static void main(String[] args)
    {
       Scanner type = new Scanner (System.in );
      System.out.println("Enter a type of Staff please : ") ;
      String typeofstaff = type.next();
       memberFactory Member_F = new memberFactory();
       staff s = Member_F.getmember();
    }
    
}
