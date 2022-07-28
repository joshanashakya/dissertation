

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the final number 
// obtained after performing the 
// given operation 
static int finalNum(int arr[], int n) 
{ 
  
    // Find the gcd of the array elements 
    int result = 0; 
    for (int i = 0; i < n; i++)  
    { 
        result = __gcd(result, arr[i]); 
    } 
    return result; 
} 
  
static int __gcd(int a, int b)  
{  
    return b == 0? a:__gcd(b, a % b);      
}  
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 9, 6, 36 }; 
    int n = arr.length; 
  
    System.out.print(finalNum(arr, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

