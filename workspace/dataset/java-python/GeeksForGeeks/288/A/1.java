

// Java implementation of the above approach 
import java.util.*; 
class GFG 
{ 
  
// Function to return the minimum possible 
// value of the last element left after 
// performing the given operations 
static int getMin(int arr[], int n) 
{ 
    int minVal = Arrays.stream(arr).min().getAsInt(); 
    return minVal; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 5, 3, 1, 6, 9 }; 
    int n = arr.length; 
  
    System.out.println(getMin(arr, n)); 
} 
}  
  
// This code is contributed by 29AjayKumar 

