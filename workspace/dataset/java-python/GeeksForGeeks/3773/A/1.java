

// Java Find the sum of all non- repeated  
// elements in an array  
import java.util.*; 
  
class GFG 
{ 
      
    // Find the sum of all non-repeated elements  
    // in an array  
    static int findSum(int arr[], int n) 
    { 
        int sum = 0; 
  
        // Hash to store all element of array  
        HashSet<Integer> s = new HashSet<Integer>(); 
        for (int i = 0; i < n; i++) 
        { 
            if (!s.contains(arr[i])) 
            { 
                sum += arr[i]; 
                s.add(arr[i]); 
            } 
        } 
        return sum; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int arr[] = {1, 2, 3, 1, 1, 4, 5, 6}; 
        int n = arr.length; 
        System.out.println(findSum(arr, n)); 
    } 
}  
  
// This code is contributed by Rajput-Ji 

