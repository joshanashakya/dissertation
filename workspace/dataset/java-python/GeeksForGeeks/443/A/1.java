

// Java implementation to find 
// the type of triangle with 
// the help of the sides 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the type of 
// triangle with the help of sides 
static void checkTypeOfTriangle(int a,  
                int b, int c){ 
    int sqa = (int)Math.pow(a, 2); 
    int sqb = (int)Math.pow(b, 2); 
    int sqc = (int)Math.pow(c, 2); 
      
    if (sqa == sqa + sqb ||  
        sqb == sqa + sqc ||  
        sqc == sqa + sqb){ 
        System.out.print("Right-angled Triangle"); 
    } 
    else if(sqa > sqc + sqb || 
            sqb > sqa + sqc || 
            sqc > sqa + sqb){ 
        System.out.print("Obtuse-angled Triangle"); 
    } 
    else{ 
        System.out.print( "Acute-angled Triangle"); 
    } 
} 
  
// Driver Code  
public static void main (String []args) 
{ 
    int a, b, c; 
    a = 2; 
    b = 2;  
    c = 2; 
      
    // Function Call 
    checkTypeOfTriangle(a, b, c); 
} 
} 
  
// This code is contribute by chitranayal 

