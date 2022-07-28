

// Java implementation of the approach 
class GFG 
{ 
  
    // Function to return the count of unset 
    // bits in the binary representation of 
    // all the numbers from 1 to n 
    static int countUnsetBits(int n) 
    { 
  
        // To store the count of unset bits 
        int cnt = 0; 
  
        // For every integer from the range [1, n] 
        for (int i = 1; i <= n; i++)  
        { 
  
            // A copy of the current integer 
            int temp = i; 
  
            // Count of unset bits in 
            // the current integer 
            while (temp > 0) 
            { 
  
                // If current bit is unset 
                if (temp % 2 == 0) 
                { 
                    cnt = cnt + 1; 
                } 
  
                temp = temp / 2; 
            } 
        } 
        return cnt; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int n = 5; 
        System.out.println(countUnsetBits(n)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

