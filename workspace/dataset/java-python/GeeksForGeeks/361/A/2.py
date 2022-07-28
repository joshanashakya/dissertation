

# Python 3 to find minimum number  
# of elements to remove to get  
# maximum XOR value 
  
def nextPowerOf2(n) : 
    count = 0
  
    # First n in the below condition  
    # is for the case where n is 0  
    if (n and not(n and (n - 1))) : 
        return n 
  
    while n != 0 : 
        n >>= 1
        count += 1
  
    return 1 << count 
  
# Function to find minimum number  
# of elements to be removed.  
def removeElement(n) : 
  
    if n == 1 or n == 2 : 
        return 0
  
    a = nextPowerOf2(n) 
      
    if n == a or n == a - 1 : 
        return 1
  
    elif n == a - 2 : 
        return 0
  
    elif n % 2 == 0 : 
        return 1
  
    else : 
        return 2
      
# Driver Code 
if __name__ == "__main__" : 
  
    n = 5
  
    # print minimum number of  
    # elements to be removed  
    print(removeElement(n)) 
  
# This code is contributed  
# by ANKITRAI1 

