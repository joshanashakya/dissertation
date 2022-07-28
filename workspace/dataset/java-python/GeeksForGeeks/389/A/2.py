

# Function to return the required string 
def smallestString(N, A): 
      
    # First character will always be 'a' 
    ch = 'a'
  
    # To store the resultant string 
    S = "" 
  
    # Since length of the string should be 
    # greater than 0 and first element 
    # of array should be 1 
    if (N < 1 or A[0] != 1): 
        S = "-1"
        return S 
  
    S += str(ch) 
    ch = chr(ord(ch) + 1) 
  
    # Check one by one all element of  
    # given prefix array 
    for i in range(1, N): 
        diff = A[i] - A[i - 1] 
  
        # If the difference between any two 
        # consecutive elements of the prefix  
        # array is greater than 1 then there  
        # will be no such string possible that  
        # satisfies the given array.  
        # Also, string cannot have more than 
        # 26 distinct characters 
        if (diff > 1 or diff < 0 or A[i] > 26): 
            S = "-1"
            return S 
  
        # If difference is 0 then the  
        # (i + 1)th character will be  
        # same as the ith character 
        elif (diff == 0): 
            S += 'a'
  
        # If difference is 1 then the  
        # (i + 1)th character will be  
        # different from the ith character 
        else: 
            S += ch 
            ch = chr(ord(ch) + 1) 
  
    # Return the resultant string 
    return S 
  
# Driver code 
arr = [1, 1, 2, 3, 3] 
n = len(arr) 
print(smallestString(n, arr)) 
  
# This code is contributed  
# by mohit kumar 

