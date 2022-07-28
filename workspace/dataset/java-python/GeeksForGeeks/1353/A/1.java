

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the minimum required index 
static int minIndex(int arr[], int n, int pos) 
{ 
    int num = arr[pos]; 
  
    // Start from arr[pos - 1] 
    int i = pos - 1; 
    while (i >= 0)  
    { 
        if (arr[i] != num) 
            break; 
        i--; 
    } 
  
    // All elements are equal 
    // from arr[i + 1] to arr[pos] 
    return i + 1; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 2, 1, 1, 1, 5, 2 }; 
    int n = arr.length; 
    int pos = 4; 
  
    System.out.println(minIndex(arr, n, pos)); 
} 
} 
  
// This code is contributed by Code_Mech. 

