

// Java implementation of the approach  
class GFG  
{ 
    final static int MAX = 26;  
      
    // Function to return the maximum number  
    // of times str1 can appear as a  
    // non-overlapping substring in str2  
    static int maxSubStr(char []str1, int len1, 
                         char []str2, int len2)  
    {  
      
        // str1 cannot never be substring of str2  
        if (len1 > len2)  
            return 0;  
      
        // Store the frequency of the characters of str1  
        int freq1[] = new int[MAX];  
          
        for (int i = 0; i < len1; i++)  
            freq1[i] = 0;  
              
        for (int i = 0; i < len1; i++)  
            freq1[str1[i] - 'a']++;  
      
        // Store the frequency of the characters of str2  
        int freq2[] = new int[MAX];  
          
        for (int i = 0; i < len2; i++)  
            freq2[i] = 0;  
              
        for (int i = 0; i < len2; i++)  
            freq2[str2[i] - 'a']++;  
      
        // To store the required count of substrings  
        int minPoss = Integer.MAX_VALUE; 
      
        for (int i = 0; i < MAX; i++) 
        {  
      
            // Current character doesn't appear in str1  
            if (freq1[i] == 0)  
                continue;  
      
            // Frequency of the current character in str1  
            // is greater than its frequency in str2  
            if (freq1[i] > freq2[i])  
                return 0;  
      
            // Update the count of possible substrings  
            minPoss = Math.min(minPoss, freq2[i] / freq1[i]);  
        }  
        return minPoss;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        String str1 = "geeks", str2 = "gskefrgoekees";  
        int len1 = str1.length();  
        int len2 = str2.length();  
      
        System.out.println(maxSubStr(str1.toCharArray(), len1,  
                                     str2.toCharArray(), len2));  
    }  
} 
  
// This code is contributed by AnkitRai01 

