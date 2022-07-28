

// Java program to find the maximum 
// number of equal numbers in an array 
  
public class GFG{ 
      
    // Function to find the maximum number of 
    // equal numbers in an array 
    static int EqualNumbers(int a[], int n) 
    { 
        // to store sum of elements 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
            sum += a[i]; 
  
        // if sum of numbers is not divisible 
        // by n 
        if (sum % n != 0) 
            return n - 1; 
  
        return n; 
    } 
  
      
    // Driver code 
    public static void main(String args[]) 
    { 
            int a[] = { 1, 4, 1 }; 
  
            // size of an array 
            int n = a.length; 
  
            System.out.println(EqualNumbers(a, n)); 
    } 
    // This code is contributed by ANKITRAI1 
} 

