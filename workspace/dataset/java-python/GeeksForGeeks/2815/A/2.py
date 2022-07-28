

# Python implementation of the approach  
  
# Function to return the count of operations required 
def totalOperations(st, length): 
      
    # Dictionary to store characters and their frequencies 
    d = {} 
    for i in range(length): 
          
        # If already contains the character then  
        # increment its frequency by 1  
        if st[i] in d: 
            d[st[i]] += 1
          
        # Else add the character to the HashMap with frequency 1 
        else: 
            d[st[i]] = 1
  
    # Set to Store unique frequency  
    valueSet = set() 
  
    # Insert frequencies into HashSet  
    for key in d.keys(): 
        valueSet.add(d[key]) 
      
    # Count of unique frequencies 
    return len(valueSet) 
  
# Driver Code 
st = "geeksforgeeks"
l = len(st) 
print(totalOperations(st, l)) 
  
# This code is contributed by Vivekkumar Singh 

