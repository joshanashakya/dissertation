

import java.util.Arrays;  
  
class GFG  
{ 
  
// function to count for each element in 1st array, 
// elements less than or equal to it in 2nd array 
static int countEleLessThanOrEqual(int arr1[], int arr2[],  
                            int m, int n) 
{ 
    // Run two loops to count  
    // First loop to traverse the first array 
    // Second loop to traverse the second array 
    for (int i = 0; i < m; i++ ) 
    { 
        int count = 0; 
          
        // Traverse through second array 
        for (int j = 0; j < n; j++ ) 
            if (arr2[j] <= arr1[i]) 
                count++; 
                System.out.print(count + " "); 
    }  
    return m;  
} 
  
  
// Driver method  
public static void main(String[] args)  
{  
      
    int arr1[] = {1, 2, 3, 4, 7, 9}; 
    int arr2[] = {0, 1, 2, 1, 1, 4}; 
    countEleLessThanOrEqual(arr1, arr2, arr1.length, arr2.length); 
} 
} 
  
// This code is contributed by shivanisinghss2110 

