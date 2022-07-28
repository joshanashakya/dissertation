

// Java program to count number of ways to break 
// a number in three parts 
import java.io.*; 
  
class GFG { 
    // Function to count number of ways 
    // to make the given number n 
    static long count_of_ways(long n) 
    { 
        long count = 0; 
        count = (n + 1) * (n + 2) / 2; 
        return count; 
    } 
  
    // driver program 
    public static void main(String[] args) 
    { 
        long n = 3; 
        System.out.println(count_of_ways(n)); 
    } 
} 
  
// Contributed by Pramod Kumar 

