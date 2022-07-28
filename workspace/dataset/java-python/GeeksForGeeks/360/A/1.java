

// Java implementation of the approach 
class GFG 
{ 
      
    // Function to return the minimum number  
    // of moves required to make n divisible  
    // by 25 
    static int minMoves(int n) 
    { 
      
        // Convert number into string 
        String s = Integer.toString(n); 
          
        // To store required answer 
        int ans = Integer.MAX_VALUE; 
      
        // Length of the string 
        int len = s.length(); 
      
        // To check all possible pairs 
        for (int i = 0; i < len; ++i)  
        { 
            for (int j = 0; j < len; ++j)  
            { 
                if (i == j) 
                    continue; 
      
                // Make a duplicate string 
                char t [] = s.toCharArray(); 
                int cur = 0; 
      
                // Number of swaps required to place 
                // ith digit in last position 
                for (int k = i; k < len - 1; ++k)  
                { 
                    swap(t, k, k + 1); 
                    ++cur; 
                } 
      
                // Number of swaps required to place 
                // jth digit in 2nd last position 
                for (int k = j - ((j > i)? 1 : 0 ); k < len - 2; ++k)  
                { 
                    swap(t, k, k + 1); 
                    ++cur; 
                } 
      
                // Find first non zero digit 
                int pos = -1; 
                for (int k = 0; k < len; ++k) 
                { 
                    if (t[k] != '0')  
                    { 
                        pos = k; 
                        break; 
                    } 
                } 
      
                // Place first non zero digit 
                // in the first position 
                for (int k = pos; k > 0; --k)  
                { 
                    swap(t, k, k - 1); 
                    ++cur; 
                } 
      
                // Convert string to number 
                long nn = Integer.parseInt(String.valueOf(t)); 
      
                // If this number is divisible by 25 
                // then cur is one of the possible answer 
                if (nn % 25 == 0) 
                    ans = Math.min(ans, cur); 
            } 
        } 
      
        // If not possible 
        if (ans == Integer.MAX_VALUE) 
            return -1; 
      
        return ans; 
    } 
      
    static void swap(char t [], int i, int j)  
    {  
        char temp = t[i];  
        t[i] = t[j];  
        t[j] = temp;  
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 509201; 
        System.out.println(minMoves(n)); 
    } 
} 
  
// This code is contributed by Archana_Kumari 

