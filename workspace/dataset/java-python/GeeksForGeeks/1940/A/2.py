

# Python3 implementation of the approach  
  
# Function to return the largest  
# substring divisible by 2  
def largestSubStr(s) :  
  
    # While the last character of  
    # the string is '1', pop it  
    while (len(s) and s[len(s) - 1] == '1') : 
        s = s[:len(s) - 1];  
  
    # If the original string had no '0'  
    if (len(s) == 0) : 
        return "-1";  
    else : 
        return s;  
  
# Driver code  
if __name__ == "__main__" : 
  
    s = "11001";  
  
    print(largestSubStr(s));  
  
# This code is contributed by AnkitRai01 

