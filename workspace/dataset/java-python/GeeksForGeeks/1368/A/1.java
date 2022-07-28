

// A Simple Java program to  
// find count of all numbers  
// that multiples 
import java.io.*; 
  
class GFG  
{ 
      
// Returns count of all numbers  
// smaller than or equal to n  
// and multples of 3 or 7 or both 
static int countMultiples(int n) 
{ 
    int res = 0; 
    for (int i = 1; i <= n; i++) 
    if (i % 3 == 0 || i % 7 == 0) 
        res++; 
  
    return res; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    System.out.print("Count = "); 
    System.out.println(countMultiples(25)); 
} 
} 
  
// This code is contributed by m_kit 

