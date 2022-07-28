

// Java program to make a permutation of numbers 
// from 1 to n using minimum changes. 
import java.util.*; 
  
class GFG  
{ 
static void makePermutation(int []a, int n) 
{ 
    // Store counts of all elements. 
    HashMap<Integer,  
            Integer> count = new HashMap<Integer, 
                                         Integer>(); 
    for (int i = 0; i < n; i++) 
    { 
        if(count.containsKey(a[i])) 
        { 
            count.put(a[i], count.get(a[i]) + 1); 
        } 
        else
        { 
            count.put(a[i], 1); 
        } 
    } 
  
    int next_missing = 1; 
    for (int i = 0; i < n; i++) 
    { 
        if (count.containsKey(a[i]) &&  
            count.get(a[i]) != 1 ||  
            a[i] > n || a[i] < 1)  
        { 
            count.put(a[i], count.get(a[i]) - 1); 
  
            // Find next missing element to put 
            // in place of current element. 
            while (count.containsKey(next_missing)) 
                next_missing++; 
  
            // Replace with next missing and insert  
            // the missing element in hash. 
            a[i] = next_missing; 
            count. put(next_missing, 1); 
        } 
    } 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int A[] = { 2, 2, 3, 3 }; 
    int n = A.length; 
    makePermutation(A, n); 
    for (int i = 0; i < n; i++) 
        System.out.print(A[i] + " "); 
    } 
} 
  
// This code is contributed by PrinciRaj1992  

