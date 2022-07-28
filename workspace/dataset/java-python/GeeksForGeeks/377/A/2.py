

# Python 3 implementation of the approach 
  
# Function to find the sum pairs 
# that occur the most 
def findSumPairs(a, n): 
      
    # Hash-table 
    mpp = {i:0 for i in range(21)} 
    for i in range(n - 1): 
        for j in range(i + 1, n, 1): 
              
            # Keep a count of sum pairs 
            mpp[a[i] + a[j]] += 1
  
    # Variables to store 
    # maximum occurrence 
    occur = 0
  
    # Iterate in the hash table 
    for key, value in mpp.items(): 
        if (value > occur): 
            occur = value 
  
    # Print all sum pair which occur 
    # maximum number of times 
    for key, value in mpp.items(): 
        if (value == occur): 
            print(key) 
  
# Driver code 
if __name__ == '__main__': 
    a = [1, 8, 3, 11, 4, 9, 2, 7] 
    n = len(a) 
    findSumPairs(a, n) 
  
# This code is contributed by 
# Surendra_Gangwar 

