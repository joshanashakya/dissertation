

// Java implementation of the above approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the length of the longest  
// sub string having frequency of a character  
// greater than half of the length of the  
// sub string 
static int maxLength(String s, int n) 
{ 
    int ans = Integer.MIN_VALUE; 
    Vector<Integer> A = new Vector<Integer>(); 
    Vector<Integer> L = new Vector<Integer>(); 
    Vector<Integer> R = new Vector<Integer>(); 
  
    int []freq = new int[n + 5]; 
  
    // for each of the character 'a' to 'z' 
    for (int i = 0; i < 26; i++)  
    { 
        int count = 0; 
          
        // finding frequency prefix array of the  
        // character 
        for (int j = 0; j < n; j++)  
        { 
            if (s.charAt(j) - 'a' == i) 
                count++; 
            freq[j] = count; 
        } 
  
        // Finding the r[] and l[] arrays. 
        for (int j = 1; j < n; j++)  
        { 
            L.add((2 * freq[j - 1]) - j); 
            R.add((2 * freq[j]) - j); 
        } 
  
        int max_len = Integer.MIN_VALUE; 
        int min_val = Integer.MAX_VALUE; 
  
        // for each j from 0 to n 
        for (int j = 0; j < L.size(); j++)  
        { 
            min_val = Math.min(min_val, L.get(j)); 
            A.add(min_val); 
  
            int l = 0, r = j; 
  
            // Finding the lower bound of i. 
            while (l <= r)  
            { 
                int mid = (l + r) >> 1; 
                if (A.get(mid) <= R.get(j))  
                { 
                    max_len = Math.max(max_len,  
                                       j - mid + 1); 
                    r = mid - 1; 
                } 
                else 
                { 
                    l = mid + 1; 
                } 
            } 
        } 
  
        // storing the maximum value of i - j + 1 
        ans = Math.max(ans, max_len); 
  
        // clearing all the vector so that it clearing 
        // be use for other character. 
        A.clear(); 
        R.clear(); 
        L.clear(); 
    } 
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String s = "ababbbacbcbcca"; 
    int n = s.length(); 
  
    System.out.println(maxLength(s, n)); 
} 
} 
  
// This code is contributed by Princi Singh 

