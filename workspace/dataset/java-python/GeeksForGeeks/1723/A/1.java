

// Java Program to find nth 
// centered hexadecagonal number 
import java.io.*; 
  
class GFG  
{ 
    // centered hexadecagonal function 
    static int center_hexadecagonal_num(int n) 
    { 
        // Formula to calculate nth 
        // centered hexadecagonal number 
        return 8 * n * n -  
               8 * n + 1; 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 2; 
        System.out.print(n + "th centered " + 
                    "hexadecagonal number: "); 
        System.out.println(center_hexadecagonal_num(n)); 
          
        n = 12; 
        System.out.print(n + "th centered " + 
                    "hexadecagonal number: "); 
        System.out.println(center_hexadecagonal_num(n)); 
    } 
} 
  
// This code is contributed by ajit. 

