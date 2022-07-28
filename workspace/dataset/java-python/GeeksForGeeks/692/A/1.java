

// JAVA program to find the minimum possible of the expression  
// by choosing exactly K(? N) integers form given array arr   
import java.util.*; 
  
class GFG{  
  
// Function to find the minimum possible of the expression  
// by choosing exactly K(? N) integers form given array arr  
static int minimumValue(int arr[], int n, int k)  
{  
  
    // Sorting the array for least k element selection  
    Arrays.sort(arr);  
  
    int answer = 0;  
  
    // Select first k elements from sorted array  
    for (int i = 0; i < k; i++)  
        answer += arr[i] * arr[i];  
  
    // Return value of solved expression  
    return answer * (2 * k - 2);  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int arr[] = { 4, 21, 5, 3, 8 }, k = 3;  
      
    int n = arr.length;  
      
    // Function call  
    System.out.print(minimumValue(arr, n, k));      
} 
}  
  
// This code is contributed by Rajput-Ji 

