

// Java program to find if number is  
// a Special Two-Digit number or not 
import java.io.*; 
  
class GFG 
{  
    // function to find if number  
    // is special or not 
    static void specialNumber(int n) 
    {  
        // Checking whether entered  
        // number is 2 digit or not 
        if(n < 10 || n > 99)  
            System.out.println("Invalid Input! " + 
                           "Number should have " +  
                                 "2 digits only"); 
        else
        {  
            // Finding the first digit 
            int first = n / 10;  
              
            // Finding the last digit 
            int last = n % 10;  
              
            // Finding the sum  
            // of the digits 
            int sum = first + last;  
              
            // Finding the product 
            // of the digits 
            int pro = first * last;  
              
            if((sum + pro) == n) 
            { 
                System.out.println(n + " is a Special" +  
                                   " Two-Digit Number"); 
            } 
            else
            { 
                System.out.println(n +" is Not a Special" +  
                                      " Two-Digit Number"); 
            } 
        } 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 59;  
        specialNumber(n); 
    } 
} 

