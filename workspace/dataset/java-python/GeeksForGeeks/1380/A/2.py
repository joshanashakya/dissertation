

# Python 3 program to print the length of the 
# longest subarray such that adjacent elements 
# of the subarray have at least one digit in  
# common. 
import sys 
  
# function to print the longest subarray 
# such that adjacent elements have at least 
# one digit in common 
def longestSubarray(a, n): 
      
    # remembers the occurrence of digits  
    # in i-th index number 
    hash = [[0 for i in range(10)] 
               for j in range(n)] 
  
    # marks the presence of digit in 
    # i-th index number 
    for i in range(n): 
        num = a[i] 
        while (num): 
              
            # marks the digit 
            hash[i][num % 10] = 1
            num = int(num / 10) 
      
    # counts the longest Subarray 
    longest = -sys.maxsize-1
      
    # counts the subarray 
    count = 0
  
    # check for all adjacent elements 
    for i in range(n - 1): 
        for j in range(10): 
              
            # if adjacent elements have digit j  
            # in them count and break as we have 
            # got at-least one digit 
            if (hash[i][j] and hash[i + 1][j]): 
                count += 1
                break
          
        # if no digits are common 
        if (j == 10): 
            longest = max(longest, count + 1) 
            count = 0
      
    longest = max(longest, count + 1) 
  
    # returns the length of the longest  
    # subarray 
    return longest 
  
# Driver Code 
if __name__ == '__main__': 
    a = [11, 22, 33, 44, 54, 56, 63] 
  
    n = len(a) 
      
    # function call 
    print(longestSubarray(a, n)) 
      
# This code is contributed by 
# Sanjit_Prasad 

