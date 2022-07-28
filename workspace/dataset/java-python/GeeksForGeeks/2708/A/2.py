

# Python 3 program to remove characters from 
# a String that appears exactly K times 
  
MAX_CHAR = 26
  
# Function to reduce the string by 
# removing the characters which 
# appears exactly k times 
def removeChars(arr, k): 
  
    # Hash table initialised to 0 
    hash = [0]*MAX_CHAR 
  
    # Increment the frequency 
    # of the character 
    n = len(arr) 
    for i in range( n): 
        hash[ord(arr[i]) - ord('a')] += 1
  
    # To store answer 
    ans = "" 
  
    # Next index in reduced string 
    index = 0
    for i in range(n): 
  
        # Append the characters which 
        # appears exactly k times 
        if (hash[ord(arr[i]) - ord('a')] != k): 
            ans += arr[i] 
          
    return ans 
  
# Driver code 
if __name__ =="__main__": 
    str = "geeksforgeeks"
    k = 2
  
    # Function call 
    print(removeChars(str, k)) 
  
# This code is contributed by chitranayal 

