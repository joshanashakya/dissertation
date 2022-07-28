

// Java program to check if a large 
// number is divisible by 15 
import java.util.*; 
  
class GFG 
{ 
       
// function to check if a large  
// number is divisible by 15 
public static boolean isDivisible(String S) 
{ 
    // length of string 
    int n = S.length(); 
      
    // check divisibility by 5 
    if (S.charAt(n - 1) != '5' &&  
        S.charAt(n - 1) != '0') 
        return false; 
          
    // Sum of digits 
    int sum = 0; 
    for(int i = 0; i < S.length(); i++) 
        sum += (int)S.charAt(i); 
          
        // if divisible by 3 
        if(sum % 3 == 0) 
            return true; 
        else
            return false; 
} 
      
// Driver code 
public static void main (String[] args) 
{ 
    String S = "15645746327462384723984023940239"; 
    if(isDivisible(S) == true) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
          
    String S1 = "15645746327462384723984023940235"; 
    if(isDivisible(S1) == true) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
    } 
} 
          
// This code is contributed  
// by Akanksha Rai(Abby_akku) 

