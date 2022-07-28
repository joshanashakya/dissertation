

# A hashing based solution to find the  
# minimum number of subsets of a set such   
# that every subset contains distinct 
# elements. 
  
# Function to count subsets such that  
# all subsets have distinct elements. 
def subset(arr, n): 
      
    # Traverse the input array and 
    # store frequencies of elements 
    mp = {i:0 for i in range(10)} 
    for i in range(n): 
        mp[arr[i]] += 1
      
    # Find the maximum value in map. 
    res = 0
    for key, value in mp.items(): 
        res = max(res, value) 
  
    return res 
  
# Driver code 
if __name__ == '__main__': 
    arr = [5, 6, 9, 3, 4, 3, 4] 
    n = len(arr) 
    print(subset(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

