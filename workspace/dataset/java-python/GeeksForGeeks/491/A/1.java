

// Java program to find maximum difference 
// between frequency of any two element 
// such that element with greater frequency 
// is also greater in value. 
import java.util.*; 
class GFG  
{ 
  
// Return the maximum difference between 
// frequencies of any two elements such that 
// element with greater frequency is also 
// greater in value. 
static int maxdiff(int arr[], int n) 
{ 
    Map<Integer, Integer> freq = new HashMap<>(); 
  
    // Finding the frequency of each element. 
    for (int i = 0; i < n; i++) 
        freq.put(arr[i],  
        freq.get(arr[i]) == null ? 1 :  
        freq.get(arr[i]) + 1); 
  
    int ans = 0; 
    for (int i = 0; i < n; i++) 
    { 
        for (int j = 0; j < n; j++) 
        { 
            // finding difference such that element 
            // having greater frequency is also 
            // greater in value. 
            if (freq.get(arr[i]) > freq.get(arr[j]) && 
                arr[i] > arr[j]) 
                ans = Math.max(ans, freq.get(arr[i]) -  
                                    freq.get(arr[j])); 
            else if (freq.get(arr[i]) < freq.get(arr[j]) && 
                    arr[i] < arr[j] ) 
                ans = Math.max(ans, freq.get(arr[j]) -  
                                    freq.get(arr[i])); 
        } 
    } 
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 1, 3, 2, 3, 2 }; 
    int n = arr.length; 
  
    System.out.println(maxdiff(arr, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

