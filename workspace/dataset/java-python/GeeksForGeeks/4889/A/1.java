

//Java implementation of the approach 
import java.util.Arrays; 
  
class GFG 
{ 
    // Function to return the required element 
    static int getElement(int a[], int n, int S) 
    { 
        // Sort the array 
        Arrays.sort(a); 
      
        int sum = 0; 
      
        for (int i = 0; i < n; i++)  
        { 
      
            // If current element 
            // satisfies the condition 
            if (sum + (a[i] * (n - i)) == S) 
                return a[i]; 
            sum += a[i]; 
        } 
      
        // No element found 
        return -1; 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int S = 5; 
        int a[] = { 1, 3, 2, 5, 8 }; 
        int n = a.length; 
      
        System.out.println(getElement(a, n, S)); 
    } 
} 
  
// This code is contributed by Mukul singh. 

