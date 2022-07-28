

# Python3 implementation of the approach  
  
# Function to return the length  
# of the required sub-string  
def longestSubstring(s) : 
  
    cnt = 1;  
    maxi = 1;  
  
    # Get the length of the string  
    n = len(s);  
  
    # Iterate in the string  
    for i in range(1, n) :  
  
        # Check for not consecutive  
        if (s[i] != s[i - 1]) : 
            cnt += 1;  
              
        else : 
              
            # If cnt greater than maxi  
            maxi = max(cnt, maxi);  
  
            # Re-initialize  
            cnt = 1;  
  
    # Check after iteration  
    # is complete  
    maxi = max(cnt, maxi);  
  
    return maxi;  
  
# Driver code  
if __name__ == "__main__" : 
      
    s = "ccccdeededff"; 
    print(longestSubstring(s));  
      
# This code is contirbuted by Ryuga 

