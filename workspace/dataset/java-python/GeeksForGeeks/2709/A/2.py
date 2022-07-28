

# Python 3 program to count number of  
# ways of removing a substring from a  
# string such that all remaining 
# characters are equal 
  
# Function to return the number of  
# ways of removing a sub-string from  
# s such that all the remaining  
# characters are same 
def no_of_ways(s): 
    n = len(s) 
  
    # To store the count of  
    # prefix and suffix 
    count_left = 0
    count_right = 0
  
    # Loop to count prefix 
    for i in range(0, n, 1): 
        if (s[i] == s[0]): 
            count_left += 1
        else: 
            break
  
    # Loop to count suffix 
    i = n - 1
    while(i >= 0): 
        if (s[i] == s[n - 1]): 
            count_right += 1
        else: 
            break
  
        i -= 1
  
    # First and last characters of  
    # the string are same 
    if (s[0] == s[n - 1]): 
        return ((count_left + 1) * 
                (count_right + 1)) 
  
    # Otherwise 
    else: 
        return (count_left + count_right + 1) 
  
# Driver Code 
if __name__ == '__main__': 
    s = "geeksforgeeks"
    print(no_of_ways(s)) 
  
# This code is contributed by 
# Sahil_shelengia 

