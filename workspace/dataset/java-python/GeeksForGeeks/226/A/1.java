

// Java implementation of the above approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find the number of permutations  
// possible of the original array to satisfy  
// the given absolute differences 
static int totalways(int[] arr, int n) 
{ 
    // To store the count of each 
    // a[i] in a map 
    HashMap<Integer,  
            Integer>cnt = new HashMap<Integer,  
                                      Integer>(); 
  
    for (int i = 0 ; i < n; i++) 
    { 
        if(cnt.containsKey(arr[i])) 
        { 
            cnt.put(arr[i], cnt.get(arr[i])+1); 
        } 
        else
        { 
            cnt.put(arr[i], 1); 
        } 
    } 
      
    // if n is odd 
    if (n % 2 == 1) 
    { 
        int start = 0, endd = n - 1; 
  
        // check the count of each whether 
        // it satisfy the given criteria or not 
        for (int i = start; i <= endd; i = i + 2)  
        { 
            if (i == 0)  
            { 
  
                // there is only 1 way 
                // for middle element. 
                if (cnt.get(i) != 1) 
                { 
                    return 0; 
                } 
            } 
            else 
            { 
  
                // for others there are 2 ways. 
                if (cnt.get(i) != 2)  
                { 
                    return 0; 
                } 
            } 
        } 
  
        // now find total ways 
        int ways = 1; 
        start = 2; endd = n - 1; 
        for (int i = start; i <= endd; i = i + 2)  
        { 
            ways = ways * 2; 
        } 
        return ways; 
    } 
  
    // When n is even. 
    else if (n % 2 == 0)  
    { 
  
        // there will be no middle element so 
        // for each a[i] there will be 2 ways 
        int start = 1, endd = n - 1; 
        for (int i = 1; i <= endd; i = i + 2)  
        { 
            if (cnt.get(i) != 2) 
                return 0; 
        } 
        int ways = 1; 
        for (int i = start; i <= endd; i = i + 2)  
        { 
            ways = ways * 2; 
        } 
        return ways; 
    } 
    return Integer.MIN_VALUE; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int N = 5; 
  
    int []arr = { 2, 4, 4, 0, 2 }; 
  
    System.out.println(totalways(arr, N)); 
} 
} 
  
// This code is contributed by Princi Singh 

