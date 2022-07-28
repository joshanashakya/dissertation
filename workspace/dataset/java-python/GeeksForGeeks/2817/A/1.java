

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the number 
// of operations required 
static int changeToOnes(String str) 
{ 
  
    // ctr will store the number of 
    // consecutive ones at the end 
    // of the given binary string 
    int i, l, ctr = 0; 
    l = str.length(); 
  
    // Loop to find number of 1s 
    // at the end of the string 
    for (i = l - 1; i >= 0; i--)  
    { 
  
        // If the current character is 1 
        if (str.charAt(i) == '1') 
            ctr++; 
  
        // If we encounter the first 0 
        // from the LSB position then 
        // we'll break the loop 
        else
            break; 
    } 
  
    // Number of operations 
    // required is (l - ctr) 
    return l - ctr; 
} 
  
// Function to remove leading 
// zeroes from the string 
static String removeZeroesFromFront(String str) 
{ 
    String s; 
  
    int i = 0; 
  
    // Loop until s[i] becomes 
    // not equal to 1 
    while (i < str.length() && 
               str.charAt(i) == '0') 
        i++; 
  
    // If we reach the end of 
    // the string, it means that 
    // string contains only 0's 
    if (i == str.length()) 
        s = "0"; 
  
    // Return the string without 
    // leading zeros 
    else
        s = str.substring(i, str.length() - i); 
    return s; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str = "10010111"; 
  
    // Removing the leading zeroes 
    str = removeZeroesFromFront(str); 
  
    System.out.println(changeToOnes(str)); 
} 
}  
  
// This code is contributed by 29AjayKumar 

