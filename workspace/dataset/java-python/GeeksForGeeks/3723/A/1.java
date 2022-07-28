

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
      
// Function to return the count of required pairs 
static int get_unordered_pairs(int []a, int n) 
{ 
    // To store unique elements 
    ArrayList<Integer> vs = new ArrayList<Integer>(); 
  
    // To hash elements with their frequency 
    int[] m = new int[maximum(a)+1]; 
  
    // Store frequencies in m and all distinct 
    // items in vs 
    for (int i = 0; i < n; i++)  
    { 
        m[(int)a[i]]++; 
        if (m[a[i]] == 1) 
            vs.add(a[i]); 
    } 
  
    // Traverse through distinct elements 
    int number_of_pairs = 0; 
    for (int i = 0; i < vs.size(); i++)  
    { 
  
        // If current element is greater than 
        // its frequency in the array 
        if (m[(int)vs.get(i)] < (int)vs.get(i)) 
            continue; 
  
        // If element is equal to its frequency, 
        // a pair of the form (x, x) is formed. 
        else if (m[(int)vs.get(i)] == (int)vs.get(i)) 
            number_of_pairs += 1; 
  
        // If element is less than its frequency 
        else
        { 
            number_of_pairs += 1; 
            for (int j = (int)vs.get(i) + 1; j <= m[(int)vs.get(i)]; j++) 
            { 
                if (m[j] >= (int)vs.get(i)) 
                    number_of_pairs += 1; 
            } 
        } 
    } 
    return number_of_pairs; 
} 
static int maximum(int []arr) 
{ 
    int max = Integer.MIN_VALUE; 
    for(int i = 0; i < arr.length; i++) 
    { 
        if(arr[i] > max) 
        { 
            max = arr[i]; 
        } 
    } 
    return max; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
  
    int []arr = { 3, 3, 2, 2, 2 }; 
    int n = arr.length; 
    System.out.println(get_unordered_pairs(arr, n)); 
} 
} 
  
// This code is contributed by mits 

