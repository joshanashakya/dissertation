

# Python3 implementation of the approach 
   
# Function to return the minimum possible 
# integer that can be obtained from the 
# given integer after performing 
# the given operations 
def minInt(str1): 
      
    # For every digit 
    for i in range(len(str1)): 
  
        # Digits less than 5 need not to be 
        # changed as changing them will 
        # lead to a larger number 
        if (str1[i] >= 5): 
            str1[i] = (9 - str1[i]) 
  
    # The resulting integer 
    # cannot have leading zero 
    if (str1[0] == 0): 
        str1[0] = 9
          
    temp = "" 
  
    for i in str1: 
        temp += str(i) 
  
    return temp 
  
# Driver code 
str1 = "589"
str1 = [int(i) for i in str1] 
  
print(minInt(str1)) 
  
# This code is contributed by Mohit Kumar 

