

// Java program to find sum of proper divisor of 
// factorial of a number 
import java.io.*; 
import java.util.*; 
  
public class Division 
{ 
    // function to calculate factorial 
    static int fact(int n) 
    { 
        if (n == 0) 
            return 1; 
        return n*fact(n-1); 
    } 
  
    // function to calculate sum of divisor 
    static int div(int x) 
    { 
        int ans = 0; 
        for (int i = 1; i<= x; i++) 
            if (x%i == 0) 
                ans += i; 
        return ans; 
    } 
  
    // Returns sum of divisors of n! 
    static int sumFactDiv(int n) 
    { 
        return div(fact(n)); 
    } 
  
    // driver program 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println(sumFactDiv(n)); 
    } 
}  

