

# Python3 implementation of the approach  
  
# Function to return the maximum possible  
# integer that can be obtained from the  
# given integer after performing  
# the given operations  
def maxInt(string):  
    string2 = "" 
      
    # For every digit  
    for i in range(0, len(string)):  
  
        # Digits greater than or equal to 5  
        # need not to be changed as changing  
        # them will lead to a smaller number  
        if (string[i] < '5'): 
            string2 += str((ord('9') - ord(string[i]))) 
        else: 
            string2 += str(string[i]) 
              
    # The resulting integer  
    # cannot have leading zero  
    if (string2[0] == '0'):  
        string2[0] = '9'
  
    return string2  
  
# Driver code  
if __name__ == '__main__':  
  
    string = "42"
    print(maxInt(string))  
  
# This code is contributed by ashutosh450 

