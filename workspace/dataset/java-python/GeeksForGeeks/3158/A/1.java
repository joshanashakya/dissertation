

// Java code to Find the integer points (x, y) 
// with Manhattan distance atleast N 
import java.util.*; 
  
class GFG 
{ 
  
static class pair 
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 
  
// Java function to find all possible point 
static Vector<pair> FindPoints(int n) 
{ 
    Vector<pair> v = new Vector<pair>(); 
  
    // Find all 4 corners of the square 
    // whose side length is n 
    v.add(new pair( 0, 0 )); 
    v.add(new pair( 0, n )); 
    v.add(new pair( n, 0 )); 
    v.add(new pair( n, n )); 
  
    // If n is even then the middle point 
    // of the square will be an integer, 
    // so we will take that point 
    if (n % 2 == 0) 
        v.add(new pair( n / 2, n / 2 )); 
  
    return v; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 8; 
  
    Vector<pair > v = FindPoints(N); 
  
    // Printing all possible points 
    for (pair i : v)  
    { 
        System.out.print("(" + i.first + ", " +  
                               i.second + ") "); 
    } 
} 
} 
  
// This code is contributed by PrinciRaj1992 

