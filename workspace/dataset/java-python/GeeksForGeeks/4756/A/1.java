

// Java Program to find maximum  
// XOR value of a pair 
import java.util.*; 
import java.lang.*; 
    
public class GfG{ 
       
// Function for finding maximum  
// and value pair 
static int maxAND(int arr[], int n) 
{ 
    int res = 0; 
    for (int i = 0; i < n; i++) 
    for (int j = i + 1; j < n; j++) 
        res = res > ( arr[i] & arr[j]) ? 
              res : ( arr[i] & arr[j]); 
   
    return res; 
} 
   
// driver function 
public static void main(String argc[]) 
{ 
    int arr[] = {4, 8, 6, 2}; 
    int n = arr.length; 
    System.out.println("Maximum AND Value = " + 
                       maxAND(arr,n)); 
} 
} 
  
// This code is contributed by Prerna Saini 

