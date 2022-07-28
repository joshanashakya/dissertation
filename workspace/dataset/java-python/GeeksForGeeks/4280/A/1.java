

// Java code to check divisibility by 3 
  
import java.util.*;  
import java.io.*; 
  
class GFG { 
    // Function to check the divisibility 
static String check( int k, int d0, int d1) 
{  
  
    // Cycle 
     int s = (2 * (d0 + d1)) % 10 +  
                (4 * (d0 + d1)) % 10 +  
                (8 * (d0 + d1)) % 10 +  
                (6 * (d0 + d1)) % 10; 
      
    // no of residual terms 
    int a = (k - 3) % 4; 
      
    // sum of residual terms 
    int x=0; 
      
    switch(a) 
    { 
      
        // if no of residue term = 0 
        case 0: 
      
        x = 0; 
        break; 
      
        // if no of residue term = 1 
        case 1: 
      
        x = (2 * (d0 + d1)) % 10; 
        break;  
  
        // if no of residue term = 2 
        case 2: 
      
        x = (2 * (d0 + d1)) % 10 +  
            (4 * (d0 + d1)) % 10; 
        break; 
      
        // if no of residue term = 3 
        case 3: 
      
        x = (2 * (d0 + d1)) % 10 + 
            (4 * (d0 + d1)) % 10 +  
            (8 * (d0 + d1)) % 10; 
          
        break; 
    } 
      
    // sum of all digits 
     int sum = d0 + d1 + (((k - 3) / 4) * s + x ); 
      
    // divisibility check 
    if(sum % 3 == 0) 
        return "YES"; 
    return "NO"; 
} 
  
    //Code driven 
      
    public static void main (String[] args) { 
          
     int k, d0, d1; 
      
    k = 13; 
    d0 = 8; 
    d1 = 1; 
      
    System.out.println (check(k, d0, d1)); 
          
    k = 5;  
    d0 = 3;  
    d1 = 4; 
          
        System.out.println (check(k, d0, d1)); 
          
    } 
} 

