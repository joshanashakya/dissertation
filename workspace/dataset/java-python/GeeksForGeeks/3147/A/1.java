

// Java program to compute 
// sum of digits in number. 
import java.io.*; 
  
class GFG { 
    
    /* Function to get sum of digits */ 
    static int sumDigits(int no) 
    { 
        return no == 0 ? 0 : no%10 +  
                  sumDigits(no/10) ; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
    System.out.println(sumDigits(687)); 
    } 
} 
  
// This code is contributed by Gitanjali 

