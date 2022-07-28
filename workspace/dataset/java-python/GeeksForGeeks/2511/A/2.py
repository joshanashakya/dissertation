

# Python 3 implementation of the above approach  
  
# Function to count the minimum number of  
# elements to remove from a number so that  
# pairwise two consecutive digits are same.  
def countConsecutive(s):  
  
    # initialize counting variable  
    count = -1
  
    for i in range(len(s)-1): 
  
        # check if two consecutive  
        # digits are same  
        if(i <= len(s)): 
            if (s[i] is s[i + 1]): 
                i += 1
            else: 
                count += 1
    return count  
  
# Driver code  
if __name__ == '__main__': 
    str = "44522255"
    print(countConsecutive(str)) 
      
# This code is contributed by PrinciRaj1992  

