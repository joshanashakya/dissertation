

// JAVA Code to check if a number 
// can be written as sum of three 
// consecutive integers. 
import java.util.*; 
  
class GFG  
{ 
    // function to check if a number  
    // can be written as sum of three 
    // consecutive integers. 
    static void checksum(int n) 
    { 
        // if n is multiple of 3 
        if (n % 3 == 0) 
            System.out.println( n / 3 - 1 + " "
                 + n / 3 + " " + (n / 3 + 1)); 
       
        // else print "-1". 
        else
            System.out.println("-1"); 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int n = 6; 
        checksum(n); 
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal. 

