

# Python implementation of the approach 
  
# Function that returns true if  
# n is an Osiris number 
def isOsiris(n): 
      
    # 3rd digit  
    a = n % 10
      
    # 2nd digit 
    b = (n//10)% 10
      
    # 1st digit 
    c = n//100
  
    digit_sum = a + b + c 
  
    # Check the required condition 
    if(n == (2 * (digit_sum) * 11)): 
        return True
      
    return False
  
# Driver code 
if __name__ == '__main__': 
    n = 132
    if isOsiris(n): 
        print("Yes") 
    else : 
        print("No") 

