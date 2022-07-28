

// Java program to find product of array 
// elements. 
class GFG{ 
  
    static int product(int ar[], int n) 
    { 
        int result = 1; 
        for (int i = 0; i < n; i++) 
            result = result * ar[i]; 
        return result; 
    } 
       
    // driver code for the above program 
    public static void main(String[] args) 
    { 
        int ar[] = { 1, 2, 3, 4, 5 }; 
        int n = ar.length; 
        System.out.printf("%d", product(ar, n)); 
    } 
} 
  
// This code is contributed by Smitha Dinesh Semwal 

