

// Java program to find the size of the smallest 
// subset with the maximum value of Bitwise OR 
import java.util.*; 
  
class solution 
{ 
      
  // Comparator to sort array in descending order 
boolean compare(int a, int b) 
{ 
    return a > b; 
} 
  
// Function to find the size of the smallest 
// subset with the maximum value of Bitwise OR 
static int findMaxOR(int []arr, int n) 
{ 
    // sort the array in decreasing 
    // order 
    int temp; 
     for (int i = 0; i < n; i++)  
  
        { 
  
            for (int j = i + 1; j < n; j++)  
  
            { 
  
                if (arr[i] < arr[j])  
  
                { 
  
                    temp = arr[i]; 
  
                    arr[i] = arr[j]; 
  
                    arr[j] = temp; 
  
                } 
  
            } 
  
        } 
    // Maximum element in the set 
    int maxOR = arr[0]; 
  
    int count = 1; 
  
    for (int i = 1; i < n; i++) { 
        // if bitwise or with the next element is 
        // greater than current value 
        if ((maxOR | arr[i]) > maxOR) 
        // then add this element in the set and 
        // update the current maxOR value 
        { 
            maxOR = maxOR | arr[i]; 
            count++; 
        } 
    } 
  
    return count; 
} 
  
// Driver Code 
public static void main(String arrgs[]) 
{ 
    int []arr = { 5, 1, 3, 4, 2 }; 
    int n = arr.length; 
  
    System.out.println(findMaxOR(arr, n)); 
  
} 
    
} 
// This code is contributed by 
// Surendra_Gangwar 

