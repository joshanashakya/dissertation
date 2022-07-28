

// Java implementation of the approach 
  
class GFG 
{ 
          
    static int MAX = 26; 
      
    // Function to return the length of the longest 
    // sub-sequence with at least one 
    // common character in every string 
    static int largestSubSeq(String arr[], int n) 
    { 
      
        // count[0] will store the number of strings 
        // which contain 'a', count[1] will store the 
        // number of strings which contain 'b' and so on.. 
        int [] count = new int[MAX]; 
      
        // For every string 
        for (int i = 0; i < n; i++) { 
            String str = arr[i]; 
      
            // Hash array to set which character is 
            // present in the current string 
            boolean [] hash = new boolean[MAX]; 
              
              
            for (int j = 0; j < str.length(); j++) { 
                hash[str.charAt(j) - 'a'] = true; 
            } 
      
            for (int j = 0; j < MAX; j++) { 
      
                // If current character appears in the 
                // string then update its count 
                if (hash[j]) 
                    count[j]++; 
            } 
        } 
          
        int max = -1; 
      
        for(int i=0;i< MAX; i++) 
        { 
            if(max < count[i]) 
                max = count[i]; 
        } 
        return max; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
          
        String arr[] = { "ab", "bc", "de" }; 
        int n = arr.length; 
      
        System.out.println(largestSubSeq(arr, n)); 
      
  
    } 
  
  
} 
  
// This code is contributed by ihritik 

