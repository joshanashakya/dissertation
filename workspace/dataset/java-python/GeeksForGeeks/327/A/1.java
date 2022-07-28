

// Java code to implement the above approach 
class GFG 
{ 
  
static int CountSubSet(int arr[], int n, int X) 
{ 
    // N stores total number of subsets 
    int N = (int) Math.pow(2, n); 
    int count = 0; 
  
    // Generate each subset one by one 
    for (int i = 0; i < N; i++) 
    { 
  
        // Check every bit of i 
        for (int j = 0; j < n; j++)  
        { 
  
            // if j'th bit of i is set, 
            // check arr[j] with X 
            if ((i & (1 << j)) != 0) 
                if (arr[j] == X) 
                    count += 1; 
        } 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 4, 5, 6, 7 }; 
    int X = 5; 
    int n = arr.length; 
  
    System.out.print(CountSubSet(arr, n, X)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

