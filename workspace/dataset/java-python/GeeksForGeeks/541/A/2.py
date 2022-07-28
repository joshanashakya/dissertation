

# Python3 implementation to count the  
# number of pairs whose difference 
# is atmost K in an array 
  
  
# Function to count the  
# number of pairs whose difference 
# is atmost K in an array 
def countPairs(arr, k): 
      
    # Sorting the Array 
    arr.sort() 
      
    # Variable to store the count of pairs 
    # whose difference is atmost K 
    pair = 0
    index = 0
      
    # Loop to consider the consecutive 
    # pairs of the array 
    while(index < len(arr)-1): 
          
        # if Pair found increment  
        # the index by 2  
        if arr[index + 1] - arr[index] <= k: 
            pair += 1
            index += 2
        else: 
            index += 1
              
    return pair 
  
# Driver Code 
if __name__ == "__main__": 
    arr = [1, 4, 3, 7, 5] 
    k = 2
    # Function Call 
    count = countPairs(arr, k) 
    print(count) 

