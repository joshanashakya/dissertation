

// Java implementation of the above approach  
class GfG  
{  
  
// Function to find minimum removals  
static int findCount(int arr[], int n)  
{  
    // Count odd numbers  
    int countOdd = 0;  
    for (int i = 0; i < n; i++)  
        if (arr[i] % 2 == 1)  
            countOdd++;  
  
    // If the counter is odd return 0  
    // otherwise return 1  
    if (countOdd % 2 == 0)  
        return 1;  
    else
        return 0;  
}  
  
// Driver Code  
public static void main(String[] args)  
{  
    int arr[] = { 1, 2, 3, 5, 1 };  
    int n = arr.length; 
  
    System.out.println(findCount(arr, n));  
} 
}  
  
// This code is contributed by 
// Prerna Saini 

