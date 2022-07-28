

// Java program to find n numbers from given  
// ordered pairwise sum of them. 
class GFG { 
      
    // Note : n is not size of array, but number   
    // of elements whose pairwise sum is stored 
    // in arr[] 
    static void findNumbers(int arr[], int n) 
    { 
          
        int num[] = new int[n]; 
      
        // b-a is calculated here 
        int b_minus_a = arr[n-1] - arr[1]; 
      
        // b is calculated here 
        num[1] = (arr[0] + b_minus_a) / 2; 
      
        // a is calculated here 
        num[0] = arr[0] - num[1]; 
      
        // to calculate all the other numbers 
        for (int i = 1; i <= (n - 2); i++) 
            num[i+1] = arr[i] - num[0]; 
      
        // display the numbers 
        System.out.print("Numbers are: "); 
          
        for (int i = 0; i < n; i++) 
            System.out.print(num[i] + " "); 
    } 
      
    // Driver method 
    public static void main(String[] args) 
    { 
          
        int arr[] = {13, 10, 14, 9, 17, 21, 
                             16, 18, 13, 17}; 
                               
        // n is not size of array, but number of 
        // elements whose pairwise sum is stored 
        // in arr[] 
        int n = 5;  
          
        findNumbers(arr, n); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

