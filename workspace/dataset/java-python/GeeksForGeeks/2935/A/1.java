

// Java implementation of the approach  
import java.math.*; 
  
class GFG 
{ 
    public static int findGCD(int a, int b) 
    { 
        if(b == 0) 
            return a; 
        else
            return findGCD(b, a % b); 
    } 
  
    // Function to find the required numbers  
    static void findNumbers(int a, int b)  
    {  
      
        // GCD of the given numbers  
        int gcd = findGCD(a, b); 
          
        // Printing the requried numbers  
        System.out.println((a / gcd) + " " +  
                           (b / gcd)); 
          
    }  
  
    // Driver code  
    public static void main(String[] args)  
    {  
        int a = 12, b = 16;  
      
        findNumbers(a, b);  
    } 
} 
  
// This code is contributed by Naman_Garg 

