

# Python3 program to find nth even  
# palindromic number of only even  
# length composing of 4's and 5's.  
from math import ceil, log2 
  
# Utility function to compute  
# n'th palindrome number  
def solve(n, x, y) :  
  
    # Calculate the length from above  
    # formula as discussed above  
    length = ceil(log2(n + 2)) - 1;  
  
    # Calculate rank for length L  
    rank = n - (1 << length) + 1;  
  
    left = ""; right = "";  
  
    for i in range(length - 1 , -1, -1): 
  
        # Mask to check if i't bit  
        # is set or not  
        mask = (1 << i);  
  
        # If bit is set append '5'  
        # else append '4'  
        bit = (mask & rank);  
  
        if (bit) : 
            left += y;  
            right += y;  
              
        else : 
            left += x;  
            right += x;  
  
    right = right[::-1]; 
      
    res = left + right; 
    return res; 
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 23;  
    x = '4'; 
    y = '5';  
    ans = solve(n, x, y);  
    print(ans);  
      
# This code is contributed by kanugargng 

