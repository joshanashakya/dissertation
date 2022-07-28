

// Java implementation of the above approach  
class GFG  
{ 
  
// Function to reduce every  
// element to it's half such that  
// the total sum remain zero  
static void half(int arr[], int n) 
{  
    int i; 
      
    // Flag to swith between alternating  
    // odd numbers in the array  
    int flag = 0; 
      
    // For every element of the array  
    for (i = 0; i < n; i++) 
    {  
          
        // If its even then reduce it to half  
        if (arr[i] % 2 == 0 )  
            System.out.print(arr[i] / 2 + " "); 
              
        // If its odd  
        else 
        { 
              
            // Reduce the odd elements  
            // alternatively  
            if (flag == 0) 
            { 
                System.out.print(arr[i] / 2 - 1 + " "); 
                  
                // Switch flag  
                flag = 1; 
            } 
            else
            { 
                int q = arr[i] / 2; 
                System.out.print(q + " "); 
                  
                // Switch flag  
                flag = 0; 
            } 
        } 
    } 
} 
  
// Driver code  
public static void main (String[] args)  
{ 
    int arr[] = {-7, 14, -7}; 
    int len = arr.length; 
    half(arr, len) ; 
} 
} 
  
// This code is contributed by AnkitRai01 

