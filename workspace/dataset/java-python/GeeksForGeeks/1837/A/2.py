

# Python 3 implementation of the approach 
from math import log2 
  
# Function to find an integer X such that 
# the sum of all the array elements after 
# getting XORed with X is minimum 
def findX(arr, n): 
      
    # Finding Maximum element of array 
    itr = arr[0] 
    for i in range(len(arr)): 
          
        # Find Maximum number of bits required 
        # in the binary representation 
        # of maximum number 
        # so log2 is calculated 
        if(arr[i] > itr): 
            itr = arr[i] 
  
    p = int(log2(itr)) + 1
  
    # Running loop from p times which is 
    # the number of bits required to represent 
    # all the elements of the array 
    X = 0
    for i in range(p): 
        count = 0
        for j in range(n): 
              
            # If the bits in same position are set 
            # then increase count 
            if (arr[j] & (1 << i)): 
                count += 1
  
        # If count becomes greater than half of 
        # size of array then we need to make 
        # that bit '0' by setting X bit to '1' 
        if (count > int(n / 2)): 
              
            # Again using shift operation to calculate 
            # the required number 
            X += 1 << i 
  
    # Calculate minimized sum 
    sum = 0
    for i in range(n): 
        sum += (X ^ arr[i]) 
  
    # Print solution 
    print("X =", X, ", Sum =", sum) 
  
# Driver code 
if __name__=='__main__': 
    arr = [2, 3, 4, 5, 6] 
    n = len(arr) 
    findX(arr, n) 
      
# This code is contributed by 
# Surendra_Gangwar 

