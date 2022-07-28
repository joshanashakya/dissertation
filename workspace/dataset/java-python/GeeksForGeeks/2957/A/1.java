

// Java program to find  
// highest power of 2  
// smaller than or equal to n. 
import java.io.*; 
  
class GFG  
{ 
static int highestPowerof2(int n) 
{ 
      
    int p = (int)(Math.log(n) /  
                  Math.log(2)); 
    return (int)Math.pow(2, p);  
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 10; 
    System.out.println(highestPowerof2(n)); 
} 
} 
  
// This code is contributed 
// by m_kit 

