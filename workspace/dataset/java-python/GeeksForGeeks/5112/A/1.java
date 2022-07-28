

// Java program to find a sorted subsequence of 
// size 3 using constant space 
  
class GFG 
{ 
    // A function to fund a sorted subsequence of size 3 
    static void find3Numbers(int arr[], int n) 
    { 
        // Initializing small and large(second smaller) 
        // by INT_MAX 
        int small = +2147483647, large = +2147483647; 
        int i; 
        for (i = 0; i < n; i++) 
        { 
            // Update small for smallest value of array 
            if (arr[i] <= small) 
                small = arr[i]; 
      
            // Update large for second smallest value of 
            // array after occurrence of small 
            else if (arr[i] <= large) 
                large = arr[i]; 
      
            // If we reach here, we found 3 numbers in 
            // increasing order : small, large and arr[i] 
            else
                break; 
        } 
      
        if (i == n) 
        { 
            System.out.print("No such triplet found"); 
            return; 
        } 
      
        // last and second last will be same, but first 
        // element can be updated retrieving first element 
        // by looping upto i 
        for (int j = 0; j <= i; j++) 
        { 
            if (arr[j] < large) 
            { 
                small = arr[j]; 
                break; 
            } 
        } 
      
        System.out.print(small+" "+large+" "+arr[i]); 
        return; 
    } 
      
    // Driver program 
    public static void main(String arg[]) 
    { 
        int arr[] = {5, 7, 4, 8}; 
        int n = arr.length; 
        find3Numbers(arr, n); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

