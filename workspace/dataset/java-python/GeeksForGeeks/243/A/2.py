

# Python 3 program to find sum of  
# bitwise OR of all subarrays  
  
# from math lib. import log2 function 
from math import log2 
  
# Function to find sum of bitwise OR  
# of all subarrays  
def givesum(A, n) : 
  
    # Find max element of the array  
    max_element = max(A)  
  
    # Find the max bit position set in  
    # the array  
    maxBit = int(log2(max_element)) + 1
  
    totalSubarrays = n * (n + 1) // 2
  
    s = 0
  
    # Traverse from 1st bit to last bit which  
    # can be set in any element of the array  
    for i in range(maxBit) :  
        c1 = 0
  
        # List to store indexes of the array  
        # with i-th bit not set  
        vec = [] 
  
        sum = 0
  
        # Traverse the array  
        for j in range(n) :  
  
            # Check if ith bit is not set in A[j]  
            a = A[j] >> i 
              
            if (not(a & 1)) : 
                vec.append(j) 
  
        # Variable to store count of subarrays  
        # whose bitwise OR will have i-th bit  
        # not set  
        cntSubarrNotSet = 0
  
        cnt = 1
  
        for j in range(1, len(vec)) : 
              
            if (vec[j] - vec[j - 1] == 1) :  
                cnt += 1
              
            else : 
                  
                cntSubarrNotSet += cnt * (cnt + 1) // 2
  
                cnt = 1
              
        # For last element of vec  
        cntSubarrNotSet += cnt * (cnt + 1) // 2
  
        # If vec is empty then cntSubarrNotSet  
        # should be 0 and not 1 
        if len(vec) == 0: 
            cntSubarrNotSet = 0    
  
        # Variable to store count of subarrays  
        # whose bitwise OR will have i-th bit set  
        cntSubarrIthSet = totalSubarrays - cntSubarrNotSet  
  
        s += cntSubarrIthSet * pow(2, i)  
      
    return s 
  
# Driver code  
if __name__ == "__main__" : 
  
    A = [ 1, 2, 3, 4, 5 ] 
    n = len(A) 
  
    print(givesum(A, n)) 
  
# This code is contributed by Ryuga 

