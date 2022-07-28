

// Java implementation of the approach 
import java.util.HashSet; 
class CP { 
    public static void main(String[] args) 
    { 
        int[] A = { 11, 15, 7, 19 }; 
        int N = A.length; 
  
        // Set to store all possible AND values. 
        HashSet<Integer> set = new HashSet<>(); 
        int i, j, res; 
  
        // Starting index of the sub-array. 
        for (i = 0; i < N; ++i) 
  
            // Ending index of the sub-array. 
            for (j = i, res = Integer.MAX_VALUE; j < N; ++j) { 
                res &= A[j]; 
  
                // AND value is added to the set. 
                set.add(res); 
            } 
  
        // The set contains all possible AND values. 
        System.out.println(set); 
    } 
} 

