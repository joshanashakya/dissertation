

// Naive Java program to find surpasser count 
// of each element in array 
import java.io.*; 
  
class GFG { 
  
    // Function to find surpasser count of  
    // each element in array 
    static void findSurpasser(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
        { 
              
            // stores surpasser count for  
            // element arr[i] 
            int count = 0; 
            for (int j = i + 1; j < n; j++) 
                if (arr[j] > arr[i]) 
                    count++; 
      
            System.out.print(count +" "); 
        } 
    } 
      
    /* Function to print an array */
    static void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " "); 
              
        System.out.println(); 
    } 
      
    // Driver program to test above functions 
    public static void main (String[] args)  
    { 
        int arr[] = { 2, 7, 5, 3, 0, 8, 1 }; 
        int n = arr.length; 
      
        System.out.println("Given array is "); 
        printArray(arr, n); 
      
        System.out.println("Surpasser Count of"
                               + " array is "); 
        findSurpasser(arr, n); 
    } 
} 
  
// This code is contributed by Anuj_67. 

