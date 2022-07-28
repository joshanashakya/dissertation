

// Java program to find the maximum number 
// of elements that can be added to a set 
// such that it is the absolute difference 
// of 2 elements already in the set 
   
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
  
class GFG{ 
      
static int __gcd(int a, int b) { 
   if (b==0) return a; 
   return __gcd(b,a%b); 
} 
// Function to find the maximum number 
// of elements that can be added to a set 
// such that it is the absolute difference 
// of 2 elements already in the set 
static int maxNewElements(int []a, int n) 
{ 
    int gcd = a[0]; 
   
    int mx = a[0]; 
   
    for (int i = 1; i < n; i++) { 
        gcd = __gcd(gcd, a[i]); 
        mx = Math.max(mx, a[i]); 
    } 
   
    int total_terms = mx / gcd; 
   
    return total_terms - n; 
} 
   
// Driver Code 
public static void main(String args[]) 
{ 
    int a[] = { 4, 6, 10 }; 
    int n = a.length; 
    System.out.print(maxNewElements(a, n)); 
} 
} 

