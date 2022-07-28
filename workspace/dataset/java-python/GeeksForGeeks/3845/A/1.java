

// Java implementation of the above approach 
class GFG{ 
  
// Function to find the maximum number 
// of 1's before 0 
static void noOfMoves(int arr[], int n) 
{ 
    int cnt = 0; 
    int maxCnt = 0; 
  
    // Traverse the array 
    for (int i = 0; i < n; i++) { 
  
        // If value is 1 
        if (arr[i] == 1) { 
            cnt++; 
        } 
        else { 
  
            // If consecutive 1 followed 
            // by 0, then update the maxCnt 
            if (cnt != 0) { 
                maxCnt = Math.max(maxCnt, cnt); 
                cnt = 0; 
            } 
        } 
    } 
  
    // Print the maximum consecutive 1's 
    // followed by 0 
    System.out.print(maxCnt +"\n"); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 0, 1, 1, 1, 1, 0, 
                0, 1, 1, 0, 0, 1 }; 
    int N = arr.length; 
  
    // Function Call 
    noOfMoves(arr, N); 
    int arr1[] = { 1, 0, 1, 0, 1, 0, 1, 0 }; 
    N = arr1.length; 
  
    // Function Call 
    noOfMoves(arr1, N); 
} 
} 
  
// This code is contributed by 29AjayKumar 

