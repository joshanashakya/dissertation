

// Java implementation of the approach 
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
  
// Function that returns true if 
// x is a perfect square 
static boolean isPerfectSquare(double x) 
{ 
    // Find floating point value of 
    // square root of x 
    double sr = Math.sqrt(x); 
  
    // If square root is an integer 
    return ((sr - Math.floor(sr)) == 0); 
} 
  
// Function that returns true if 
// n is a Fibonacci Number 
static boolean isFibonacci(int n) 
{ 
    return isPerfectSquare(5 * n * n + 4) ||  
           isPerfectSquare(5 * n * n - 4); 
} 
  
// Function to return the count of distinct pairs 
// from the given array such that the sum of the 
// pair elements is a Fibonacci number 
static int totalPairs(int a[], int b[],  
                      int n, int m) 
{ 
    // Set is used to avoid duplicate pairs 
    List<pair> s = new LinkedList<>(); 
  
    for (int i = 0; i < n; i++)  
    { 
        for (int j = 0; j < m; j++)  
        { 
  
            // If sum is a Fibonacci number 
            if (isFibonacci(a[i] + b[j]) == true)  
            { 
                  
                if (a[i] < b[j]) 
                { 
                    if(checkDuplicate(s, new pair(a[i], b[j]))) 
                        s.add(new pair(a[i], b[j])); 
                } 
                else
                { 
                    if(checkDuplicate(s, new pair(b[j], a[i]))) 
                        s.add(new pair(b[j], a[i])); 
                } 
            } 
        } 
    } 
  
    // Return the size of the set 
    return s.size(); 
} 
  
static boolean checkDuplicate(List<pair> pairList,  
                                    pair newPair) 
{ 
    for(pair p: pairList) 
    { 
        if(p.first == newPair.first &&  
           p.second == newPair.second) 
            return false; 
    } 
    return true; 
}  
  
// Driver code 
public static void main(String[] args)  
{ 
    int a[] = { 99, 1, 33, 2 }; 
    int b[] = { 1, 11, 2 }; 
    int n = a.length; 
    int m = b.length; 
  
    System.out.println(totalPairs(a, b, n, m)); 
} 
}  
  
// This code is contributed by Rajput-Ji 

