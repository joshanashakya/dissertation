

// Java program to Find the Ratio  
// of number of Elements in two Arrays  
// from their individual and combined Average  
class GFG  
{ 
    static int gcd(int a, int b)  
    {  
        if (b == 0)  
            return a;  
        return gcd(b, a % b);  
          
    } 
      
    // function to find the ratio  
    // of number of array elements  
    static void FindRatio(int a, int b, int c)  
    {  
        int up = Math.abs(b - c);  
        int down = Math.abs(c - a);  
      
        // calculating GCD of them  
        int g = gcd(up, down);  
      
        // make neumarator and  
        // denominator coprime  
        up /= g;  
        down /= g;  
      
        System.out.println(up + ":" + down);  
    }  
      
    // Driver Code  
    public static void main (String[] args)  
    {  
        int a = 4, b = 10, c = 6;  
      
        FindRatio(a, b, c);  
    }  
} 
  
// This code is contributed by AnkitRai01 

