

// Java code to find the 
// minimum number of mails 
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
      
// Function returns the min  
// no of mails required 
static double MinimumMail(int n, 
                          int k,  
                          int x) 
{ 
    // Using the formula  
    // derived above 
    double m = (n - 1) + Math.ceil((n - 1) * 1.0 / x) * (n - 1) 
                       + Math.ceil(n * 1.0 / x) * (k - n); 
  
    return m; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    // no of questions 
    int N = 4; 
  
    // no of students 
    int K = 9; 
  
    // maximum no of questions 
    // a mail can hold 
    int X = 2; 
  
    // Calling function 
    System.out.print((int)MinimumMail(N, K, X) + "\n"); 
} 
} 

