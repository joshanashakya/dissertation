

// Java program to equally divide n elements 
// into two sets such that second set has 
// maximum distinct elements. 
import java.util.*; 
class Geeks { 
      
static int distribution(int arr[], int n) 
{ 
    Arrays.sort(arr); 
    int count = 1; 
    for (int i = 1; i < n; i++)  
        if (arr[i] > arr[i - 1]) 
            count++; 
      
    return Math.min(count, n / 2); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 1, 1, 2, 1, 3, 4 }; 
    int n = arr.length; 
    System.out.println(distribution(arr, n)); 
} 
} 
  
// This code is contributed by ankita_saini 

