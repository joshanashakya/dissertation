

# Python3 implementation of the approach  
MAX = 26
  
# Function to return the length of the longest  
# sub-sequence with at least one  
# common character in every string  
def largestSubSeq(arr, n): 
      
    # count[0] will store the number of strings  
    # which contain 'a', count[1] will store the  
    # number of strings which contain 'b' and so on..  
    count = [0] * MAX
      
    # For every string  
    for i in range(n): 
        string = arr[i] 
          
        # Hash array to set which character is  
        # present in the current string  
        _hash = [False] * MAX
        for j in range(len(string)): 
            _hash[ord(string[j]) - ord('a')] = True
          
        for j in range(MAX): 
              
            # If current character appears in the  
            # string then update its count  
            if _hash[j] == True: 
                count[j] += 1
                  
    return max(count) 
  
# Driver code  
if __name__ == "__main__": 
    arr = [ "ab", "bc", "de" ] 
    n = len(arr) 
    print(largestSubSeq(arr, n)) 
  
# This code is contributed by 
# sanjeev2552 

