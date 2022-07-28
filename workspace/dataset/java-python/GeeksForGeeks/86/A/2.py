

# Function to find  
# the longest Special Sequence 
def longest_subseq(n, k, s): 
    
    # Creating a list with  
    # all 0's of size 
    # equal to the length of string 
    dp = [0] * n 
      
    # Supporting list with  
    # all 0's of size 26 since  
    # the given string consists  
    # of only lower case alphabets 
    max_length = [0] * 26
  
    for i in range(n): 
  
        # Converting the ascii value to 
        # list indices 
        curr = ord(s[i]) - ord('a') 
        # Determining the lower bound 
        lower = max(0, curr - k) 
        # Determining the upper bound 
        upper = min(25, curr + k) 
        # Filling the dp array with values 
        for j in range(lower, upper + 1): 
  
            dp[i] = max(dp[i], max_length[j]+1) 
        # Filling the max_length array with max 
        # length of subsequence till now 
        max_length[curr] = max(dp[i], max_length[curr]) 
  
    # return the max length of subsequence 
    return max(dp) 
  
# driver code 
def main(): 
  s = "geeksforgeeks"
  n = len(s) 
  k = 3
  print(longest_subseq(n, k, s)) 
  
main() 

