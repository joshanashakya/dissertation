

# Python 3 program to find longest subsequence 
# such that there is no 0 after 1. 
  
def maxSubseq(vec, n): 
    # Store the count of number of ones 
    # from right to left in the array 
    suffix = 0
    i = n-1
    while(i >= 0): 
        if (vec[i] == 1): 
            suffix += 1
            vec[i] = suffix 
        i -= 1
              
    # Traverse from left to right, keep count 
    # of 0s and for every 0, check number of  
    # 1s after it. Update the result if needed. 
    res = 0
    zero = 0
    for i in range(0,n,1): 
        if (vec[i] == 0): 
            zero += 1
      
        # Checking the maximum size 
        if (vec[i] > 0): 
            res = max(res, zero + vec[i]) 
      
    # Checking the maximum size 
    return max(res, zero) 
  
# Driver code 
 if __name__ == '__main__': 
    input = [0, 1, 0, 0, 1, 0]  
    n = len(input)  
    print(maxSubseq(input, n)) 
  
# This code is contributed by  
# Surendra_Gangwar 

