

// Java program to find the number of words  
// of X vowels and Y consonants can be  
// formed from M vowels and N consonants 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
      
    // Function to returns factorial of n 
    static int fact(int n)  
    {  
        int res = 1;  
        for (int i = 2; i <= n; i++)  
            res = res * i;  
        return res;  
    }  
      
    // Function to find nCr  
    static int nCr(int n, int r)  
    {  
        return fact(n) / (fact(r) *  
                          fact(n - r));  
    }  
      
    // Function to find the number of words  
    // of X vowels and Y consonants can be  
    // formed from M vowels and N consonants  
    static int NumberOfWays(int X, int Y,  
                            int M, int N)  
    {  
        return fact(X + Y) * nCr(M, X) *  
                             nCr(N, Y);  
    }  
      
      
    // Driver code 
    public static void main (String[] args)  
                  throws java.lang.Exception 
    { 
        int X = 2, Y = 2, M = 3, N = 3;  
      
        // Function call  
        System.out.println(NumberOfWays(X, Y, M, N));          
    } 
} 
  
// This code is contributed by Nidhiva 

