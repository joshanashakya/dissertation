

// Java program to find count of multiples 
// of 3 and 5 in {1, 2, 3, ..n} 
import java .io.*; 
class GFG { 
      
    static long countOfMultiples(long n) 
    { 
          
        // Add multiples of 3 and 5.  
        // Since common multples are 
        // counted twice in n/3 + n/15,  
        // subtract common multiples 
        return (n/3 + n/5 - n/15); 
    } 
      
    // Driver Code 
    static public void main (String[] args) 
    { 
        System.out.println(countOfMultiples(6)); 
        System.out.println(countOfMultiples(16)); 
    } 
} 
  
// This code is contributed by anuj_67. 

