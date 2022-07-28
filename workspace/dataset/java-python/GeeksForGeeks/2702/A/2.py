

# Python3 implementation to find the 
# maximum repeated frequency of  
# characters in the given string 
  
# Function to find the maximum 
# repeated frequency of the  
# characters in the given string 
def findMaxFrequency(s): 
      
    # Hash-Array to store the  
    # frequecy of characters 
      
    arr = [0]*26
      
    # Loop to find the frequecy 
    # of the characters 
    for i in range(len(s)): 
        arr[ord(s[i]) - ord('a')] += 1
          
    # Hash map to store the occurence 
    # of frequencies of characters 
      
    hash = {} 
    for i in range(26): 
        if (arr[i] != 0): 
            if arr[i] not in hash: 
                hash[arr[i]] = 0
            hash[arr[i]] += 1
              
    # Loop to find the maximum 
    # Repeated frequency from hash-map 
    max_count = 0
    res = -1
    for i in hash: 
        if (max_count < hash[i]): 
            res = i 
            max_count = hash[i] 
      
    print("Frequency", res, "is repeated", max_count, "times") 
  
# Driver Code 
  
s = "geeksgeeks"
  
# Function Call 
findMaxFrequency(s) 
  
# This code is contributed by shubhamsingh10 

