

// Java program to find longest subsequence  
// of the form 0*1*0* in a binary string  
class GFG  
{ 
  
    // Returns length of the longest subsequence 
    // of the form 0*1*0* 
    public static int longestSubseq(String s) 
    { 
        int n = s.length(); 
  
        // Precomputing values in three arrays 
        // pre_count_0[i] is going to store count 
        // of 0s in prefix str[0..i-1] 
        // pre_count_1[i] is going to store count 
        // of 1s in prefix str[0..i-1] 
        // post_count_0[i] is going to store count 
        // of 0s in suffix str[i-1..n-1] 
        int[] pre_count_0 = new int[n + 2]; 
        int[] pre_count_1 = new int[n + 1]; 
        int[] post_count_0 = new int[n + 2]; 
        pre_count_0[0] = 0; 
        post_count_0[n + 1] = 0; 
        pre_count_1[0] = 0; 
        for (int j = 1; j <= n; j++)  
        { 
            pre_count_0[j] = pre_count_0[j - 1]; 
            pre_count_1[j] = pre_count_1[j - 1]; 
            post_count_0[n - j + 1] = post_count_0[n - j + 2]; 
  
            if (s.charAt(j - 1) == '0') 
                pre_count_0[j]++; 
            else
                pre_count_1[j]++; 
  
            if (s.charAt(n - j) == '0') 
                post_count_0[n - j + 1]++; 
        } 
  
        // string is made up of all 0s or all 1s 
        if (pre_count_0[n] == n ||  
            pre_count_0[n] == 0) 
            return n; 
  
        // Compute result using precomputed values 
        int ans = 0; 
        for (int i = 1; i <= n; i++) 
            for (int j = i; j <= n; j++) 
                ans = Math.max(pre_count_0[i - 1] +  
                               pre_count_1[j] -  
                               pre_count_1[i - 1] +  
                               post_count_0[j + 1], ans); 
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String s = "000011100000"; 
        System.out.println(longestSubseq(s)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

