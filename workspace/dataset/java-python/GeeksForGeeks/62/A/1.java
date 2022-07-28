

// Java program to find the value of the 
// reduced Array by reducing the array 
// based on the given conditions 
  
public class GFG { 
  
    // Function to find the value of the 
    // reduced Array by reducing the array 
    // based on the given conditions 
    public static int find_value(int a[], int n, int k) 
    { 
        // Variable to store the sum 
        int sum = 0; 
  
        // For loop to iterate through the 
        // given array and find the sum 
        for (int i = 0; i < n; i++) { 
            sum += a[i]; 
        } 
  
        // Return the required value 
        return sum % k; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 5, k = 3; 
        int a[] = { 12, 4, 13, 0, 5 }; 
        System.out.println(find_value(a, n, k)); 
    } 
} 

