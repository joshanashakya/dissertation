

// Java program to check if n 
// is perfect square or not 
  
public class GFG { 
  
    // This function returns true if n 
    // is perfect square, else false 
    static boolean isPerfectSquare(int n) 
    { 
        // sum is sum of all odd numbers. i is 
        // used one by one hold odd numbers 
        for (int sum = 0, i = 1; sum < n; i += 2) { 
            sum += i; 
            if (sum == n) 
                return true; 
        } 
        return false; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
  
        if (isPerfectSquare(35)) 
            System.out.println("Yes"); 
        else
            System.out.println("NO"); 
  
        if (isPerfectSquare(49)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by Sam007 

