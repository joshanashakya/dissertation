

// Java program to calculate  
// Root Mean Square  
  
class GFG  
{ 
  
// Function that Calculate Root 
// Mean Square  
static float rmsValue(int arr[], int n) 
{ 
    int square = 0; 
    float mean = 0; 
    float root = 0; 
  
    // Calculate square. 
    for(int i = 0; i < n; i++) 
    { 
        square += Math.pow(arr[i], 2); 
    } 
      
    // Calculate Mean.  
    mean = (square / (float) (n)); 
  
    // Calculate Root. 
    root = (float)Math.sqrt(mean); 
  
    return root; 
} 
  
  
// Driver Code  
public static void main(String args[]) 
{ 
    int arr[] = { 10, 4, 6, 8}; 
      
    int n = arr.length; 
      
    System.out.println(rmsValue(arr, n)); 
} 
} 
  
// This code is contributed by ANKITRAI1 

