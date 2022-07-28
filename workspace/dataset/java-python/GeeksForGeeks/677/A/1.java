

// Java program return 
// last number after  
// removing every second 
// element from circular 
// array 
import java.util.*; 
  
class Circular{ 
      
    // Utility function to 
    // return last number  
    // number after removing 
    // element 
    public static int removeAlternate(int n) 
    { 
        if (n == 1) 
            return 1; 
  
        if (n % 2 == 0) 
            return 2 * removeAlternate(n / 2) - 1; 
        else
            return 2 * removeAlternate(((n - 1) / 2)) + 1; 
    } 
      
    public static void main(String[] args) 
    { 
        int n = 5; 
        System.out.print(removeAlternate(n)); 
        n = 10; 
        System.out.print("\n"+removeAlternate(n)); 
    } 
} 
  
// This code is contributed by rishabh_jain 

