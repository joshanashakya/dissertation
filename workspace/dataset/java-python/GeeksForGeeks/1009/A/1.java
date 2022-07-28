

// Java program to find the sum of all the elements 
// from the array whose square root is present 
// in the same array 
public class GFG { 
    // Function to return the required sum 
    public static int getSum(int arr[], int n) 
    { 
  
        int sum = 0; 
  
        for (int i = 0; i < n; i++) { 
            double sqrtCurrent = Math.sqrt(arr[i]); 
  
            for (int j = 0; j < n; j++) { 
                double x = arr[j]; 
  
                // If sqrtCurrent is present in array 
                if (x == sqrtCurrent) { 
                    sum += (sqrtCurrent * sqrtCurrent); 
                    break; 
                } 
            } 
        } 
  
        return sum; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 2, 4, 5, 6, 7, 8, 9, 3 }; 
        int n = arr.length; 
        System.out.println(getSum(arr, n)); 
    } 
} 

