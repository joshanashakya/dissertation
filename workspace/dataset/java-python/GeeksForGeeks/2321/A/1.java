

// Java program to check  
// a large number divisible 
// by 41 or not 
import java.io.*; 
  
class GFG  
{ 
// Check if a number is  
// divisible by 41 or not 
static boolean DivisibleBy41(int first,  
                             int second,  
                             int c, int n) 
{ 
    // array to store  
    // all the digits 
    int digit[] = new int[n]; 
  
    // base values 
    digit[0] = first; 
    digit[1] = second; 
  
    // calculate remaining 
    // digits 
    for (int i = 2; i < n; i++) 
        digit[i] = (digit[i - 1] * c + 
                    digit[i - 2]) % 10; 
  
    // calculate answer 
    int ans = digit[0]; 
    for (int i = 1; i < n; i++) 
        ans = (ans * 10 +  
               digit[i]) % 41; 
  
    // check for  
    // divisibility 
    if (ans % 41 == 0) 
        return true; 
    else
        return false; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int first = 1, second = 2, c = 1, n = 3; 
  
    if (DivisibleBy41(first, second, c, n)) 
        System.out.println("YES"); 
    else
        System.out.println("NO"); 
} 
} 
  
// This code is contributed  
// by akt_mit 

