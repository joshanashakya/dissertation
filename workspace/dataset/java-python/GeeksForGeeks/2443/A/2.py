

# Python3 program to check if a number has  
# same counts of 0s and 1s in every block.  
  
# Function to convert decimal to binary  
def isEqualBlock(n):  
  
    # Count same bits in last block  
    first_bit = n % 2
    first_count = 1
    n = n // 2
    while n % 2 == first_bit and n > 0:  
        n = n // 2
        first_count += 1
  
    # If n is 0 or it has all 1s,  
    # then it is not considered to  
    # have equal number of 0s and  
    # 1s in blocks.  
    if n == 0: 
        return False
  
    # Count same bits in all remaining blocks.  
    while n > 0:  
  
        first_bit = n % 2
        curr_count = 1
        n = n // 2
        while n % 2 == first_bit:  
            n = n // 2
            curr_count += 1
          
        if curr_count != first_count:  
            return False
      
    return True
  
# Driver Code 
if __name__ == "__main__":  
  
    n = 51
    if isEqualBlock(n):  
        print("Yes") 
    else: 
        print("No")  
      
# This code is contributed by  
# Rituraj Jain 

