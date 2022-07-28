

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// returns th maximum element of the array 
static int max_element(int a[] ) 
{ 
    int m = a[0]; 
    for(int i = 0; i < a.length; i++) 
    m = Math.max(a[i], m); 
    return m; 
} 
  
// Function that returns true if arr[] 
// contains all the divisors of some integer 
static boolean checkDivisors(int a[], int n) 
{ 
  
    // Maximum element from the array 
    int X = max_element(a); 
  
    // Vector to store divisors 
    // of the maximum element i.e. X 
    Vector<Integer> b=new Vector<Integer>(); 
  
    // Store all the divisors of X 
    for (int i = 1; i * i <= X; i++)  
    { 
        if (X % i == 0)  
        { 
            b.add(i); 
            if (X / i != i) 
                b.add(X / i); 
        } 
    } 
  
    // If the lengths of a[] 
    // and b are different 
    // return false 
    if (b.size() != n) 
        return false; 
  
    // Sort a[] and b 
    Arrays.sort(a); 
    Collections.sort(b); 
  
    for (int i = 0; i < n; i++) 
    { 
  
        // If divisors are not 
        // equal return false 
        if (b.get(i) != a[i]) 
            return false; 
    } 
  
    return true; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 8, 1, 2, 12, 48, 
                6, 4, 24, 16, 3 }; 
  
    int N = arr.length; 
  
    if (checkDivisors(arr, N)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
  
}  
} 
  
// This code is contributed by Arnab Kundu 

