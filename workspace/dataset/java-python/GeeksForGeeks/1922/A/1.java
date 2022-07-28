

// Java program to find remainder without 
// using modulo operator 
import java.io.*; 
  
class GFG { 
  
    // This function returns remainder of 
    // num/divisor without using % (modulo) 
    // operator 
    static int getRemainder(int num, int divisor) 
    { 
        return (num - divisor * (num / divisor)); 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args) 
    { 
  
        // print 100 % 0; 
        System.out.println(getRemainder(100, 7)); 
    } 
} 
  
// This code is contributed by Sam007. 

