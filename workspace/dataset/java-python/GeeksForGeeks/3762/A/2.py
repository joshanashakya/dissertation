

# Python3 implementation of the approach 
  
# Utility function to print the  
# given binary string 
def printBinStr(string, length): 
  
    for i in range(0, length):  
        print(string[i], end = "") 
      
    print() 
  
# This function will be called recursively 
# to generate the next bit for given 
# binary string according to its current state 
def generateBinStr(string, length, currlen, 
                            occur, nextbit): 
  
    # Base-case: if the generated binary 
    # string meets the required length and 
    # the pattern "01" appears twice 
    if currlen == length: 
  
        # nextbit needs to be 0 because each 
        # time we call the function recursively, 
        # we call 2 times for 2 cases: 
        # next bit is 0 or 1 
        # The is to assure that the binary 
        # string is printed one time only 
        if occur == 2 and nextbit == 0: 
            printBinStr(string, length) 
        return
  
    # Generate the next bit for 
    # str and call recursive 
    if currlen == 0:  
  
        # Assign first bit 
        string[0] = nextbit 
  
        # The next generated bit will  
        # either be 0 or 1 
        generateBinStr(string, length, 
                       currlen + 1, occur, 0) 
        generateBinStr(string, length,  
                       currlen + 1, occur, 1) 
      
    else: 
  
        # If pattern "01" occurrence is < 2 
        if occur < 2:  
  
            # Set next bit 
            string[currlen] = nextbit 
  
            # If pattern "01" appears then 
            # increase the occurrence of pattern 
            if string[currlen - 1] == 0 and nextbit == 1: 
                occur += 1
              
            generateBinStr(string, length,  
                           currlen + 1, occur, 0) 
            generateBinStr(string, length,  
                           currlen + 1, occur, 1) 
  
            # Else pattern "01" occurrence equals 2 
          
        else: 
  
            # If previous bit is 0 then next bit cannot be 1 
            if string[currlen - 1] == 0 and nextbit == 1:  
                return
  
                # Otherwise 
              
            else: 
                string[currlen] = nextbit 
                generateBinStr(string, length,  
                               currlen + 1, occur, 0) 
                generateBinStr(string, length, 
                               currlen + 1, occur, 1) 
  
# Driver code 
if __name__ == "__main__": 
  
    n = 5
  
    # Length of the resulting strings 
    # must be at least 4 
    if n < 4: 
        print(-1) 
    else: 
        string = [None] * n 
  
        # Generate all binary strings of length n 
        # with sub-string "01" appearing twice 
        generateBinStr(string, n, 0, 0, 0) 
        generateBinStr(string, n, 0, 0, 1) 
      
# This code is contributed by Rituraj Jain 

