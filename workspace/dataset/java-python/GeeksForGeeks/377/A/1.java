

// Java implementation of above approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find the sum pairs 
// that occur the most 
static void findSumPairs(int a[], int n) 
{ 
    // Hash-table 
    Map<Integer,Integer> mpp = new HashMap<>(); 
    for (int i = 0; i < n - 1; i++)  
    { 
        for (int j = i + 1; j < n; j++)  
        { 
  
            // Keep a count of sum pairs 
            mpp.put(a[i] + a[j],mpp.get(a[i] + a[j])==null?1:mpp.get(a[i] + a[j])+1); 
        } 
    } 
  
    // Variables to store 
    // maximum occurrence 
    int occur = 0; 
  
    // Iterate in the hash table 
    for (Map.Entry<Integer,Integer> entry : mpp.entrySet()) 
    { 
        if (entry.getValue() > occur) 
        { 
            occur = entry.getValue(); 
        } 
    } 
  
    // Print all sum pair which occur 
    // maximum number of times 
    for (Map.Entry<Integer,Integer> entry : mpp.entrySet()) 
    { 
        if (entry.getValue() == occur) 
            System.out.println(entry.getKey()); 
    } 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    int a[] = { 1, 8, 3, 11, 4, 9, 2, 7 }; 
    int n = a.length; 
    findSumPairs(a, n); 
} 
} 
  
/* This code is contributed by PrinciRaj1992 */

