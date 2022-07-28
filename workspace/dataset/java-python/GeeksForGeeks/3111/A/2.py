

# Python 3 program to count numbers in  
# the range [l, r] such that all of the  
# digits of the number and it's product 
# with q are unequal 
  
# Function to check if all of the digits 
# in a number and it's product with q 
# are unequal or not 
def checkIfUnequal(n, q): 
      
    # convert first number into string 
    s1 = str(n) 
    a = [0 for i in range(26)] 
  
    # Insert elements from 1st number 
    # to hash 
    for i in range(0, len(s1), 1): 
        a[ord(s1[i]) - ord('0')] += 1
  
    # Calculate corresponding product 
    prod = n * q 
  
    # Convert the product to string 
    s2 = str(prod) 
  
    # Using the hash check if any digit of 
    # product matches with the digits of 
    # input number 
    for i in range(0, len(s2), 1): 
          
        # if yes, return false 
        if (a[ord(s2[i]) - ord('0')]): 
            return False
  
    # else, return true 
    return True
  
# Function to count numbers in the range [l, r] 
# such that all of the digits of the number and 
# it's product with q are unequal 
def countInRange(l, r, q): 
    count = 0
  
    for i in range(l, r + 1, 1): 
          
        # check for every number between l and r 
        if (checkIfUnequal(i, q)): 
            count += 1
      
    return count 
  
# Driver Code 
if __name__ == '__main__': 
    l = 10
    r = 12
    q = 2
  
    print(countInRange(l, r, q)) 
  
# This code is contributed by 
# Sahil_Shelangia 

