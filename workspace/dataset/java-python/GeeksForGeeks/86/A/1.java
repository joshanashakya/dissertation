

// Java program for the above approach 
class GFG 
{ 
  
// Function to find 
// the longest Special Sequence 
static int longest_subseq(int n, int k, String s) 
{ 
  
    // Creating a list with 
    // all 0's of size 
    // equal to the length of String 
    int []dp = new int[n]; 
  
    // Supporting list with 
    // all 0's of size 26 since 
    // the given String consists 
    // of only lower case alphabets 
    int []max_length = new int[26]; 
  
    for (int i = 0; i < n; i++)  
    { 
  
        // Converting the ascii value to 
        // list indices 
        int curr = s.charAt(i) - 'a'; 
          
        // Determining the lower bound 
        int lower = Math.max(0, curr - k); 
          
        // Determining the upper bound 
        int upper = Math.min(25, curr + k); 
          
        // Filling the dp array with values 
        for (int j = lower; j < upper + 1; j++) 
        { 
            dp[i] = Math.max(dp[i], max_length[j] + 1); 
        } 
          
        // Filling the max_length array with max 
        // length of subsequence till now 
        max_length[curr] = Math.max(dp[i], max_length[curr]); 
    } 
  
    int ans = 0; 
  
    for(int i:dp) ans = Math.max(i, ans); 
  
    // return the max length of subsequence 
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String s = "geeksforgeeks"; 
    int n = s.length(); 
    int k = 3; 
    System.out.print(longest_subseq(n, k, s)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

