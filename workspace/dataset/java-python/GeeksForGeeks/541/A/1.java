

// Java implementation to count the  
// number of pairs whose difference  
// is atmost K in an array  
import java.util.*; 
  
class GFG  
{ 
  
    // Function to count the  
    // number of pairs whose difference  
    // is atmost K in an array  
    static int countPairs(int arr[], int k) 
    {  
          
        // Sorting the Array  
        Arrays.sort(arr) ; 
          
        // Variable to store the count of pairs  
        // whose difference is atmost K  
        int pair = 0; 
        int index = 0; 
          
        // Loop to consider the consecutive  
        // pairs of the array  
        while(index < arr.length -1) 
        { 
              
            // if Pair found increment  
            // the index by 2  
            if (arr[index + 1] - arr[index] <= k){  
                pair += 1 ; 
                index += 2 ; 
            } 
            else{ 
                index += 1; 
            } 
        } 
        return pair ; 
      
    } 
      
    // Driver Code  
    public static void main (String[] args) { 
        int arr[] = {1, 4, 3, 7, 5} ; 
        int k = 2; 
          
        // Function Call  
        int count = countPairs(arr, k) ; 
        System.out.println(count);  
    } 
} 
  
// This code is contributed by AnkitRai01 

