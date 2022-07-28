

// Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
      
// Function to find maximum number of ABs 
static int maxCountAB(String s[], int n) 
{ 
    // variable A, B, AB for count strings that 
    // end with 'A' but not end with 'B', 'B' but 
    // does not end with 'A' and 'B' and ends 
    // with 'A' respectively. 
    int A = 0, B = 0, BA = 0, ans = 0; 
  
    for (int i = 0; i < n; i++) 
    { 
        String S = s[i]; 
        int L = S.length(); 
        for (int j = 0; j < L - 1; j++)  
        { 
  
            // 'AB' is already present in string 
            // before concatenate them 
            if (S.charAt(j) == 'A' &&  
                        S.charAt(j + 1) == 'B')  
            { 
                ans++; 
            } 
        } 
  
        // count of strings that begins 
        // with 'B' and ends with 'A 
        if (S.charAt(0) == 'B' && S.charAt(L - 1) == 'A') 
            BA++; 
  
        // count of strings that begins 
        // with 'B' but does not end with 'A' 
        else if (S.charAt(0) == 'B') 
            B++; 
  
        // count of strings that ends with 
        // 'A' but not end with 'B' 
        else if (S.charAt(L - 1) == 'A') 
            A++; 
    } 
  
    // updating the value of ans and 
    // add extra count of 'AB' 
    if (BA == 0) 
        ans += Math.min(B, A); 
    else if (A + B == 0) 
        ans += BA - 1; 
    else
        ans += BA + Math.min(B, A); 
  
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    String s[] = { "ABCA", "BOOK", "BAND" }; 
  
    int n = s.length; 
  
    System.out.println(maxCountAB(s, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

