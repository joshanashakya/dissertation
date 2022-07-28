

// Java program to find maximum count  
// of such characters which are greater  
// its left and right character in  
// any permutation of the string only three characters   
  
class GFG { 
  
// function to find maximum maximal character in the string  
    static int solve(int freq[]) { 
        // to store sum of all frequency  
        int n = 0; 
  
        // to store maximum frequency  
        int max_freq = 0; 
  
        // frequency of the smallest element  
        int first = 0; 
  
        // to check if the smallest  
        // element have amximum frequqncy or not  
        int flag = 0; 
  
        // Iterate in the string and count frequency  
        for (int i = 0; i < 26; i++) { 
            n += freq[i]; 
  
            // to store frequency of smallest element  
            if (freq[i] != 0 && flag == 0) { 
                first = freq[i]; 
                flag = 1; 
            } 
  
            // to store maximum frequency  
            if (max_freq < freq[i]) { 
                max_freq = freq[i]; 
            } 
        } 
  
        // if sum of frequency of all element if 0  
        if (n == 0) { 
            return 0; 
        } 
  
        // if frequency of smallest character  
        // if largest frequency  
        if (first != max_freq) { 
            flag = 1; 
        } else { 
            flag = 0; 
        } 
  
        return Math.min((n - 1) / 2, n - max_freq - flag); 
    } 
  
// Function that counts the frequency of  
// each element  
    static void solve(String s) { 
        // array to store the frequency of each character  
        int freq[] = new int[26]; 
  
        // loop to calculate frequqncy of  
        // each character in the given string  
        for (int i = 0; i < s.length(); i++) { 
            freq[s.charAt(i) - 'a']++; 
        } 
  
        System.out.println(solve(freq)); 
    } 
  
// Driver Code  
    public static void main(String[] args) { 
        String s = "geeks"; 
  
        solve(s); 
  
    } 
} 
// This code is contributed by 29AjayKumar  

