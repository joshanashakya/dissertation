

// Java Program to find the minimum number of 
// adjacent swaps to arrange similar items together 
import java.util.*; 
  
class solution 
{ 
  
// Function to find minimum swaps 
static int findMinimumAdjacentSwaps(int arr[], int N) 
{ 
    // visited array to check if value is seen already 
    boolean[] visited = new boolean[N + 1]; 
  
    int minimumSwaps = 0; 
    Arrays.fill(visited,false); 
     
  
    for (int i = 0; i < 2 * N; i++) { 
  
        // If the arr[i] is seen first time 
        if (visited[arr[i]] == false) { 
            visited[arr[i]] = true; 
  
            // stores the number of swaps required to 
            // find the correct position of current 
            // element's partner 
            int count = 0; 
  
            for (int j = i + 1; j < 2 * N; j++) { 
  
                // Increment count only if the current 
                // element has not been visited yet (if is 
                // visited, means it has already been placed 
                // at its correct position) 
                if (visited[arr[j]] == false) 
                    count++; 
  
                // If current element's partner is found 
                else if (arr[i] == arr[j]) 
                    minimumSwaps += count; 
            } 
        } 
    } 
    return minimumSwaps; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int arr[] = { 1, 2, 3, 3, 1, 2 }; 
    int N = arr.length; 
    N /= 2; 
  
    System.out.println(findMinimumAdjacentSwaps(arr, N)); 
      
} 
} 
// This code is contributed by 
// Sanjit_Prasad 

