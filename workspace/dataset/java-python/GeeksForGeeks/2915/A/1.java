

// Java program to find Nth  
// term of the series:  
// 1 + 2 + 6 + 15 + 31 + 56 + ...  
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
// calculate Nth term of given series  
static double Nth_Term(int n)  
{  
    return (2 * Math.pow(n, 3) - 3 *  
                Math.pow(n, 2) + n + 6) / 6;  
}  
  
// Driver code  
static public void main (String args[]) 
{ 
    int N = 8;  
    System.out.println(Nth_Term(N));  
} 
} 
  
// This code is contributed 
// by Akanksha Rai 

