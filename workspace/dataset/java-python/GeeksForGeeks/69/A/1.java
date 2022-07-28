

// Java implementation of the approach 
class GFG 
{ 
      
static int MAX = 26; 
  
// Function to return the required 
// length of the subsequences 
static int maxLength(String str, int len) 
{ 
    // To store the result 
    int res = 0; 
  
    // To store the last visited 
    // position of lowercase letters 
    int lastPos[] = new int[MAX]; 
  
    // Initialisation of frequency array to -1 to 
    // indicate no character has previously occured 
    for (int i = 0; i < MAX; i++)  
    { 
        lastPos[i] = -1; 
    } 
  
    // For every character of the String 
    for (int i = 0; i < len; i++)  
    { 
  
        // Get the index of the current character 
        int C = str.charAt(i) - 'a'; 
  
        // If the current character has 
        // appeared before in the String 
        if (lastPos[C] != -1) 
        { 
  
            // Update the result 
            res = Math.max(len - (i -  
                            lastPos[C] - 1) - 1, res); 
        } 
  
        // Update the last position 
        // of the current character 
        lastPos[C] = i; 
    } 
    return res; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    String str = "geeksforgeeks"; 
    int len = str.length(); 
  
    System.out.println(maxLength(str, len)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

