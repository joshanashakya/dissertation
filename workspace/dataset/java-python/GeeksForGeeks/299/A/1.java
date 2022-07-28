

// Java implementation of the above approach  
class GfG  
{ 
  
// Function to find the sum  
// of minimum of all subsequence  
static int findMinSum(int arr[], int n)  
{  
  
    int occ = n - 1, sum = 0;  
    for (int i = 0; i < n; i++) 
    {  
        sum += arr[i] * (int)Math.pow(2, occ);  
        occ--;  
    }  
  
    return sum;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int arr[] = { 1, 2, 4, 5 };  
    int n = arr.length;  
  
    System.out.println(findMinSum(arr, n));  
} 
}  
  
// This code is contributed by Prerna Saini 

