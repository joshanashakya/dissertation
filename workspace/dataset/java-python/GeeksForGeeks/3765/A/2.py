

# Python3 implementation of the approach 
  
# Function to return the count of rotated 
# strings which have more number of vowels in 
# the first half than the second half 
def cntRotations(s, n): 
  
    # Create a new string 
    str = s + s; 
  
    # Pre array to store count of all vowels 
    pre = [0] * (2 * n); 
  
    # Compute the prefix array 
    for i in range(2 * n): 
        if (i != 0): 
            pre[i] += pre[i - 1]; 
  
        if (str[i] == 'a' or str[i] == 'e' or 
            str[i] == 'i' or str[i] == 'o' or 
            str[i] == 'u'):  
            pre[i] += 1; 
          
    # To store the required answer 
    ans = 0; 
  
    # Find all rotated strings 
    for i in range(n - 1, 2 * n - 1, 1): 
  
        # Right and left index of the string 
        r = i; l = i - n; 
  
        # x1 stores the number of vowels 
        # in the rotated string 
        x1 = pre[r]; 
        if (l >= 0): 
            x1 -= pre[l]; 
        r = (int)(i - n / 2); 
  
        # Left stores the number of vowels 
        # in the first half of rotated string 
        left = pre[r]; 
        if (l >= 0): 
            left -= pre[l]; 
  
        # Right stores the number of vowels 
        # in the second half of rotated string 
        right = x1 - left; 
  
        # If the count of vowels in the first half 
        # is greater than the count in the second half 
        if (left > right):  
            ans += 1; 
          
    # Return the required answer 
    return ans; 
  
# Driver code 
s = "abecidft"; 
n = len(s); 
  
print(cntRotations(s, n)); 
  
# This code is contributed by Rajput-Ji 

