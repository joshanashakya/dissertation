

// Program to check if the  
// binary string contains  
// m consecutive 1's or 0's 
import java.io.*; 
  
class GFG  
{ 
  
// Function that checks if 
// the binary string contains m 
// consecutive 1's or 0's 
static boolean check(String s,  
                     int m) 
{ 
    // length of binary string 
    int l = s.length(); 
  
    // counts zeros 
    int c1 = 0; 
  
    // counts 1's 
    int c2 = 0; 
  
    for (int i = 0; i < l; i++) 
    { 
  
        if (s.charAt(i) == '0')  
        { 
            c2 = 0; 
              
        // count consecutive 0's 
            c1++;  
        } 
        else 
        { 
            c1 = 0; 
  
            // count consecutive 1's 
            c2++;  
        } 
        if (c1 == m || c2 == m) 
            return true; 
    } 
    return false; 
} 
  
// Drivers Code 
  
public static void main (String[] args)  
{ 
    String s = "001001"; 
    int m = 2; 
      
    // function call 
    if (check(s, m)) 
        System.out.println( "YES"); 
    else
        System.out.println( "NO"); 
} 
} 
  
// This code is contributed by anuj_67. 

