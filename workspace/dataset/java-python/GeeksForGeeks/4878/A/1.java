

// Java program to find maximum occurred  
// element in given N ranges. 
import java.io.*; 
  
class GFG { 
  
    static int MAX = 1000000; 
  
    // Return the maximum occurred element in all ranges. 
    static int maximumOccurredElement(int[] L, int[] R, int n) 
    { 
        // Initalising all element of array to 0. 
        int[] arr = new int[MAX]; 
  
        // Adding +1 at Li index and  
        // substracting 1 at Ri index. 
        int maxi=-1; 
        for (int i = 0; i < n; i++) { 
            arr[L[i]] += 1; 
            arr[R[i] + 1] -= 1; 
            if(R[i]>maxi){ 
            maxi=R[i]; 
           } 
        } 
  
        // Finding prefix sum and index 
        // having maximum prefix sum. 
        int msum = arr[0]; 
        int ind = 0; 
        for (int i = 1; i < maxi+1; i++) { 
            arr[i] += arr[i - 1]; 
            if (msum < arr[i]) { 
                msum = arr[i]; 
                ind = i; 
            } 
        } 
  
        return ind; 
    } 
  
    // Driver program 
    static public void main(String[] args) 
    { 
        int[] L = { 1, 4, 9, 13, 21 }; 
        int[] R = { 15, 8, 12, 20, 30 }; 
        int n = L.length; 
        System.out.println(maximumOccurredElement(L, R, n)); 
    } 
} 
  
// This code is contributed by vt_m. 

