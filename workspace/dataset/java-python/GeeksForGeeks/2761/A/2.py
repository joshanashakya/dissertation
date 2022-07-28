

# Python3 implementation of the approach  
  
# Function that return true  
# if pre is a prefix of str  
def startsWith(str, pre): 
    strLen = len(str) 
    preLen = len(pre) 
    i = 0
    j = 0
      
    # While there are characters to match  
    while (i < strLen and j < preLen): 
          
        # If characters differ at any position  
        if (str[i] != pre[j]) : 
            return False
        i += 1
        j += 1
          
    # str starts with pre  
    return True
      
# Function that return true  
# if suff is a suffix of str  
def endsWith(str, suff): 
    i = len(str) - 1
    j = len(suff) - 1
      
    # While there are characters to match  
    while (i >= 0 and j >= 0): 
          
        # If characters differ at any position  
        if (str[i] != suff[j]): 
            return False
        i -= 1
        j -= 1
      
    # str ends with suff  
    return True
  
# Function that returns true  
# if str = a + b or str = b + a  
def checkString(str, a, b): 
      
    # str cannot be generated  
    # by concatenating a and b  
    if (len(str) != len(a) + len(b)): 
        return False
          
    # If str starts with a  
    # i.e. a is a prefix of str  
    if (startsWith(str, a)): 
  
        # Check if the rest of the characters  
        # are equal to b i.e. b is a suffix of str  
        if (endsWith(str, b)): 
            return True
      
    # If str starts with b  
    # i.e. b is a prefix of str  
    if (startsWith(str, b)): 
          
        # Check if the rest of the characters  
        # are equal to a i.e. a is a suffix of str  
        if (endsWith(str, a)): 
            return True
      
    return False
      
# Driver code  
str = "GeeksforGeeks"
a = "Geeksfo"
b = "rGeeks"
  
if (checkString(str, a, b)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by SHUBHAMSINGH10 

