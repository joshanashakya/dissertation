

// Recursive Java program to 
// multiply array elements 
class GFG 
{ 
    static int arr[] = {1, 2, 3, 4, 5, 6}; 
      
    // Method to calculate the product  
    // of the array using recursion 
    static int multiply(int a[], int n) 
    { 
        // Termination condition 
        if (n == 0) 
            return(a[n]); 
        else
            return (a[n] * multiply(a, n - 1)); 
    } 
      
    // Driver Code 
    public static void main(String[] args)  
    { 
        // Method call to  
        // calculate product 
        System.out.println(multiply(arr,  
                       arr.length - 1)); 
        } 
} 

