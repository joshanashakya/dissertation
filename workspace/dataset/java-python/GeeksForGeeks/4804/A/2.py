

# python 3 implementation of the approach 
  
# Function to return the count of required pairs 
def count_pairs(s1, s2,n1,n2): 
    # Map to store the frequencies of 
    # all the strings of array s1[] 
    mp = {s1[i]:0 for i in range(len(s1))} 
  
    # Update the frequencies 
    for i in range(n1): 
        mp[s1[i]] += 1
  
    # To store the count of pairs 
    cnt = 0
  
    # For every string of array s2[] 
    for i in range(n2): 
        # If current string can make a pair 
        if (mp[s2[i]] > 0): 
            # Increment the count of pairs 
            cnt += 1
  
            # Decrement the frequency of the 
            # string as once occurrence has been 
            # used in the current pair 
            mp[s2[i]] -= 1
  
    # Return the count 
    return cnt 
  
# Driver code 
if __name__ == '__main__': 
    s1 = ["abc", "def"] 
    s2 = ["abc", "abc"] 
    n1 = len(s1) 
    n2 = len(s2) 
  
    print(count_pairs(s1, s2, n1, n2)) 
  
# This code is contributed by 
# Surendra_Gangwar 

