

// Java program to find minimum difference  
// between groups of highest and lowest  
// sums.  
import java.util.Arrays;  
import java.io.*; 
  
class GFG { 
static int  CalculateMax(int  arr[], int n)  
{  
    // Sorting the whole array.  
    Arrays.sort(arr);  
      
    int min_sum = arr[0] + arr[1];  
    int max_sum = arr[n-1] + arr[n-2];  
  
    return (Math.abs(max_sum - min_sum));  
}  
  
// Driver code 
      
    public static void main (String[] args) { 
  
    int arr[] = { 6, 7, 1, 11 };  
    int n = arr.length;  
    System.out.println (CalculateMax(arr, n));  
    } 
} 

