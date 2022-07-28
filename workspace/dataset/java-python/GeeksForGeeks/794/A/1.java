

//Java implementation of the approach 
  
import java.io.*; 
  
class GFG { 
      
// Boolean function to check 
// distinct digits of a number 
static boolean checkDistinct(int x) 
{ 
    // Take last digit 
    int last = x % 10; 
  
    // Check if all other digits 
    // are same as last digit 
    while (x >0) { 
        if (x % 10 != last) 
            return false; 
  
        // Remove last digit 
        x = x / 10; 
    } 
  
    return true; 
} 
  
// Function to return the count of integers that 
// are composed of a single distinct digit only 
static int findCount(int L, int R) 
{ 
    int count = 0; 
  
    for (int i = L; i <= R; i++) { 
  
        // If i has single distinct digit 
        if (checkDistinct(i)) 
            count += 1; 
    } 
  
    return count; 
} 
  
// Driver code 
    public static void main (String[] args) { 
  
          
        int L = 10, R = 50; 
        System.out.println (findCount(L, R)); 
    } 
//This code is contributed by ajit.     
} 

