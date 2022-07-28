

// Java program to find number of ways 
// in which number expressed as 
// product of two different factors 
public class Main { 
  
    // To count number of ways in which 
    // number expressed as product 
    // of two different numbers 
    static int countWays(int n) 
    { 
        // To store count of such pairs 
        int count = 0; 
  
        // Counting number of pairs 
        // upto sqrt(n) - 1 
        for (int i = 1; i * i < n; i++) 
            if (n % i == 0) 
                count++; 
  
        // To return count of pairs 
        return count; 
    } 
  
    // Driver program to test countWays() 
    public static void main(String[] args) 
    { 
        int n = 12; 
        System.out.println(countWays(n)); 
    } 
} 

