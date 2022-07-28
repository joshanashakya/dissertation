

// java program to replace two elements 
// with equal values with one greater. 
public class GFG { 
      
    // Function to replace consecutive equal  
    // elements 
    static void replace_elements(int arr[], int n) 
    { 
        int pos = 0; // Index in result 
      
        for (int i = 0; i < n; i++) { 
            arr[pos++] = arr[i]; 
      
            while (pos > 1 && arr[pos - 2] ==  
                                  arr[pos - 1]) 
            { 
                pos--; 
                arr[pos - 1]++; 
            } 
        } 
      
        // to print new array 
        for (int i = 0; i < pos; i++) 
            System.out.print( arr[i] + " "); 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 6, 4, 3, 4, 3, 3, 5 }; 
        int n = arr.length; 
        replace_elements(arr, n); 
    } 
} 
  
// This code is contributed by Sam007 

