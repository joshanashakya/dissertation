

# Python 3 implementation of above approach 
  
# check whether the first string can be 
# converted to the second string 
# by increasing the ASCII value of prefix 
# string of first string 
def find(s1, s2): 
      
    # length of two strings 
    len__ = len(s1) 
    len_1 = len(s2) 
  
    # If lengths are not equal 
    if (len__ != len_1): 
        return False
  
    # store the difference of ASCII values 
    d = [0 for i in range(len__)]  
  
    # difference of first element 
    d[0] = ord(s2[0]) - ord(s1[0]) 
  
    # traverse through the string 
    for i in range(1, len__, 1): 
          
        # the ASCII value of the second string 
        # should be greater than or equal to first  
        # string, if it is violated return false. 
        if (s1[i] > s2[i]): 
            return False
  
        else: 
              
            # store the difference of ASCII values 
            d[i] = ord(s2[i]) - ord(s1[i]) 
      
    # the difference of ASCII values  
    # should be in descending order 
    for i in range(len__ - 1): 
          
        # if the difference array is not 
        # in descending order 
        if (d[i] < d[i + 1]): 
            return False
  
    # if all the ASCII values of characters of 
    # first string is less than or equal to the  
    # second string and the difference array is  
    # in descending order, return true 
    return True
  
# Driver code 
if __name__ == '__main__': 
      
    # create two strings 
    s1 = "abcd"
    s2 = "bcdd"
  
    # check whether the first string can  
    # be converted to the second string 
    if (find(s1, s2)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Shashank_Sharma 

