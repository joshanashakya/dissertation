

// Java Program to find the maximum subset 
// with bitwise OR equal to k 
import java.util.*; 
  
class GFG { 
  
    // function to find the maximum subset  
    // with bitwise OR equal to k 
    static void subsetBitwiseORk(int arr[], 
                              int n, int k) 
    { 
        ArrayList<Integer> v =  
                  new ArrayList<Integer>(); 
      
        for (int i = 0; i < n; i++) { 
      
            // If the bitwise OR of k and  
            // element is equal to k, then 
            // include that element in the  
            // subset 
            if ((arr[i] | k) == k){ 
                v.add(arr[i]); 
            } 
        } 
      
        // Store the bitwise OR of elements 
        // in v 
        int ans = 0; 
      
        for (int i = 0; i < v.size(); i++) 
            ans = ans|v.get(i); 
      
        // If ans is not equal to k, subset 
        // doesn't exist 
        if (ans != k) { 
            System.out.println("Subset does"
                           + " not exist" ); 
            return; 
        } 
      
        for (int i = 0; i < v.size(); i++) 
            System.out.print(v.get(i) + " " ); 
    } 
      
    // main function 
    public static void main(String[] args) 
    { 
        int k = 3; 
        int arr[] = { 1, 4, 2 }; 
        int n = arr.length; 
      
        subsetBitwiseORk(arr, n, k); 
          
    } 
} 
  
// This code is contributed by Arnab Kundu. 

