

// Java implementation to find all 
// Pairs possible from the given Array 
class GFG{ 
   
// Function to print all possible 
// pairs from the array 
static void printPairs(int arr[], int n) 
{ 
   
    // Nested loop for all possible pairs 
    for (int i = 0; i < n; i++) { 
        for (int j = 0; j < n; j++) { 
            System.out.print("(" +  arr[i]+ ", "
                 + arr[j]+ ")"
                + ", "); 
        } 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2 }; 
    int n = arr.length; 
   
    printPairs(arr, n); 
   
} 
} 
  
// This code is contributed by PrinciRaj1992 

