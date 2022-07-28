

# Python3 implementation of the approach 
import sys 
import math 
  
# Function to print the odd frequency characters  
# in the order of their occurrence  
def printChar(str_, n): 
  
    # To store the frequency of each of  
    # the character of the string and 
    # Initialize all elements of freq[] to 0  
    freq = [0] * 26
  
    # Update the frequency of each character  
    for i in range(n): 
        freq[ord(str_[i]) - ord('a')] += 1
      
    # Traverse str character by character  
    for i in range(n): 
  
        # If frequency of current character is odd  
        if (freq[ord(str_[i]) - 
                 ord('a')]) % 2 == 1: 
            print("{}".format(str_[i]), end = "") 
  
# Driver code 
if __name__=='__main__': 
    str_ = "geeksforgeeks"
    n = len(str_) 
    printChar(str_, n) 
  
# This code is contributed by Vikash Kumar 37 

