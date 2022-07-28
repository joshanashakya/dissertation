

// Java implementation of the approach 
  
class GFG 
{ 
  
static int MAX = 26; 
  
// Function to update the freq[] array 
// to store the frequencies of 
// all the characters of str 
static void updateFreq(String str, int freq[]) 
{ 
    int len = str.length(); 
  
    // Update the frequency of the characters 
    for (int i = 0; i < len; i++)  
    { 
        freq[str.charAt(i) - 'a']++; 
    } 
} 
  
// Function to return the maximum count 
// of times patt can be formed 
// using the characters of str 
static int maxCount(String str, String patt) 
{ 
  
    // To store the frequencies of 
    // all the characters of str 
    int []strFreq = new int[MAX]; 
    updateFreq(str, strFreq); 
  
    // To store the frequencies of 
    // all the characters of patt 
    int []pattFreq = new int[MAX]; 
    updateFreq(patt, pattFreq); 
  
    // To store the result 
    int ans = Integer.MAX_VALUE; 
  
    // For every character 
    for (int i = 0; i < MAX; i++)  
    { 
  
        // If the current character 
        // doesn't appear in patt 
        if (pattFreq[i] == 0) 
            continue; 
  
        // Update the result 
        ans = Math.min(ans, strFreq[i] / pattFreq[i]); 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "geeksforgeeks"; 
    String patt = "geeks"; 
  
    System.out.print(maxCount(str, patt)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

