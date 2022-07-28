

// Java program to find number  
// whose set bits are maximum  
// among 'l' and 'r' 
import java.io.*; 
  
class GFG  
{ 
      
    // Returns smallest number  
    // whose set bits are  
    // maximum in given range. 
    static int countMaxSetBits(int left,  
                               int right) 
    { 
    while ((left | (left + 1)) <= right) 
        left |= left + 1; 
  
    return left; 
    } 
  
// Driver code 
public static void main (String[] args)  
{ 
    int l = 1; 
    int r = 5; 
    System.out.println(countMaxSetBits(l, r)); 
  
    l = 1; 
    r = 10; 
    System.out.println(countMaxSetBits(l, r)); 
} 
} 
  
// This code is contributed by @ajit 

