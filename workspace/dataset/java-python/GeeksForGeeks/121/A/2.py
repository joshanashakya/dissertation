

# Program to find length of 
# Longest Permutaion Subsequence 
# in a given array 
from collections import defaultdict 
  
# Function to find the 
# longest permutation subsequence 
def longestPermutation(a, n): 
   
    # Map data structure to 
    # count the frequency of each element 
    freq = defaultdict(int) 
   
    for i in range( n ): 
   
        freq[a[i]] += 1
   
    length = 0
   
    for i in range(1 , n + 1): 
   
        # If frequency of element is 0, 
        # then we can not move forward 
        # as every element should be present 
        if (freq[i] == 0): 
            break
   
        # Increasing the length by one 
        length += 1 
          
    return length 
   
# Driver Code 
if __name__ == "__main__": 
   
    arr = [ 3, 2, 1, 6, 5 ] 
    n = len(arr) 
   
    print(longestPermutation(arr, n)) 
  
# This code is contributed by chitranayal 

