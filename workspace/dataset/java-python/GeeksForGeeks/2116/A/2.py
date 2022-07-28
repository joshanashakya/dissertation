

# Python3 program to find the length  
# of subsequence which has atleast  
# one digit common among all its elements  
  
# If the number contains a digit increase  
# the count by 1 (even if it has multiple  
# same digit the count should be increased  
# by only once)  
def count_(count, e): 
  
    # Hash to make it sure that a digit  
    # is counted only once  
    hash = [False] * 10
  
    # Extract the digits  
    while (e > 0):  
  
        # If the digit did not  
        # appear before  
        if (hash[e % 10] == False) : 
  
            # Increase the count  
            count[e % 10] += 1
  
        # Mark the digit as visited  
        hash[e % 10] = True
  
        # Delete the digit  
        e //= 10
  
# Function to find the length of  
# subsequence which has atleast  
# one digit common among all its elements  
def find_subsequence(arr, n) : 
  
    # Count of digits  
    count = [0] * 10
  
    for i in range ( n) :  
  
        # Extract the digits of the element  
        # and increase the count  
        count_(count, arr[i]) 
  
    # Longest subsequence  
    longest = 0
  
    # Get the longest subsequence  
    for i in range(10) : 
        longest = max(count[i], longest) 
  
    # Print the length of  
    # longest subsequence  
    print (longest) 
  
# Driver code  
if __name__ == "__main__": 
  
    arr = [ 11, 12, 23, 74, 13 ] 
  
    n = len(arr) 
  
    find_subsequence(arr, n) 
  
# This code is contributed 
# by ChitraNayal 

