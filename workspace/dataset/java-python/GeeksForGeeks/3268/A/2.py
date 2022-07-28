

# Python3 implementation of the approach.  
  
# Function to return the minimum number of  
# characters of the given binary string  
# to be replaced to make the string alternating  
def minReplacement(s, length):  
  
    ans = 0
    for i in range(0, length):  
  
        # If there is 1 at even index positions  
        if i % 2 == 0 and s[i] == '1':  
            ans += 1
  
        # If there is 0 at odd index positions  
        if i % 2 == 1 and s[i] == '0':  
            ans += 1
      
    return min(ans, length - ans)  
  
# Driver code  
if __name__ == "__main__": 
  
    s = "1100"
    length = len(s)  
    print(minReplacement(s, length))  
          
# This code is contributed by Rituraj Jain 

