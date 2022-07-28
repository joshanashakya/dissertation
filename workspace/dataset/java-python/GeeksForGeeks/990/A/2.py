

# Python 3 implementation to find 
# longest suffix of the string 
# such that occurrence of each  
# character is less than K 
  
# Function to find the maximum 
# length suffix in the string 
def maximumSuffix(s, n, k): 
      
    # Length of the string 
    i = len(s)- 1
  
    # Map to store the number 
    # of occurrence of character 
    arr = [0 for i in range(26)] 
    suffix = "" 
      
    # Loop to iterate string  
    # from the last character 
    while (i > -1): 
        index = ord(s[i]) - ord('a'); 
          
        # Condition to check if the  
        # occurrence of each character 
        # is less than given number 
        if (arr[index] < n): 
            arr[index] += 1
            suffix += s[i] 
            i -= 1
            continue
          
        # Condition when character 
        # cannot be deleted 
        if (k == 0): 
            break
        k -= 1
        i -= 1
      
    suffix = suffix[::-1] 
      
    # Longest suffix 
    print(suffix) 
  
# Driver Code 
if __name__ == '__main__': 
    str = "iahagafedcba"
  
    n = 1
    k = 2
      
    # Function call 
    maximumSuffix(str, n, k) 
  
# This code is contributed by Surendra_Gangwar 

