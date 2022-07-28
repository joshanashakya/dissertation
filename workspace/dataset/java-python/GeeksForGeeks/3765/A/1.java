

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the count of rotated 
// Strings which have more number of vowels in 
// the first half than the second half 
static int cntRotations(String s, int n) 
{ 
    // Create a new String 
    String str = s + s; 
  
    // Pre array to store count of all vowels 
    int pre[]=new int[2 * n] ; 
  
    // Compute the prefix array 
    for (int i = 0; i < 2 * n; i++)  
    { 
        if (i != 0) 
            pre[i] += pre[i - 1]; 
  
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||  
            str.charAt(i) == 'i' || str.charAt(i) == 'o' ||  
            str.charAt(i) == 'u')  
        { 
            pre[i]++; 
        } 
    } 
  
    // To store the required answer 
    int ans = 0; 
  
    // Find all rotated Strings 
    for (int i = n - 1; i < 2 * n - 1; i++)  
    { 
  
        // Right and left index of the String 
        int r = i, l = i - n; 
  
        // x1 stores the number of vowels 
        // in the rotated String 
        int x1 = pre[r]; 
        if (l >= 0) 
            x1 -= pre[l]; 
        r = i - n / 2; 
  
        // Left stores the number of vowels 
        // in the first half of rotated String 
        int left = pre[r]; 
        if (l >= 0) 
            left -= pre[l]; 
  
        // Right stores the number of vowels 
        // in the second half of rotated String 
        int right = x1 - left; 
  
        // If the count of vowels in the first half 
        // is greater than the count in the second half 
        if (left > right)  
        { 
            ans++; 
        } 
    } 
  
    // Return the required answer 
    return ans; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    String s = "abecidft"; 
    int n = s.length(); 
  
    System.out.println( cntRotations(s, n)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

