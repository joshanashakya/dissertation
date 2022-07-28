

# Python3 Program to find the  
# maximum subset with bitwise 
# OR equal to k 
    
# function to find the maximum  
# subset with bitwise OR equal to k 
def subsetBitwiseORk(arr, n, k) : 
    v = [] 
    
    for i in range(0, n) :  
        # If the bitwise OR of k  
        # and element is equal to k, 
        # then include that element 
        # in the subset 
        if ((arr[i] | k) == k) : 
            v.append(arr[i]) 
    
    # Store the bitwise OR 
    # of elements in v 
    ans = 0
    
    for i in range(0, len(v)) : 
        ans |= v[i] 
    
    # If ans is not equal to 
    # k, subset doesn't exist 
    if (ans != k) : 
        print ("Subset does not exist\n") 
        return
    
    for i in range(0, len(v)) : 
        print ("{} ".format(v[i]), end="") 
    
# Driver Code 
k = 3
arr = [1, 4, 2] 
n = len(arr) 
    
subsetBitwiseORk(arr, n, k) 
    
# This code is contributed by  
# Manish Shaw(manishshaw1) 

