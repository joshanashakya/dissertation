

  // Java implementation of above approach 
  
import java.io.*; 
  
class GFG { 
  
  
static float successiveChange(int arr[], int N) 
{ 
    float var1, var2, result = 0; 
  
    var1 = arr[0]; 
    var2 = arr[1]; 
  
    // Calculate successive change of 1st 2 change 
    result = var1 + var2 + ((var1 * var2) / 100); 
  
    // Calculate successive change 
    // for rest of the value 
    for (int i = 2; i < N; i++) 
        result = result + arr[i] + ((result * arr[i]) / 100); 
  
    return result; 
} 
  
// Driver code 
    public static void main (String[] args) { 
        int []arr = {10, 20, 30, 10}; 
    int N = arr.length; 
  
    // Calling function 
    float result = successiveChange(arr, N); 
  
    System.out.println("Percentage change is = " + result + " %"); 
    } 
} 
// This code is contributed by shs.. 

