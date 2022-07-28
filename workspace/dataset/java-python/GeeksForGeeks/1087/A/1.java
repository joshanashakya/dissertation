

// Java implementation of above approach 
class GFG 
{ 
  
// Utility function to print the 
// elements of the array 
static void printArr(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
} 
  
// Function to generate and print 
// the required array 
static void generateArr(int A[], int n) 
{ 
    int []B = new int[n]; 
  
    // For every element of the array 
    for (int i = 0; i < n; i++)  
    { 
  
        // To store the count of elements 
        // on the left that the current 
        // element divides 
        int cnt = 0; 
        for (int j = 0; j < i; j++) 
        { 
            if (A[j] % A[i] == 0) 
                cnt++; 
        } 
        B[i] = cnt; 
    } 
  
    // Print the generated array 
    printArr(B, n); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int A[] = { 3, 5, 1 }; 
    int n = A.length; 
  
    generateArr(A, n); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

