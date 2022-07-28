

// Java implementation of the approach 
import java.util.Arrays; 
public class GFG { 
  
// Function to return the minimum number 
// divisible by 3 formed by the given digits 
    static int printSmallest(int a[]) { 
        int sum, sum1; 
  
        // Sort the given array in ascending 
        Arrays.sort(a); 
  
        int i, j, k, num; 
  
        // Check if any single digit is divisible by 3 
        for (i = 0; i < 3; i++) { 
            if (a[i] % 3 == 0) { 
                return a[i]; 
            } 
        } 
  
        // Check if any two digit number formed by 
        // the given digits is divisible by 3 
        // starting from the minimum 
        for (i = 0; i < 3; i++) { 
            for (j = 0; j < 3; j++) { 
  
                // Generate the two digit number 
                num = (a[i] * 10) + a[j]; 
                if (num % 3 == 0) { 
                    return num; 
                } 
            } 
        } 
  
        // If none of the above is true, we can 
        // form three digit number by taking a[0] 
        // three times. 
        return a[0] * 100 + a[0] * 10 + a[0]; 
    } 
  
// Driver code 
    public static void main(String[] args) { 
  
        int arr[] = {7, 7, 1}; 
        System.out.println(printSmallest(arr)); 
  
    } 
} 
// This code is contributed by 29AjayKumar 

