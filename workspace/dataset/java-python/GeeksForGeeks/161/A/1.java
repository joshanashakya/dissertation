

// java program to find the 
// Largest Coprime Divisor 
import java.io.*; 
  
class GFG { 
    // Recursive function to return gcd 
    // of a and b 
    static int gcd(int a, int b) 
    { 
        // Everything divides 0 
        if (a == 0 || b == 0) 
            return 0; 
  
        // base case 
        if (a == b) 
            return a; 
  
        // a is greater 
        if (a > b) 
            return gcd(a - b, b); 
        return gcd(a, b - a); 
    } 
  
    // function to find largest 
    // coprime divisor 
    static int cpFact(int x, int y) 
    { 
        while (gcd(x, y) != 1) { 
            x = x / gcd(x, y); 
        } 
        return x; 
    } 
  
    // divisor code 
    public static void main(String[] args) 
    { 
        int x = 15; 
        int y = 3; 
        System.out.println(cpFact(x, y)); 
        x = 14; 
        y = 28; 
        System.out.println(cpFact(x, y)); 
        x = 7; 
        y = 3; 
        System.out.println(cpFact(x, y)); 
    } 
} 
  
// This article is contributed by vt_m. 

