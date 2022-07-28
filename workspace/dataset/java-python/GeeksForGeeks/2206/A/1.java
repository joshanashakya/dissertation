

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the count 
// of the required subsequences 
static int countSubSeq(String str, int len) 
{ 
    // To store the final answer 
    int ans = 0; 
  
    // Multiplier 
    int mul = 1; 
  
    // Loop to find the answer 
    for (int i = 0; i < len; i++)  
    { 
  
        // Condition to update the answer 
        if (str.charAt(i) == '0') 
            ans += mul; 
              
        // updating multiplier 
        mul *= 2; 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "10010"; 
    int len = str.length(); 
  
    System.out.print(countSubSeq(str, len)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

