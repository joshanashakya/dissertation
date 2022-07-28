

// Java implementation to count the 
// subStrings whose decimal equivalent 
// is greater than or equal to K 
import java.util.*; 
  
class GFG{ 
   
// Function to count number of 
// subString whose decimal equivalent 
// is greater than or equal to K 
static long countSubstr( 
    String s, int k) 
{ 
   
    int n = s.length(); 
   
    // Left pointer of the subString 
    int l = n - 1; 
   
    // Right pointer of the subString 
    int r = n - 1; 
    int []arr = new int[n]; 
    int last_indexof1 = -1; 
   
    // Loop to maintain the last 
    // occurence of the 1 in the String 
    for (int i = 0; i < n; i++) { 
        if (s.charAt(i) == '1') { 
            arr[i] = i; 
            last_indexof1 = i; 
        } 
        else { 
            arr[i] = last_indexof1; 
        } 
    } 
   
    // Variable to count the subString 
    long no_of_substr = 0; 
   
    // Loop to maintain the every 
    // possible end index of the subString 
    for (r = n - 1; r >= 0; r--) { 
        l = r; 
   
        // Loop to find the subString 
        // whose decimal equivalent is 
        // greater than or equal to K 
        while (l >= 0
               && (r - l + 1) <= 64
               && Integer.valueOf(s.substring(l, r + 1),2) 
                      < k) { 
            l--; 
        } 
   
        // Condition to check no 
        // of bits is out of bound 
        if (r - l + 1 <= 64) 
            no_of_substr += l + 1; 
        else { 
            no_of_substr += arr[l + 1] + 1; 
        } 
    } 
    return no_of_substr; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    String s = "11100"; 
    int k = 3; 
    System.out.println(countSubstr(s, k)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

