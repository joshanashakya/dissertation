

// Java implementation to find the 
// Largest element before every element 
// of an array such that  
// it is less than the element 
import java.util.*; 
  
class GFG{ 
   
// Function to find the 
// Largest element before 
// every element of an array 
static void findMaximumBefore(int arr[], 
                         int n){ 
       
    // Loop to iterate over every 
    // element of the array 
    for (int i = 0; i < n; i++) { 
   
        int currAns = -1; 
            
        // Loop to find the maximum smallest 
        // number before the element arr[i] 
        for (int j = i - 1; j >= 0; j--) { 
            if (arr[j] > currAns && 
                   arr[j] < arr[i]) { 
                currAns = arr[j]; 
            } 
        } 
        System.out.print(currAns+ " "); 
    } 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 4, 7, 6, 8, 5 }; 
   
    int n = arr.length; 
   
    // Function Call 
    findMaximumBefore(arr, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

