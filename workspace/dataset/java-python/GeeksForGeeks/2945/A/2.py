

# Python3 implementation of the approach 
  
# Function to reverse the middle x characters in a str1ing 
def reverse(str1, x): 
  
    # Find the position from where 
    # the characters have to be reversed 
    n = (len(str1) - x) // 2
  
    # Print the first n characters 
    for i in range(n): 
        print(str1[i], end="") 
  
    # Print the middle x characters in reverse 
    for i in range(n + x - 1, n - 1, -1): 
        print(str1[i], end="") 
  
    # Print the last n characters 
    for i in range(n + x, len(str1)): 
        print(str1[i], end="") 
  
  
# Driver code 
str1 = "geeksforgeeks"
x = 3
reverse(str1, x) 
  
# This code is contributed by mohit kumar 29. 

