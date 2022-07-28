

// Java program to find the 
// length of longest alternate 
// subsequence 
class GFG { 
  
// LAS[i][pos] array to find 
// the length of LAS till 
// index i by including or 
// excluding element arr[i] 
// on the basis of value of pos 
static int LAS[][] = new int[1000][2]; 
  
static int solve(int arr[], int n, int i,int pos) 
{ 
      
    // Base Case 
    if (i == n) 
        return 0; 
  
    if (LAS[i][pos]== 1) 
        return LAS[i][pos]; 
  
    int inc = 0, exc = 0; 
  
    // If current element is 
    // positive and pos is 1 
    // Include the current element 
    // and change pos to 0 
    if (arr[i] > 0 && pos == 1) { 
        pos = 0; 
  
        // Recurr for the next 
        // iteration 
        inc = 1 + solve(arr, n, i + 1, pos); 
    } 
  
    // If current element is 
    // negative and pos is o 
    // Include the current element 
    // and change pos to 1 
    else if (arr[i] < 0 && pos == 0) { 
        pos = 1; 
  
        // Recurr for the next 
        // iteration 
        inc = 1 + solve(arr, n, i + 1, pos); 
    } 
  
    // If current element is 
    // excluded, reccur for 
    // next iteration 
    exc = solve(arr, n, i + 1, pos); 
  
    LAS[i][pos] = Math.max(inc, exc); 
  
    return LAS[i][pos]; 
} 
  
// Driver's Code 
public static void main (String[] args)  
{ 
    int arr[] = { -1, 2, 3, 4, 5, -6, 8, -99 }; 
    int n = arr.length; 
  
    // Print LAS 
    System.out.println(Math.max(solve(arr, n, 0, 0),solve(arr, n, 0, 1))); 
} 
} 
  
// This code is contributed by AnkitRai01 

