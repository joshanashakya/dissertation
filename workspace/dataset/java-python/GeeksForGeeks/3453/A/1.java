

// Java implementation of above approach 
import java.io.*; 
  
class GFG  
{ 
// Recursive function to return 
// gcd of a and b  
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
        return __gcd(a - b, b);  
    return __gcd(a, b - a);  
} 
  
// function that calculates  
// Probability. 
static long Probability(int sum, 
                        int times) 
{ 
  
    float favorable = 0, total = 36; 
    long probability = 0; 
  
    // To calculate favorable outcomes 
    // in thrown of 2 dices 1 times. 
    for (int i = 1; i <= 6; i++)  
    { 
        for (int j = 1; j <= 6; j++) 
        { 
            if ((i + j) == sum) 
                favorable++; 
        } 
    } 
  
    int gcd1 = __gcd((int)favorable,  
                     (int)total); 
  
    // Reduce to simplest Form. 
    favorable = favorable / (float)gcd1; 
    total = total / (float)gcd1; 
  
    // Probability of occurring  
    // sum on 2 dice N times. 
    probability = (long)Math.pow(total, times); 
  
    return probability; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int sum = 7, times = 7; 
      
    System.out.println( "1" + "/" +  
          Probability(sum, times)); 
} 
} 
  
// This code is contributed  
// by inder_verma 

