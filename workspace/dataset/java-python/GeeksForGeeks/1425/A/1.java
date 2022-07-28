

// Program to find nth 
// Centered pentagonal number 
import java.io.*; 
  
class GFG  
{ 
      
// centered pentagonal 
// number function 
static int centered_pentagonal_Num(int n) 
{ 
    // Formula to calculate  
    // nth Centered pentagonal  
    // number and return it  
    // into main function. 
  
    return (5 * n * n - 5 * n + 2) / 2; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
int n = 7; 
System.out.print(n + "th Centered " +  
              "pentagonal number: "); 
System.out.println(centered_pentagonal_Num(n)); 
} 
} 
  
// This code is contributed by anuj_67. 

