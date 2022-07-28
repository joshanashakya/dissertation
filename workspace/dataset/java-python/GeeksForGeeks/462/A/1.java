

// Java implmentation to count the  
// number of ways to partition the  
// string such that each partition  
// have same number of distinct  
// characters in the string  
class GFG { 
      
    // Function to count the number  
    // of ways to partition the string  
    // such that each partition have  
    // same number of distinct character  
    static int waysToSplit(String s)  
    {  
        int n = s.length();  
        int answer = 0;  
          
        // Prefix and suffix array for  
        // distinct character from  
        // start and end  
        int prefix[] = new int[n] ;  
        int suffix[] = new int[n];  
      
        // To check whether a character  
        // has appeared till ith index  
        int seen[] = new int[26]; 
      
        // Calculating prefix array  
        for (int i = 0; i < n; i++) {  
      
            int prev = (i - 1 >= 0 ?  
                prefix[i - 1] : 0);  
      
            // Character appears for  
            // the first time in string  
            if (seen[s.charAt(i) - 'a'] == 0) {  
                prefix[i] += (prev + 1);  
            }  
            else
                prefix[i] = prev;  
      
            // Character is visited  
            seen[s.charAt(i)- 'a'] = 1;  
        }  
          
        // Resetting seen for  
        // suffix calculation  
        for(int i = 0; i <26; i++) 
            seen[i] = 0; 
      
        // Calculating the suffix array  
        suffix[n - 1] = 0;  
        for (int i = n - 1; i >= 1; i--) {  
            int prev = suffix[i];  
      
            // Character appears  
            // for the first time  
            if (seen[s.charAt(i) - 'a'] == 0) {  
                suffix[i - 1] += (prev + 1);  
            }  
            else
                suffix[i - 1] = prev;  
      
            // This character  
            // has now appeared  
            seen[s.charAt(i)- 'a'] = 1;  
        }  
          
        // Loop to calculate the number  
        // partition points in the string  
        for (int i = 0; i < n; i++) { 
   
            // Check whether number of  
            // distinct characters are equal  
            if (prefix[i] == suffix[i])  
                answer++;  
        }  
        return answer;  
    }  
      
    // Driver Code  
    public static void main (String[] args) 
    {  
        String s = "ababa";  
      
        System.out.println(waysToSplit(s));  
    }  
  
} 
  
// This code is contributed by Yash_R 

