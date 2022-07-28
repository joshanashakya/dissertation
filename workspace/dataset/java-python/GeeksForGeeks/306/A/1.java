

// Java  program find the minimum number of consecutive  
// sequences in an array 
  
import java.util.Arrays;  
import java.io.*; 
  
class GFG { 
      
static int countSequences(int arr[], int n) 
{ 
    int count = 1; 
  
    Arrays.sort(arr); 
  
    for (int i = 0; i < n - 1; i++) 
        if (arr[i] + 1 != arr[i + 1]) 
            count++; 
  
    return count; 
} 
  
// Driver program 
    public static void main (String[] args) { 
  
    int arr[] = { 1, 7, 3, 5, 10 }; 
    int n = arr.length; 
    // function call to print required answer 
    System.out.println( countSequences(arr, n)); 
  
    } 
//This code is contributed by ajit.     
} 

