

// Java program to count ways to choose 
// triplets such that the distance  
// between the farthest points <= L 
import java .io.*; 
import java .util.Arrays; 
class GFG { 
  
    // Returns the number of triplets with  
    // distance between farthest points <= L  
    static int countTripletsLessThanL(int n, int L, 
                                        int []arr) 
    { 
          
        // sort to get ordered triplets 
        // so that we can find the  
        // distance between farthest  
        // points belonging to a triplet 
        Arrays.sort(arr); 
      
        int ways = 0; 
      
        // generate and check for all possible  
        // triplets: {arr[i], arr[j], arr[k]} 
        for (int i = 0; i < n; i++) { 
            for (int j = i + 1; j < n; j++) { 
                for (int k = j + 1; k < n; k++) { 
      
                    // Since the array is sorted the  
                    // farthest points will be a[i]  
                    // and a[k]; 
                    int mostDistantDistance =  
                                    arr[k] - arr[i]; 
                    if (mostDistantDistance <= L)  
                    { 
                        ways++; 
                    } 
                } 
            } 
        } 
      
        return ways; 
    } 
  
    // Driver Code 
    static public void main (String[] args) 
    { 
          
        // set of n points on the X axis 
        int []arr = {1, 2, 3, 4}; 
      
        int n =arr.length; 
        int L = 3; 
        int ans = countTripletsLessThanL(n, L, arr); 
        System.out.println("Total Number of ways = " 
                                             + ans); 
    } 
} 
  
// This code is contributed by anuj_67. 

