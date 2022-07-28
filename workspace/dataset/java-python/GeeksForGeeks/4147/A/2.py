

# Optimized Python3 program  
# to check if two strings 
# are k anagram or not. 
MAX_CHAR = 26; 
  
# Function to check if str1  
# and str2 are k-anagram or not 
def areKAnagrams(str1, str2, k): 
    # If both strings are  
    # not of equal length  
    # then return false 
  
    n = len(str1); 
    if (len(str2) != n): 
        return False; 
  
    hash_str1 = [0]*(MAX_CHAR); 
  
    # Store the occurrence of  
    # all characters in a hash_array 
    for i in range(n): 
        hash_str1[ord(str1[i]) - ord('a')]+=1; 
  
    # Store the occurrence of all  
    # characters in a hash_array 
    count = 0; 
    for i in range(n): 
        if (hash_str1[ord(str2[i]) - ord('a')] > 0): 
            hash_str1[ord(str2[i]) - ord('a')]-=1; 
        else: 
            count+=1; 
  
        if (count > k): 
            return False; 
  
    # Return true if count is  
    # less than or equal to k 
    return True; 
  
# Driver code 
str1 = "fodr"; 
str2 = "gork"; 
k = 2; 
if (areKAnagrams(str1, str2, k) == True): 
    print("Yes"); 
else: 
    print("No"); 
          
# This code is contributed by mits 

