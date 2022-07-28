

// Java program to find the sum of 
// the addition of all possible subsets. 
import java.util.*; 
class GFG 
{ 
static int last; 
  
// Function to perform step-1 
static Vector<Integer>  
       findSubset(Vector<Integer> temp, int k) 
{ 
    Vector<Integer> ans = new Vector<Integer>(); 
  
    // Iterate from left till 0 
    // till we get a bit set of K numbers 
    for (int i = last; i >= 0; i--) 
    { 
        int cnt = 0; 
  
        // Count the numbers whose 
        // i-th bit is set 
        for (Integer it : temp) 
        { 
            int bit = it & (1 << i); 
            if (bit > 0) 
                cnt++; 
        } 
  
        // If the array has numbers>=k 
        // whose i-th bit is set 
        if (cnt >= k)  
        { 
            for (Integer it : temp)  
            { 
                int bit = it & (1 << i); 
                if (bit > 0) 
                    ans.add(it); 
            } 
  
            // Update last 
            last = i - 1; 
  
            // Return the new set of numbers 
            return ans; 
        } 
    } 
    return ans; 
} 
  
// Function to find the maximum '&' value 
// of K elements in subsequence 
static int findMaxiumAnd(int a[], int n, int k) 
{ 
    last = 31; 
      
    // Temporary arrays 
    Vector<Integer> temp1 = new Vector<Integer>(); 
    Vector<Integer> temp2 = new Vector<Integer>();; 
  
    // Initially temp = arr 
    for (int i = 0; i < n; i++)  
    { 
        temp2.add(a[i]); 
    } 
  
    // Iterate till we have >=K elements 
    while ((int)temp2.size() >= k)  
    { 
  
        // Temp array 
        temp1 = temp2; 
  
        // Find new temp array if 
        // K elements are there 
        temp2 = findSubset(temp2, k); 
    } 
  
    // Find the & value 
    int ans = temp1.get(0); 
    for (int i = 0; i < k; i++) 
        ans = ans & temp1.get(i); 
  
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int a[] = { 255, 127, 31, 5, 24, 37, 15 }; 
    int n = a.length; 
    int k = 4; 
  
    System.out.println(findMaxiumAnd(a, n, k)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

