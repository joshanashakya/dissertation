

// Java Program to check if 
// number is divisible by 12 
  
import java.io.*; 
  
class GFG { 
static boolean isDvisibleBy12(String num) 
{ 
    // if number greater then 3 
    if (num.length() >= 3) {  
   
        // fiind last digit 
        int d1 = (int)num.charAt(num.length() - 1); 
   
        // no is odd 
        if (d1 % 2 != 0) 
            return false; 
   
        // find second last digit 
        int d2 = (int)num.charAt(num.length() - 2); 
   
        // find sum of all digits 
        int sum = 0; 
        for (int i = 0; i < num.length(); i++) 
            sum += num.charAt(i);             
           
        return (sum % 3 == 0 && 
               (d2 * 10 + d1) % 4 == 0);             
    } 
       
    else { 
           
        // if number is less then 
        // or equal to 100 
        int number = Integer.parseInt(num); 
        return (number % 12 == 0); 
    } 
  
// driver function 
} 
    public static void main (String[] args) { 
  
    String num = "12244824607284961224";   
    if (isDvisibleBy12(num)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
          
    } 
} 
  
// This code is contributed by Gitanjali. 

