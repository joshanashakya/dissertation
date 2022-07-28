

# Python3 program to count number of substrings 
# in which each character has count less 
# than or equal to k. 
  
  
# function to find number of substring 
# in which each character has count less 
# than or equal to k. 
  
def find_sub(s, k): 
  
    Len = len(s) 
      
    # initialize left and right pointer to 0 
    lp, rp = 0, 0
                  
    ans = 0
  
    # an array to keep track of count of each alphabet 
    hash_char = [0 for i in range(256)]     
    for rp in range(Len): 
  
        hash_char[ord(s[rp])] += 1
  
        while(hash_char[ord(s[rp])] > k): 
            hash_char[ord(s[lp])] -= 1 # decrement the count 
            lp += 1         #increment left pointer 
  
        ans += rp - lp + 1
  
    return ans 
  
# Driver code 
s = "aaabb"
k = 2; 
print(find_sub(s, k)) 
  
# This code is contributed by mohit kumar 

