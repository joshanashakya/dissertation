

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the maximized number 
static String get_maximum(char[] s, int a[]) 
{ 
    int n = s.length; 
  
    // Iterate till the end of the string 
    for (int i = 0; i < n; i++) 
    { 
  
        // Check if it is greater or not 
        if (s[i] - '0' < a[s[i] - '0'])  
        { 
            int j = i; 
  
            // Replace with the alternate till smaller 
            while (j < n && (s[j] - '0' <= a[s[j] - '0']))  
            { 
                s[j] = (char) ('0' + a[s[j] - '0']); 
                j++; 
            } 
  
            return String.valueOf(s); 
        } 
    } 
  
    // Return original s in case 
    // no change took place 
    return String.valueOf(s); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String s = "1337"; 
    int a[] = { 0, 1, 2, 5, 4, 6, 6, 3, 1, 9 }; 
    System.out.println(get_maximum(s.toCharArray(), a)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

