

# Python 3 implementation to count subsequences  
# having maximum distinct elements 
  
# function to count subsequences having 
# maximum distinct elements 
def countSubseq(arr, n): 
      
    # unordered_map 'um' implemented 
    # as hash table 
    # take range equal to maximum  
    # value of arr 
    um = {i:0 for i in range(8)} 
  
    count = 1
  
    # count frequency of each element 
    for i in range(n): 
        um[arr[i]] += 1
  
    # traverse 'um' 
    for key, values in um.items(): 
          
        # multiply frequency of each element 
        # and accumulate it in 'count' 
        if(values > 0): 
            count *= values 
  
    # required number of subsequences 
    return count 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [4, 7, 6, 7] 
    n = len(arr) 
    print("Count =", countSubseq(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

