

// Java program to implement the above  
// approach  
import java.util.*; 
  
class geeks  
{ 
  
    // Function to find the value of d 
    // and find the number of zeros in the array 
    public static void findDandZeroes(int[] a, int[] b, int n) 
    { 
  
        // Hash table 
        HashMap<Double, Integer> mpp = new HashMap<>(); 
  
        int count = 0; 
  
        // Iterate for i-th element 
        for (int i = 0; i < n; i++) 
        { 
  
            // If both are not 0 
            if (b[i] != 0 && a[i] != 0) 
            { 
                double val = (double) (-1.0 * b[i]) / (double) (a[i]); 
                if (mpp.get(val) != null)  
                { 
                    int x = mpp.get(val); 
                    mpp.put(val, ++x); 
                } 
                else
                    mpp.put(val, 1); 
            } 
  
            // If both are 0 
            else if (b[i] == 0 && a[i] == 0) 
                count += 1; 
        } 
  
        // Find max occurring d 
        int maxi = 0; 
        for (HashMap.Entry<Double, Integer> entry : mpp.entrySet()) 
        { 
            maxi = Math.max(entry.getValue(), maxi); 
        } 
  
        // Print the d which occurs max times 
        for (HashMap.Entry<Double, Integer> entry : mpp.entrySet())  
        { 
            if (entry.getValue() == maxi)  
            { 
                System.out.println("Value of d is: " + entry.getKey()); 
                break; 
            } 
        } 
  
        // Print the number of zeros 
        System.out.println("The number of zeros in array C is: " + 
                                                (maxi + count)); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int[] a = { 13, 37, 39 }; 
        int[] b = { 1, 2, 3 }; 
        int n = a.length; 
  
        findDandZeroes(a, b, n); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

