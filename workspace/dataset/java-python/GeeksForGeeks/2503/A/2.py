

# Python3 implementation of the approach  
  
# Function to return the minimum swaps required  
def findMinSwaps(s, k) :  
  
    # To store the final answer  
    ans = 0;  
  
    # To store the count of one and zero  
    c_one = 0; c_zero = 0;  
  
    # Loop from end of the string  
    for i in range(len(s)-1, -1, -1) : 
  
        # If s[i] = 1  
        if (s[i] == '1') : 
            c_one += 1;  
  
        # If s[i] = 0  
        if (s[i] == '0') : 
            c_zero += 1; 
            ans += c_one;  
  
        # If c_zero = k  
        if (c_zero == k) : 
            break;  
  
    # If the result can't  
    # be achieved  
    if (c_zero < k) : 
        return -1;  
  
    # Return the final answer  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "100111";  
    k = 2;  
  
    print(findMinSwaps(s, k));  
  
# This code is contributed by AnkitRai01 

