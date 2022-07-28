

# Python3 program to find the length  
# of the longest sub-array with an  
# equal number of odd and even elements  
  
# Function that returns the length of  
# the longest sub-array with an equal  
# number of odd and even elements  
def maxSubarrayLength(A, N) :  
  
    # Initialize variable to store result  
    maxLen = 0;  
  
    # Initialize variable to store sum  
    curr_sum = 0;  
  
    # Create an empty map to store  
    # index of the sum  
    hash = {};  
  
    # Loop through the array  
    for i in range(N) : 
        if (A[i] % 2 == 0) : 
            curr_sum -= 1;  
        else : 
            curr_sum += 1;  
  
        # Check if number of even and  
        # odd elements are equal  
        if (curr_sum == 0) : 
            maxLen = max(maxLen, i + 1);  
  
        # If curr_sum already exists in map  
        # we have a subarray with 0 sum, i.e,  
        # equal number of odd and even number  
        if curr_sum in hash : 
            maxLen = max(maxLen, i - hash[curr_sum]);  
  
        # Store the index of the sum  
        else : 
            hash[curr_sum] = i;  
      
    return maxLen;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    arr = [ 12, 4, 7, 8, 9, 2, 11, 0, 2, 13 ];  
    n = len(arr);  
  
    print(maxSubarrayLength(arr, n));  
  
# This code is contributed by AnkitRai01 

