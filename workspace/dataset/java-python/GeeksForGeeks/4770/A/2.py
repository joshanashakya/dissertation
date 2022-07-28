

# Python3 program to calculate sum of 
# Bit-wise and sum of all subsets of 
# an array 
  
BITS = 32; 
  
def andSum(arr, n): 
    ans = 0
      
    # assuming representation  
    # of each element is 
    # in 32 bit 
    for i in range(0, BITS): 
        countSetBits = 0
  
        # iterating array element 
        for j in range(0, n) : 
              
            # Counting the set bit  
            # of array in ith 
            # position 
            if (arr[j] & (1 << i)) : 
                countSetBits = (countSetBits 
                                       + 1) 
  
        # counting subset which  
        # produce sum when  
        # particular bit position 
        # is set. 
        subset = ((1 << countSetBits)  
                                 - 1) 
  
        # multiplying every position  
        # subset with 2^i to count  
        # the sum. 
        subset = (subset * (1 << i)) 
  
        ans = ans + subset 
  
    return ans 
  
# Driver code 
arr = [1, 2, 3] 
size = len(arr) 
print (andSum(arr, size)) 
      
# This code is contributed by  
# Manish Shaw (manishshaw1) 

