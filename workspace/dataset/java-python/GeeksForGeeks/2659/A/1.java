

// Java implementation of the approach  
import java.util.*;  
  
class GFG  
{  
  
// Function to return the count of all  
// the subsequences with negative product  
static int cntSubSeq(int arr[], int n)  
{  
    // To store the count of positive  
    // elements in the array  
    int pos_count = 0;  
  
    // To store the count of negative  
    // elements in the array  
    int neg_count = 0;  
  
    int result;  
  
    for (int i = 0; i < n; i++)  
    {  
  
        // If the current element  
        // is positive  
        if (arr[i] > 0)  
            pos_count++;  
  
        // If the current element  
        // is negative  
        if (arr[i] < 0)  
            neg_count++;  
    }  
  
    // For all the positive  
    // elements of the array  
    result = (int) Math.pow(2, pos_count);  
  
    // For all the negative  
    // elements of the array  
    if (neg_count > 0)  
        result *= Math.pow(2, neg_count - 1);  
    else
        result = 0 ; 
  
    return result;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int arr[] = { 3,-4, -1, 6 };  
    int n = arr.length;  
  
    System.out.print(cntSubSeq(arr, n));  
}  
}  
  
// This code is contributed by ANKITKUMAR34  

