

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find elements of vector 
static void Print(Vector<Integer> ans) 
{ 
    for (Integer i : ans) 
        System.out.print(i + " "); 
} 
  
// Function to find the lexicographically largest 
// permutation that satisfies the given condition 
static void Permutation(int a[], int n) 
{ 
    int flag = 0, pos = 0; 
  
    // To store the required ans 
    Vector<Integer> ans = new Vector<Integer>(); 
  
    // Sort the array 
    Arrays.sort(a); 
  
    for (int i = 2; i < n; i++)  
    { 
  
        // If need to make arranagement 
        if (a[i] != a[i - 1] + __gcd(a[i - 1], 
                                     a[i - 2])) 
        { 
            flag = 1; 
            pos = i; 
            break; 
        } 
    } 
  
    // If possible then check for lexographically 
    // larger permutation (if any possible) 
    if (flag == 0) 
    { 
  
        // If larger arrangement is possible 
        if (a[1] == a[0] + __gcd(a[0],  
                                 a[n - 1]))  
        { 
            ans.add(a[n - 1]); 
            for (int i = 0; i < n - 1; i++) 
                ans.add(a[i]); 
  
            Print(ans); 
            return; 
        } 
  
        // If no other arrangement is possible 
        else 
        { 
            for (int i = 0; i < n; i++) 
                ans.add(a[i]); 
  
            Print(ans); 
            return; 
        } 
    } 
  
    // Need to re-arrange the array 
    else 
    { 
  
        // If possible, place at first position 
        if (a[1] == a[0] + __gcd(a[pos], a[0]))  
        { 
            flag = 0; 
            for (int i = n - 1; i > pos + 2; i--) 
            { 
  
                // If even after one arrangement  
                // its impossible to get 
                // the required array 
                if (a[i] != a[i - 1] + __gcd(a[i - 1],  
                                             a[i - 2])) 
                { 
                    flag = 1; 
                    break; 
                } 
            } 
  
            if (flag == 0 & pos < n - 1)  
            { 
  
                // If it is not possible to get 
                // the required array 
                if (a[pos + 1] 
                    != a[pos - 1] + __gcd(a[pos - 1],  
                                          a[pos - 2])) 
                    flag = 1; 
            } 
  
            if (flag == 0 & pos < n - 2)  
            { 
  
                // If it is not possible to get 
                // the required array 
                if (a[pos + 2] 
                    != a[pos + 1] + __gcd(a[pos - 1],  
                                          a[pos + 1])) 
                    flag = 1; 
            } 
  
            // If it is possible to get the answer 
            if (flag == 0) 
            { 
                ans.add(a[pos]); 
                for (int i = 0; i < n; i++) 
                    if (i != pos) 
                        ans.add(a[i]); 
  
                Print(ans); 
                return; 
            } 
        } 
    } 
  
    ans.add(-1); 
    Print(ans); 
} 
  
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);      
}  
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 4, 6, 2, 8, 8 }; 
    int n = a.length; 
  
    Permutation(a, n); 
    } 
} 
  
// This code is contributed  
// by PrinciRaj1992  

