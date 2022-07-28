

// Java program to find product of elements 
// at even and odd index positions separately 
  
class GFG 
{ 
      
    // Function to calculate product 
    static void EvenOddProduct(int arr[], int n) 
    { 
        int even = 1; 
        int odd = 1; 
      
        for (int i = 0; i < n; i++) { 
      
            // Loop to find even, odd product 
            if (i % 2 == 0) 
                even *= arr[i]; 
            else
                odd *= arr[i]; 
        } 
      
        System.out.println("Even Index Product : " + even); 
        System.out.println("Odd Index Product : " + odd); 
    } 
      
    // Driver Code 
    public static void main(String []args) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int n = arr.length; 
      
        EvenOddProduct(arr, n); 
              
    } 
  
   // This code is contributed by ihritik 
} 

