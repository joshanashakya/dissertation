

# Python3 program check if characters in  
# the input string follows the same order  
# as determined by characters present in 
# the given pattern 
  
# Function to check if characters in the  
# input string follows the same order as  
# determined by characters present  
# in the given pattern 
def checkPattern(string, pattern): 
  
    # len stores length of the given pattern 
    l = len(pattern) 
  
    # if length of pattern is more than length  
    # of input string, return false; 
    if len(string) < l: 
        return False
  
    for i in range(l - 1): 
  
        # x, y are two adjacent characters in pattern 
        x = pattern[i] 
        y = pattern[i + 1] 
  
        # find index of last occurrence of  
        # character x in the input string 
        last = string.rindex(x) 
  
        # find index of first occurrence of  
        # character y in the input string 
        first = string.index(y) 
  
        # return false if x or y are not present  
        # in the input string OR last occurrence of  
        # x is after the first occurrence of y  
        # in the input string 
        if last == -1 or first == -1 or last > first: 
            return False
  
    # return true if  
    # string matches the pattern 
    return True
  
# Driver Code 
if __name__ == "__main__": 
    string = "engineers rock"
    pattern = "gsr"
    print(checkPattern(string, pattern)) 
  
# This code is contributed by 
# sanjeev2552 

