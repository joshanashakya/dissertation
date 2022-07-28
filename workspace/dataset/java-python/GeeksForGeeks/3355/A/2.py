

# Python3 program to find the count of 
# all unique sub-strings with 
# non-repeating characters 
  
# Function to count all unique 
# distinct character substrings 
def distinctSubstring(P, N): 
      
    # Hashmap to store all substrings 
    S = dict() 
  
    # Iterate over all the substrings 
    for i in range(N): 
  
        # Boolean array to maintain all 
        # characters encountered so far 
        freq = [False]*26
  
        # Variable to maintain the 
        # subtill current position 
        s = "" 
  
        for j in range(i,N): 
  
            # Get the position of the 
            # character in the string 
            pos = ord(P[j]) - ord('a') 
  
            # Check if the character is 
            # encountred 
            if (freq[pos] == True): 
                break
  
            freq[pos] = True
  
            # Add the current character 
            # to the substring 
            s += P[j] 
  
            # Insert subin Hashmap 
            S[s] = 1
  
    return len(S) 
  
# Driver code 
S = "abba"
N = len(S) 
  
print(distinctSubstring(S, N)) 
  
# This code is contributed by mohit kumar 29     

