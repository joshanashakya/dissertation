

// Java program to count number of ways to break 
// a number in three parts 
import java.io.*; 
  
class GFG { 
    // Function to count number of ways 
    // to make the given number n 
    static long count_of_ways(long n) 
    { 
        long count = 0; 
        for (int i = 0; i <= n; i++) 
            for (int j = 0; j <= n; j++) 
                for (int k = 0; k <= n; k++) 
                    if (i + j + k == n) 
                        count++; 
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

