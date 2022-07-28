

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{  
      
// Function that returns X  
static int findX(int a[], int n)  
{  
    // Sort the given array  
    Arrays.sort(a);  
      
    // Get the possible X  
    int x = a[0] * a[n - 1];  
      
    // Container to store divisors  
    Vector<Integer> vec = new Vector<Integer>();  
      
    // Find the divisors of a number  
    for (int i = 2; i * i <= x; i++) 
    {  
      
        // Check if divisor  
        if (n % i == 0)  
        {  
            vec.add(i);  
            if ((n / i) != i)  
                vec.add(n / i);  
        }  
    }  
      
    // Check if a and vec have  
    // same elements in them  
    if (vec.size() == n)  
    {  
        int i = 0;  
        for (int it : vec) 
        {  
            if (a[i++] != it)  
                return -1;  
        }  
    }  
      
    return x;  
}  
      
// Driver code  
public static void main(String[] args)  
{  
    int a[] = { 2, 5, 4, 10 };  
    int n = a.length;  
    System.out.print(findX(a, n));  
}  
}  
  
// This code is contributed by 29AjayKumar 

