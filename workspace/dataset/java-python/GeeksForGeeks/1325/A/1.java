

// Java program to check 
// if the first and last digit of number N 
// is prime and their sum is less than K 
  
import java.lang.*; 
  
public class crazy_number { 
  
    // Get the First digit of the number 
    public static int first(int n) 
    { 
        int a = n; 
        int c = 1; 
        while (a != 0) { 
            a /= 10; 
            c = c * 10; 
        } 
        c = c / 10; 
        int fi = n / c; 
        return fi; 
    } 
  
    // Check if the digit is prime or not 
    public static boolean prime(int n) 
    { 
  
        switch (n) { 
        case 2: 
            return true; 
  
        case 3: 
            return true; 
  
        case 5: 
            return true; 
  
        case 7: 
            return true; 
  
        default: 
            return false; 
        } 
    } 
  
    // Function to Check if the first 
    // and last digit of number N is prime 
    // and their sum is less than K 
    public static void check(int n, int k) 
    { 
  
        // Last digit of the number 
        int l = n % 10; 
  
        // First digit of number 
        int f = first(n); 
  
        // Check if these are prime 
        boolean lp = prime(l); 
        boolean fp = prime(f); 
  
        // If they are prime 
        if (lp && fp) { 
  
            // Check if they are less than k or not 
            if (l + f < k) 
                System.out.println("Yes"); 
            else
                System.out.println("No"); 
        } 
        else { 
            System.out.println("No"); 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
  
        // Test case 1 
        int n = 322223; 
        int k = 10; 
  
        check(n, k); 
  
        // Test case 2 
        n = 62531561; 
        k = 15; 
  
        check(n, k); 
    } 
} 

