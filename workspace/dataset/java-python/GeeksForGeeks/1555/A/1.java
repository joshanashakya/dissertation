

// Java program to rank of all elements 
// in a Stream in descending order 
// when they arrive 
import java.util.*; 
  
class GFG{ 
      
    // FindRank function to find rank 
    static void FindRank(int arr[], int length) 
    { 
        // Rank of first element is always 1 
        System.out.print("1" + " "); 
          
        // Iterate over array 
        for (int i = 1; i < arr.length; i++) 
        { 
            // As element let say its rank is 1 
            int rank = 1; 
      
            // Element is compared 
            // with previous elements  
            for (int j = 0; j < i; j++) 
            { 
                // If greater than previous 
                // than rank is incremented 
                if(arr[j] > arr[i]) 
                    rank++; 
                  
            } 
              
            // print rank 
            System.out.print(rank + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]){  
          
        // array named arr 
        int arr[] = {88, 14, 69, 30, 29, 89}; 
      
        // length of arr 
        int len = arr.length; 
      
        FindRank(arr, len); 
    } 
} 
  
// This code is contributed by AbhiThakur 

