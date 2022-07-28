

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the minimum  
// changes required  
static int minChanges(char[] str, int n)  
{  
  
    // To store the count of minimum changes,  
    // number of ones and the number of zeroes  
    int count = 0, zeros = 0, ones = 0;  
  
    // First character has to be '1'  
    if (str[0] != '1') 
    {  
        count++;  
        ones++;  
    }  
  
    for (int i = 1; i < n; i++) 
    {  
        if (str[i] == '0')  
            zeros++;  
        else
            ones++;  
  
        // If condition fails  
        // changes need to be made  
        if (zeros > ones)  
        {  
            zeros--;  
            ones++;  
            count++;  
        }  
    }  
  
    // Return the required count  
    return count;  
}  
  
// Driver code  
public static void main(String[] args) 
{ 
    char []str = "0000".toCharArray();  
    int n = str.length;  
    System.out.print(minChanges(str, n));  
} 
} 
  
// This code has been contributed by 29AjayKumar 

