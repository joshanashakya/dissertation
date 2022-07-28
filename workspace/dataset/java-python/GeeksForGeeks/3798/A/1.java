

// Java implementation of the above approach  
class GfG  
{ 
  
// Function to find the sum  
// of minimum of all subarrays  
static int findMinSum(int arr[], int n)  
{  
  
    int sum = 0;  
    for (int i = 0; i < n; i++)  
        sum += arr[i] * (n - i);  
  
    return sum;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int arr[] = { 3, 5, 7, 8 };  
    int n = arr.length;  
  
    System.out.println(findMinSum(arr, n));  
} 
}  
  
// This code is contributed by Prerna Saini 

