

// Java implementation of above approach  
  
import java.io.*; 
  
class GFG { 
   
// function to calculate coin.  
 static int coin(int totalRupees, int X, int Y, int Z)  
{  
  
    float one = 0, fifty = 0, twentyfive = 0,  
        result = 0, total = 0;  
  
    // Converting each of them in rupees.  
    // As we are given totalRupees = 1800  
    one = X * 1;  
    fifty = ((Y * 1) / 2);  
    twentyfive = ((Z * 1) / 4);  
  
    total = one + fifty + twentyfive;  
  
    result = ((totalRupees) / total);  
  
    return (int)result;  
}  
  
// Driver code  
  
    public static void main (String[] args) { 
          
    int totalRupees = 1800;  
    int X = 1, Y = 2, Z = 4;  
  
    int Rupees = coin(totalRupees, X, Y, Z);  
  
    System.out.println( "1 rupess coins = " + Rupees * 1);  
    System.out.println( "50 paisa coins = " + Rupees * 2);  
    System.out.println( "25 paisa coins = " + Rupees * 4);  
    } 
} 
//This code is contributed by  inder_verma. 

