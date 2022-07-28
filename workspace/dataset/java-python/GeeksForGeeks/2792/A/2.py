

      
# Python3 implementation of the approach 
  
# Recursive function to convert 
# string to integer 
def stringToInt(str): 
  
    # If the number represented as a string 
    # contains only a single digit 
    # then returns its value 
    if (len(str) == 1): 
        return ord(str[0]) - ord('0'); 
  
    # Recursive call for the sub-string 
    # starting at the second character 
    y = stringToInt(str[1:]); 
  
    # First digit of the number 
    x = ord(str[0]) - ord('0'); 
      
    # First digit multiplied by the 
    # appropriate power of 10 and then 
    # add the recursive result 
    # For example, xy = ((x * 10) + y) 
    x = x * (10**(len(str) - 1)) + y; 
    return int(x); 
  
# Driver code 
if __name__ == '__main__': 
    str = "1235"; 
    print(stringToInt(str)); 
  
# This code is contributed by PrinciRaj1992  

