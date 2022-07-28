

// Java Implementation of above approach  
import java.util.*; 
  
class GFG  
{ 
      
// Function to return the minimum 
// deletions required 
static int MinDeletion(int a[], int n) 
{ 
  
    // To store the frequency of 
    // the array elements 
    Map<Integer,Integer> mp = new HashMap<>(); 
  
    // Store frequency of each element 
    for (int i = 0 ; i < n; i++) 
    { 
        if(mp.containsKey(a[i])) 
        { 
            mp.put(a[i], mp.get(a[i])+1); 
        } 
        else
        { 
            mp.put(a[i], 1); 
        } 
    } 
    // To store the minimum deletions required 
    int ans = 0; 
  
    for (Map.Entry<Integer,Integer> i : mp.entrySet())  
    { 
  
        // Value 
        int x = i.getKey(); 
  
        // It's frequency 
        int frequency = i.getValue(); 
  
        // If number less than or equal 
        // to it's frequency 
        if (x <= frequency)  
        { 
  
            // Delete extra occurrences 
            ans += (frequency - x); 
        } 
  
        // Delete every occurrence of x 
        else
            ans += frequency; 
    } 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 2, 3, 2, 3, 4, 4, 4, 4, 5 }; 
    int n = a.length; 
  
    System.out.println(MinDeletion(a, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

