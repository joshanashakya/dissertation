

// Java implementation of above approach 
  
import java.io.*; 
  
class GFG { 
// Recursive function to return gcd of a and b  
    static int __gcd(int a, int b)  
    {  
        // Everything divides 0   
        if (a == 0)  
          return b;  
        if (b == 0)  
          return a;  
         
        // base case  
        if (a == b)  
            return a;  
         
        // a is greater  
        if (a > b)  
            return __gcd(a-b, b);  
        return __gcd(a, b-a);  
    }  
        
  
// Function to find the ratio 
 static void printRatio(int a, int b, int c, int d) 
{ 
    if (b * c > a * d) { 
        int temp = c; 
        c =d; 
        d =c; 
        temp =a; 
        a =b; 
        b=temp; 
      
    } 
  
    // LCM of numerators 
    int lcm = (a * c) / __gcd(a, c); 
  
    int x = lcm / a; 
    b *= x; 
  
    int y = lcm / c; 
    d *= y; 
  
    // Answer in reduced form 
    int k = __gcd(b, d); 
    b /= k; 
    d /= k; 
  
    System.out.print( b + ":" + d); 
} 
  
    // Driver code 
    public static void main (String[] args) { 
        int a = 4, b = 3, c = 2, d = 2; 
  
    printRatio(a, b, c, d); 
    } 
} 
    
// This code is contributed by inder_verma.. 

