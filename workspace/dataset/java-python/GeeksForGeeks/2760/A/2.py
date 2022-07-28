

# Python3 code for finding length of  
# longest balanced substring 
  
# Returns length of the longest substring  
# with equal number of zeros and ones. 
def stringLen( str ): 
  
    # Create a python dictionary to store 
    # differences between counts of 1s and 0s. 
    m = dict() 
      
    # Initially difference is 0. 
    m[0] = -1
      
    count_0 = 0
    count_1 = 0
    res = 0
    for i in range(len(str)): 
          
        # Keeping track of counts of 
        # 0s and 1s. 
        if str[i] == '0': 
            count_0 += 1
        else: 
            count_1 += 1
              
        # If difference between current  
        # counts already exists, then  
        # substring between previous and  
        # current index has same no. of  
        # 0s and 1s. Update result if  
        # this substring is more than  
        # current result. 
        if m.get(count_1 - count_0): 
            res = max(res, i - m[count_1 - count_0]) 
          
        # If current difference is  
        # seen first time. 
        else: 
            m[count_1 - count_0] = i 
    return res 
  
# driver code 
str = "101001000"
print("Length of longest balanced"
     " sub string = ",stringLen(str)) 
  
# This code is contributed by "Sharad_Bhardwaj" 

