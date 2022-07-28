

// Java program to find the largest  
// numbers that leads to same 
// remainder when divides given 
// three sorted numbers 
  
class GFG { 
      
//__gcd function 
static int gcd(int a, int b)  
{ 
    if (a == 0) 
    return b; 
    return gcd(b % a, a); 
} 
  
// function return number which divides these 
// three number and leaves same remainder . 
static int sameRemainder(int a, int b, int c)  
{ 
    // We find the differences of all three pairs 
    int a1 = (b - a), b1 = (c - b), c1 = (c - a); 
  
    // Return GCD of three differences. 
    return gcd(a1, gcd(b1, c1)); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a = 62, b = 132, c = 237; 
    System.out.println(sameRemainder(a, b, c)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

