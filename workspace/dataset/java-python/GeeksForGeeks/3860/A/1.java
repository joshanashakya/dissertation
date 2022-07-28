

// Java implementation of the approach  
class GFG 
{ 
      
// Function to return the required character  
static char getChar(String str)  
{  
  
    // To store the sum of the characters  
    // of the given string  
    int sum = 0;  
  
    for (int i = 0; i < str.length(); i++)  
    {  
  
        // Add the current character to the sum  
        sum += (str.charAt(i) - 'a' + 1);  
    }  
  
    // Return the requried character  
    if (sum % 26 == 0)  
        return 'z';  
    else 
    {  
        sum = sum % 26;  
        return (char)('a' + sum - 1);  
    }  
}  
  
// Driver code  
public static void main (String[] args)  
{  
    String str = "gfg";  
  
    System.out.println(getChar(str));  
}  
} 
  
// This code is contributed by AnkitRai01 

