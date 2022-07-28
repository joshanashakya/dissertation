

// Java implementation for  
// Longest subsequence such that absolute 
// difference between every pair is atmost 1 
  
import java.util.*; 
public class GeeksForGeeks { 
    public static int longestAr( 
            int n, int arr[]){ 
        Hashtable<Integer, Integer> count 
            = new Hashtable<Integer, Integer>(); 
  
        // Storing the frequency of each 
        // element in the hashtable count 
        for (int i = 0; i < n; i++) { 
            if (count.containsKey(arr[i])) 
                count.put(arr[i], count.get( 
                    arr[i]) + 1
                ); 
            else
                count.put(arr[i], 1); 
        } 
  
        Set<Integer> kset = count.keySet(); 
        Iterator<Integer> it = kset.iterator(); 
  
        // Max is used to keep a track of 
        // maximum length of the required  
        // subsequence so far. 
        int max = 0; 
  
        while (it.hasNext()) { 
            int a = (int)it.next(); 
            int cur = 0; 
            int cur1 = 0; 
            int cur2 = 0; 
  
            // Store frequency of the 
            // given element+1. 
            if (count.containsKey(a + 1)) 
                cur1 = count.get(a + 1); 
  
            // Store frequency of the 
            // given element-1. 
            if (count.containsKey(a - 1)) 
                cur2 = count.get(a - 1); 
  
            // cur store the longest array  
            // that can be formed using a. 
            cur = count.get(a) + 
                  Math.max(cur1, cur2); 
  
            // update max if cur>max. 
            if (cur > max) 
                max = cur; 
        } 
  
        return (max); 
    } 
      
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 8; 
        int arr[] = { 2, 2, 3, 5, 5, 6, 6, 6 }; 
        int maxLen = longestAr(n, arr); 
        System.out.println(maxLen); 
    } 
} 

