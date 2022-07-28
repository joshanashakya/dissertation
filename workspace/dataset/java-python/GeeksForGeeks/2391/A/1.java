

// Java program to count the minimum  
// number of digits to be removed  
// from a number so that no two  
// consecutive digits are same 
import java.lang.*; 
import java.util.*; 
  
class GFG 
{ 
      
// Function to count the minimum number 
// of digits to remove from a number so  
// that no two consecutive digits are same. 
static int countConsecutive(int n) 
{ 
    // convert the number to string 
    String s = Integer.toString(n); 
  
    // initialize counting variable 
    int count = 0; 
  
    for (int i = 0; i < s.length() - 1; i++) 
          
        // check if two consecutive  
        // digits are same 
        if (s.charAt(i) == s.charAt(i + 1))  
            count++; 
  
    return count; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 44522255; 
    System.out.println(countConsecutive(n)); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai(Abby_akku) 

