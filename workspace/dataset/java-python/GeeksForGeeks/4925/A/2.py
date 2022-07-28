

# Python 3 program to count substrings with same 
# first and last characters 
  
# Function to count subtrings with same first and  
# last characters 
def countSubstrs(str, i, j, n): 
  
    # base cases 
    if (n == 1): 
        return 1
    if (n <= 0): 
        return 0
  
    res = (countSubstrs(str, i + 1, j, n - 1)  
        + countSubstrs(str, i, j - 1, n - 1)  
        - countSubstrs(str, i + 1, j - 1, n - 2))      
  
    if (str[i] == str[j]): 
        res += 1
  
    return res 
  
# driver code 
str = "abcab"
n = len(str) 
print(countSubstrs(str, 0, n - 1, n)) 
  
# This code is contributed by Smitha 

