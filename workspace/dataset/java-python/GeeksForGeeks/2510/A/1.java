

// Java program to print the  
// sum of the consecutive elements. 
  
class Arraysum { 
      
    // Function to print Alternatesum 
    static void pairwiseSum(int arr[], int n) 
    { 
        int sum = 0; 
        for (int i = 0; i + 1 < n; i++)  
        { 
            // adding the alternate numbers 
            sum = arr[i] + arr[i + 1]; 
            System.out.print(sum + " "); 
        } 
    } 
      
    /*driver function to test function*/
    public static void main(String[] args) 
    { 
      
        int arr[] = {4, 10, 15, 5, 6}; 
        int n = arr.length; 
        pairwiseSum(arr, n); 
    } 
} 

