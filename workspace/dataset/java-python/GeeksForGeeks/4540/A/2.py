

# Python3 code to count number of ways  
# to split array into two groups such 
# that each group has equal XOR value  
  
# Return the count of number of ways 
# to split array into two groups such 
# that each group has equal XOR value. 
def countgroup(a, n): 
    xs = 0
    for i in range(n): 
        xs = xs ^ a[i] 
      
    # We can split only if XOR is 0.  
    # Since XOR of all is 0, we can  
    # consider all subsets as one group. 
    if xs == 0: 
        return (1 << (n-1)) - 1
      
    return 0
      
# Driver Program 
a = [1, 2, 3] 
n = len(a) 
print(countgroup(a, n))  
  
# This code is contributed by "Sharad_Bhardwaj". 

