

// Java implementation of the approach 
class GFG 
{ 
  
static int TEN = 10; 
  
// Function to return the minimum number 
// that can be formed after removing 
// the digits which is a multiple of 4 
static int minNum(char[] str, int len) 
{ 
    int res = Integer.MAX_VALUE; 
  
    // For every digit of the number 
    for (int i = 0; i < len; i++) 
    { 
  
        // Check if the current digit 
        // is divisible by 4 
        if (str[i] == '4' || str[i] == '8') 
        { 
            res = Math.min(res, str[i] - '0'); 
        } 
    } 
  
    for (int i = 0; i < len - 1; i++) 
    { 
        for (int j = i + 1; j < len; j++)  
        { 
            int num = (str[i] - '0') * TEN 
                    + (str[j] - '0'); 
  
            // If any subsequence of two 
            // digits is divisible by 4 
            if (num % 4 == 0) 
            { 
                res = Math.min(res, num); 
            } 
        } 
    } 
  
    return ((res == Integer.MAX_VALUE) ? -1 : res); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "17"; 
    int len = str.length(); 
  
    System.out.print(minNum(str.toCharArray(), len)); 
  
} 
} 
  
// This code is contributed by 29AjayKumar 

