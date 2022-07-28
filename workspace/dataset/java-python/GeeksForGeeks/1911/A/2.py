

# Python3 implementation of the approach  
  
# Function to return the count of  
# required non-overlapping sub-strings  
def countSubStr(s, n) : 
  
    # To store the required count  
    count = 0;  
    i = 0
      
    while i < (n-2) :  
  
        # If "010" matches the sub-string  
        # starting at current index i  
        if (s[i] == '0' and s[i + 1] == '1'and s[i + 2] == '0') :  
            count += 1;  
            i += 3;  
  
        # If "101" matches the sub-string  
        # starting at current index i  
        elif (s[i] == '1' and s[i + 1] == '0'and s[i + 2] == '1') : 
            count += 1;  
            i += 3;  
          
        else : 
            i += 1;  
  
    return count;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "10101010101";  
    n = len(s);  
  
    print(countSubStr(s, n));  
  
# This code is contributed by AnkitRai01 

