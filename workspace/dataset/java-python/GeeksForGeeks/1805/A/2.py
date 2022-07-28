

# Python 3 program to check whether  
# the given number is in binary format 
  
# Function that returns true if given  
# number is in binary format i.e. number  
# contains only 0's and/or 1's 
def isBinary(number): 
    set1 = set() 
  
    # Put all the digits of the  
    # number in the set 
    while(number > 0): 
        digit = number % 10
        set1.add(digit) 
        number = int(number / 10) 
  
    # Since a HashSet does not allow  
    # duplicates so only a single copy  
    # of '0' and '1' will be stored 
    set1.discard(0) 
    set1.discard(1) 
      
    # If the original number only  
    # contained 0's and 1's then  
    # size of the set must be 0 
    if (len(set1) == 0): 
        return True
  
    return False
      
# Driver code 
if __name__ == '__main__': 
    n = 1000111
    if(isBinary(n) == 1): 
        print("true") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

