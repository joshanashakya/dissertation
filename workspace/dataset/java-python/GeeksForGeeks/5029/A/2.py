

# Python3 implementation of the approach 
  
# Function to return the minimum  
# value of x from the given array q 
def Get_Minimum(q): 
    minimum = 0
    sum = 0
    for i in range(n - 1): 
        sum += q[i] 
        if sum < minimum: 
            minimum = sum
    return minimum 
  
# Function to return the  
# required permutation 
def Find_Permutation(q): 
    p = [0] * n 
    min_value = Get_Minimum(q) 
  
    # Set the value of p[0]  
    # i.e. x = p[0] 
    p[0]= 1 - min_value 
  
    # Iterate over array q[] 
    for i in range(n - 1): 
        p[i + 1] = p[i] + q[i] 
  
    okay = True
  
    # Check if formed permutation  
    # is correct or not 
    for i in range(n): 
        if p[i] < 1 or p[i] > n: 
            okay = False
    if len(set(p)) != n: 
        okay = False
  
    # Return the permutation p 
    if okay: 
        return p 
    else: 
        return -1
  
# Driver code 
if __name__=="__main__": 
    q = [-2, 1] 
    n = len(q) + 1
    print(Find_Permutation(q)) 

