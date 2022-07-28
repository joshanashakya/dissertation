

# Python3 implementation to find XOR of 
# pairwise sum of every unordered 
# pairs in an array 
  
# Function to find XOR of pairwise 
# sum of every unordered pairs 
def xorOfSum(a, n): 
    answer = 0
  
    # Loop to choose every possible 
    # pairs in the array 
    for i in range(n): 
        for j in range(i + 1, n): 
            answer ^= (a[i] + a[j]) 
  
    return answer 
  
# Driver Code 
if __name__ == '__main__': 
    n = 3
    A=[1, 2, 3] 
  
    print(xorOfSum(A, n)) 
  
# This code is contributed by mohit kumar 29 

