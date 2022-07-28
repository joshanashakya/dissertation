

# Python 3 program to determine minimum  
# number of rotations required to yield  
# same string. 
  
# Returns count of rotations to get the 
# same string back. 
def findRotations(str): 
      
    # tmp is the concatenated string. 
    tmp = str + str
    n = len(str) 
  
    for i in range(1, n + 1): 
          
        # substring from i index of  
        # original string size. 
        substring = tmp[i: i+n] 
  
        # if substring matches with  
        # original string then we will  
        # come out of the loop. 
        if (str == substring): 
            return i 
    return n 
  
# Driver code 
if __name__ == '__main__': 
  
    str = "abc"
    print(findRotations(str)) 
  
# This code is contributed  
# by 29AjayKumar. 

