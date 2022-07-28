

// Java implementation  
// of above approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to calculate the time 
static double calTime(double arr[], int n) 
{ 
    double work = 0; 
    for (int i = 0; i < n; i++) 
        work += 1 / arr[i]; 
  
    return 1 / work; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    double arr[] = { 6.0, 3.0, 4.0 }; 
    int n = arr.length; 
      
    System.out.println(calTime(arr, n) + 
                              " Hours"); 
} 
} 
  
// This code is contributed 
// by inder_verma. 

