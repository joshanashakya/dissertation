

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
    // Function to return the maximum product value 
    static long maxProd(int arr[], int n, int k) 
    { 
      
        // To store the product 
        long product = 1; 
        HashMap<Integer,Integer> s = new HashMap<Integer,Integer>();  
          
        // Sort the array 
        Arrays.sort(arr); 
      
        for (int i = 0; i < n; i++) 
        { 
            if (s.containsKey(arr[i]) == false) 
            { 
      
                // Efficiently finding product 
                // including every element once 
                product = product * arr[i]; 
                  
                s.put(arr[i], 1); 
      
            } 
      
            // Storing values in hash map 
            else
                s.put(arr[i],s.get(arr[i]) +1); 
      
        } 
      
        for (int j = n - 1; j >= 0 && k > 0; j--)  
        { 
            if ((k > (s.get(arr[j]) - 1)) &&  
                    ((s.get(arr[j]) - 1) > 0))  
            { 
      
                // Including the greater repeating values 
                // so that product can be maximized 
                product *= Math.pow(arr[j], s.get(arr[j]) - 1); 
                k = k - s.get(arr[j]) + 1; 
                s.put(arr[j], 0); 
            } 
            if (k <= (s.get(arr[j]) - 1) &&  
                    ((s.get(arr[j]) - 1) > 0))  
            { 
                product *= Math.pow(arr[j], k); 
                break; 
            } 
        } 
      
        return product; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int arr[] = { 5, 6, 7, 8, 2, 5, 6, 8 }; 
        int n = arr.length; 
        int k = 2; 
        System.out.println(maxProd(arr, n, k)); 
    } 
} 
  
// This code is contributed by ihritik 

