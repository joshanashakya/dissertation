

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
      
// Function to compare x^y and y^x 
static void compareVal(int x, int y) 
{ 
  
    // Storing values OF x^y AND y^x 
    double a = y * Math.log(x); 
    double b = x * Math.log(y); 
  
    // Comparing values 
    if (a > b) 
        System.out.print(x + "^" + y + " > " +  
                         y + "^" + x); 
  
    else if (a < b) 
        System.out.print(x + "^" + y + " < " + 
                         y + "^" + x); 
  
    else if (a == b) 
        System.out.print(x + "^" + y + " = " + 
                         y + "^" + x ); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int x = 4, y = 5; 
  
    compareVal(x, y); 
} 
}  
  
// This code is contributed by 29AjayKumar 

