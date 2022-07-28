

// Java program to check if a number is perfect 
// square without finding the square root 
public class GfG { 
  
    static boolean isPerfectSquare(int n) 
    { 
        for (int i = 1; i * i <= n; i++) { 
  
            // If (i * i = n) 
            if ((n % i == 0) && (n / i == i)) { 
                return true; 
            } 
        } 
        return false; 
    } 
  
    public static void main(String[] args) 
    { 
  
        int n = 36; 
  
        if (isPerfectSquare(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

