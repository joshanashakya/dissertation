

# Python3 implementation to find   
# number of pairs of integers i, j   
# such that s[i] is an anagram of s[j].   
    
# Function to find number of pairs of integers   
# i, j such that s[i] is an anagram of s[j]. 
def anagram_pairs(s, n): 
    # To store the count of sorted strings 
    mp = dict() 
  
    # Traverse all strings and store in the map  
    for i in range(n): 
        # Sort the string  
        temp_str = "".join(sorted(s[i])) 
  
        # If string exists in map, increment count 
        # Else create key value pair with count = 1 
        if temp_str in mp: 
            mp[temp_str] += 1
        else: 
            mp[temp_str] = 1
  
    # To store the number of pairs 
    ans = 0
  
    # Traverse through the map 
    for k in mp.values(): 
  
        # Count the pairs for each string  
        ans += (k * (k - 1)) // 2
  
    # Return the required answer  
    return ans 
  
# Driver code 
if __name__ == "__main__": 
    s = ["aaab", "aaba", "baaa", "cde", "dec"] 
    n = len(s) 
  
    print(anagram_pairs(s, n))  
  
# This code is contributed by AnkitRai01 

