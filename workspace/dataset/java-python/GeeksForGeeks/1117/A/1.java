

// Java program to Find the minimum sum 
// of given array after applying given operation. 
  
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
// Function to Find the minimum sum 
// of given array after applying given operation. 
static int MinSum(int []a, int n) 
{ 
    // to store final gcd value 
    int gcd = a[0]; 
  
    // get gcd of the whole array 
    for (int i = 1; i < n; i++) 
        gcd = __gcd(a[i], gcd); 
  
    return n * gcd; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int a[] = { 20, 14, 6, 8, 15 }; 
  
    int n = a.length; 
  
    // function call 
    System.out.println(MinSum(a, n)); 
    } 
} 
// This code is contributed by anuj_67.. 

