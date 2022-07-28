

# Python 3 program to count the  
# minimum number of digits to be  
# removed from a number so that 
# no two consecutive digits are same 
  
# Function to count the minimum  
# number of digits to remove from  
# a number so that no two consecutive 
# digits are same. 
def countConsecutive(n): 
  
    # convert the number to string 
    s = str(n) 
  
    # initialize counting variable 
    count = 0
  
    for i in range(len(s) - 1): 
          
        # check if two consecutive 
        # digits are same 
        if (s[i] == s[i + 1]):  
            count += 1
  
    return count 
  
# Driver code 
if __name__ == "__main__": 
    n = 44522255
    print( countConsecutive(n)) 
  
# This code is contributed  
# by ChitraNayal  

