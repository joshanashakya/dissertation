

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
static int recamanGenerator(int arr[], int n) 
{ 
    // First term of the sequence is always 0 
    arr[0] = 0; 
  
    // Fill remaining terms using recursive 
    // formula 
    for (int i = 1; i <= n; i++)  
    { 
        int temp = arr[i - 1] - i; 
        int j; 
  
        for (j = 0; j < i; j++) 
        { 
  
            // If arr[i-1] - i is negative or 
            // already exists 
            if ((arr[j] == temp) || temp < 0)  
            { 
                temp = arr[i - 1] + i; 
                break; 
            } 
        } 
  
        arr[i] = temp; 
    } 
    return 0; 
} 
  
// Function that returns minimum changes required 
static int recamanArray(int arr[], int n) 
{ 
      
  
    // Set to store first n Recaman numbers 
    Set<Integer> s=new HashSet<Integer>(); 
  
    // Generate and store 
    // first n Recaman numbers 
    int recaman[]=new int[n+1]; 
    recamanGenerator(recaman, n); 
  
    // Insert first n Recaman numbers to set 
    for (int i = 0; i < n; i++) 
        s.add(recaman[i]); 
  
    for (int i = 0; i < n; i++)  
    { 
        // If current element of the array 
        // is present in the set 
        if (s.contains(arr[i])) 
            s.remove(arr[i]); 
    } 
  
    // Return the remaining number of 
    // elements in the set 
    return s.size(); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
  
    int arr[] = { 7, 11, 20, 4, 2, 1, 8, 6 }; 
    int n = arr.length; 
  
    System.out.print( recamanArray(arr, n)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

