

// Java Program to find the 
// nth centered octadecagonal 
// number 
import java.io.*; 
  
class GFG  
{ 
      
// centered octadecagon function 
static int center_octadecagon_num(int n) 
{ 
          
    // Formula to calculate nth 
    // centered octadecagonal number 
    return 9 * n * n - 9 * n + 1; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
int n = 3; 
System.out.print(n + "th centered " +  
           "octadecagonal number : "); 
System.out.println(center_octadecagon_num(n)); 
  
n = 13; 
System.out.print(n + "th centered " +  
           "octadecagonal number : "); 
System.out.println(center_octadecagon_num(n)); 
} 
} 
  
// This code is contributed by ajit 

