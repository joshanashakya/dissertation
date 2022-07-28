

// Java implementation of the above approach. 
class GFG 
{ 
      
static int MAX = 100002; 
  
// Function to print no of unique elements 
// in specified suffix for each query. 
static void printUniqueElementsInSuffix(int[] arr, 
                                int n, int[] q, int m) 
{ 
  
    // aux[i] stores no of unique elements in arr[i..n] 
    int []aux = new int[MAX]; 
  
    // mark[i] = 1 if i has occurred  
    // in the suffix at least once. 
    int []mark = new int[MAX]; 
  
    // Initialization for the last element. 
    aux[n - 1] = 1; 
    mark[arr[n - 1]] = 1; 
  
    for (int i = n - 2; i >= 0; i--)  
    { 
        if (mark[arr[i]] == 0)  
        { 
            aux[i] = aux[i + 1] + 1; 
            mark[arr[i]] = 1; 
        } 
        else 
        { 
            aux[i] = aux[i + 1]; 
        } 
    } 
  
    for (int i = 0; i < m; i++)  
    { 
        System.out.println(aux[q[i] - 1] ); 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
  
    int arr[] = { 1, 2, 3, 4, 1, 2, 3, 4, 10000, 999 }; 
    int n = arr.length; 
    int q[] = { 1, 3, 6 }; 
    int m = q.length; 
    printUniqueElementsInSuffix(arr, n, q, m); 
} 
} 
  
// This code is contributed by Princi Singh 

