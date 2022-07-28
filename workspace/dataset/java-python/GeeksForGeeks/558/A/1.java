

// Java program to find 10's complement 
import java.io.*; 
  
class GFG  
{ 
// Function to find 10's complement 
static int complement(int num) 
{ 
    int i, len = 0, temp, comp; 
      
    // Calculating total 
    // digits in num 
    temp = num; 
    while(true) 
    { 
        len++; 
        num = num / 10; 
        if(Math.abs(num) == 0) 
            break;  
    } 
      
    // restore num 
    num = temp; 
      
    // calculate 10's complement 
    comp = (int)Math.pow(10,len) - num; 
      
    return comp; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    System.out.println(complement(25)); 
      
    System.out.println(complement(456)); 
} 
} 
  
// This code is contributed  
// by chandan_jnu. 

