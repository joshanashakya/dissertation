

// Java program to find if  
// given binary string can 
// become divisible by  
// 64 after removing some bits 
import java.io.*; 
  
class GFG  
{ 
    // function to check if it is possible 
    // to make it a multiple of 64. 
    static boolean checking(String s) 
    { 
        // counter to count 0's 
        int c = 0;  
          
        // length of the string 
        int n = s.length();  
      
        // loop which traverses right to left and 
        // calculates the number of zeros before 1. 
        for (int i = n - 1; i >= 0; i--)  
        { 
            if (s.charAt(i) == '0') 
                c++; 
      
            if (c >= 6 && s.charAt(i) == '1') 
                return true; 
        } 
      
        return false; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        String s = "100010001"; 
        if (checking(s)) 
            System.out.println ( "Possible"); 
        else
            System.out.println ( "Not possible"); 
      
    } 
} 
  
// This code  is contributed by vt_m 

