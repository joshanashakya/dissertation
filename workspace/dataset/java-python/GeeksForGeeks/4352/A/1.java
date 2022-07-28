

// Java code to illustrate 
// the use of cos function 
import java.io.*; 
  
class GFG  
{ 
static final double PI = 3.142; 
public static void main (String[] args) 
{ 
    double x, ret, val; 
      
    x = 60.0; 
    val =(int)PI / 180.0; 
    ret = Math.cos(x * val); 
    System.out.print("The cosine of " +  
                           x + " is "); 
    System.out.print(ret); 
    System.out.println(" degrees"); 
          
    x = 90.0; 
    val = (int)PI / 180.0; 
    ret = Math.cos( x*val ); 
    System.out.print("The cosine of " + 
                           x + " is "); 
    System.out.print(ret); 
    System.out.println(" degrees"); 
} 
} 
  
// This code is contributed  
// by ajit 

