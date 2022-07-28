

// Java implementation of efficient approach 
// to count valid pairs. 
import java.*; 
  
public class GFG  
{ 
    // Returns the number of valid pairs 
    static int countPairs (int arr[], int n) 
    {  
        // traversing the array, counting the 
        // number of 2s and greater than 2 
        // in array 
        int twoCount = 0, twoGrCount = 0; 
        for (int i = 0; i<n; i++) 
        { 
          if (arr[i] == 2) 
            twoCount++; 
          else if (arr[i] > 2) 
            twoGrCount++; 
        } 
        return twoCount*twoGrCount + 
        (twoGrCount*(twoGrCount-1))/2; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = {3, 4, 5}; 
        int n = arr.length; 
        System.out.println(countPairs(arr, n)); 
    } 
} 
  
// This code is contributed by Sam007 

