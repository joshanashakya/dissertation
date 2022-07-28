

# Python3 implementation of the approach 
  
# Function to return the count of 
# set bits in all the integers 
# from the range [1, n] 
def countSetBits(n): 
  
    # To store the required count 
    # of the set bits 
    cnt = 0
  
    # To store the count of set 
    # bits in every integer 
    setBits = [0 for x in range(n + 1)] 
  
    # 0 has no set bit 
    setBits[0] = 0
  
    # 1 has a single set bit 
    setBits[1] = 1
  
    # For the rest of the elements 
    for i in range(2, n + 1):  
  
        # If current element i is even then 
        # it has set bits equal to the count 
        # of the set bits in i / 2 
        if (i % 2 == 0): 
            setBits[i] = setBits[i // 2] 
              
        # Else it has set bits equal to one 
        # more than the previous element 
        else: 
            setBits[i] = setBits[i - 1] + 1
  
    # Sum all the set bits 
    for i in range(0, n + 1):  
        cnt = cnt + setBits[i] 
      
    return cnt 
  
# Driver code 
n = 6
print(countSetBits(n)) 
  
# This code is contributed by Sanjit Prasad 

