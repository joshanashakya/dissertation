

# An efficient Python 3 program to 
# compute the sum of bitwise OR of all pairs 
  
# Returns value of "arr[0] | arr[1] + arr[0] | arr[2] + 
# ... arr[i] | arr[j] + ..... arr[n-2] | arr[n-1]" 
  
def pairORSum(arr, n) : 
    # Initialize result 
    ans = 0
    # Traverse over all bits 
    for i in range(0, 32) : 
        # Count number of elements with the i'th bit set(ie., 1) 
        k1 = 0
          
        # Count number of elements with i’th bit not-set(ie., 0) ` 
        k0 = 0
          
        for j in range(0, n) : 
              
            if( (arr[j] & (1<<i)) ):   # if i'th bit is set 
                k1 = k1 + 1
                  
            else :  
                k0 = k0 + 1
        # There are k1 set bits, means k1(k1-1)/2 pairs. k1C2 
        # There are k0 not-set bits and k1 set bits so total pairs will be k1 * k0. 
  
        # Every pair adds 2 ^ i to the answer. Therefore, 
          
        ans = ans + (1<<i) * (k1*(k1-1)//2) + (1<<i) * (k1 * k0) 
      
    return ans 
      
# Driver program to test above function 
arr = [1, 2, 3, 4] 
n = len(arr)  
print(pairORSum(arr, n)) 

