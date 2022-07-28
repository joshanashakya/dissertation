

// Java program to find   
// the maximum height of 
// Pyramidal Arrangement  
// of array values 
import java.io.*; 
  
class GFG 
{ 
static int MaximumHeight(int []a,  
                         int n) 
{ 
          
    int result = 1; 
    for (int i = 1; i <= n; ++i)  
    { 
  
        // Just checking whether 
        // ith level is possible 
        // or not if possible then  
        // we must have atleast  
        // (i*(i+1))/2 elements  
        // in the array 
        int y = (i * (i + 1)) / 2; 
  
        // updating the result  
        // value each time 
        if (y < n)  
            result = i; 
          
        // otherwise we have  
        // exceeded n value 
        else
            break; 
    } 
    return result; 
} 
  
// Driver Code  
public static void main (String[] args) 
{ 
    int []arr = { 40, 100, 20, 30 }; 
    int n = arr.length; 
    System.out.println(MaximumHeight(arr, n)); 
} 
} 
  
// This code is contributed by ajit 

