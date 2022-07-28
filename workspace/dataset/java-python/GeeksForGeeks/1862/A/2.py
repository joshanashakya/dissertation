

# A Simple Python 3 program to compute 
# sum of bitwise OR of all pairs 
  
# Returns value of "arr[0] | arr[1] + 
# arr[0] | arr[2] + ... arr[i] | arr[j] + 
# ..... arr[n-2] | arr[n-1]" 
def pairORSum(arr, n) : 
    ans = 0 # Initialize result 
  
    # Consider all pairs (arr[i], arr[j)  
    # such that i < j 
    for i in range(0, n) : 
        for j in range((i + 1), n) : 
            ans = ans + arr[i] | arr[j] 
  
    return ans 
  
# Driver program to test above function 
arr = [1, 2, 3, 4] 
n = len(arr)  
print(pairORSum(arr, n)) 

