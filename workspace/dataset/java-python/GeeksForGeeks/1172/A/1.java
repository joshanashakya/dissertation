

// Java program to check whether 
// the number is divisible by 
// 8 or not using bitwise operator 
import java.io.*; 
import java.util.*; 
  
class GFG  
{ 
    // function to check number is 
    // div by 8 or not using bitwise 
    // operator 
    static boolean Div_by_8(int n) 
    { 
        return (((n >> 3) << 3) == n); 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 16; 
        if (Div_by_8(n)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
          
    } 
} 
  
// This code is contributed by  Gitanjali 

