

// Java program to find absolute difference of elements 
// at even and odd index positions separately 
  
public class GFG{ 
      
    // Function to calculate absolute difference 
    static void EvenOddAbsoluteDifference(int arr[], int n) 
    { 
        int even = 0; 
        int odd = 0; 
      
        for (int i = 0; i < n; i++) { 
      
            // Loop to find even, odd absolute difference 
            if (i % 2 == 0) 
                even = Math.abs(even - arr[i]); 
            else
                odd = Math.abs(odd - arr[i]); 
        } 
      
        System.out.println("Even Index absolute difference : " + even); 
        System.out.println("Odd Index absolute difference : " + odd); 
    } 
  
  
     // Driver Code 
     public static void main(String []args){ 
           
              int arr[] = { 1, 2, 3, 4, 5, 6 }; 
              int n = arr.length; 
  
             EvenOddAbsoluteDifference(arr, n); 
     } 
     // This code is contributed by ANKITRAI1 
} 

