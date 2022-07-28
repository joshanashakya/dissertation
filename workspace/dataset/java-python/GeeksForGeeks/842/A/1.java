

// Java implementation of 
// above approach 
import java.io.*; 
  
class GFG 
{ 
      
// Function to calculate the time 
static float Time(float arr[], int n, 
                  float Emptypipe) 
{ 
    float fill = 0; 
    for (int i = 0; i < n; i++) 
        fill += 1 / arr[i]; 
  
    fill = fill - (1 / (float)Emptypipe); 
  
    return 1 / fill; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    float arr[] = { 12, 14 }; 
    float Emptypipe = 30; 
    int n = arr.length; 
      
    System.out.println((int)(Time(arr, n,  
                        Emptypipe)) + " Hours"); 
} 
} 
  
// This code is contributed 
// by inder_verma. 

