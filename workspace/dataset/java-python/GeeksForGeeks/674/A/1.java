

import java.util.ArrayList; 
  
// Java implementation of the above approach 
class GFG { 
  
// Function to Check if the array 
// has an element which is equal to 
// product of all the remaining elements 
    static boolean CheckArray(int arr[], int n) { 
        int prod = 1; 
  
        // Storing frequency in map 
        ArrayList<Integer> freq = new ArrayList<>(); 
  
        // Calculate the product of all the elements 
        for (int i = 0; i < n; ++i) { 
            freq.add(arr[i]); 
            prod *= arr[i]; 
        } 
  
        int root = (int) Math.sqrt(prod); 
  
        // If the prod is a perfect square 
        if (root * root == prod) // then check if its square root 
        // exist in the array or not 
        { 
            if (freq.contains(root) & freq.lastIndexOf(root) != (freq.size())) { 
                return true; 
            } 
        } 
  
        return false; 
    } 
// Driver code  
  
    public static void main(String[] args) { 
  
        int arr[] = {1, 2, 12, 3, 2}; 
        int n = arr.length; 
  
        if (CheckArray(arr, n)) { 
            System.out.println("YES"); 
        } else { 
            System.out.println("NO"); 
        } 
  
    } 
} 
//This code is contributed by 29AjayKumar 

