

# Python3 program to find the maximum  
# possible sum of a window in one  
# array such that elements in same  
# window of other array are unique.  
  
# Function to return maximum sum of window  
# in B[] according to given constraints.  
def returnMaxSum(A, B, n):  
   
    # Map is used to store elements  
    # and their counts.  
    mp = set() 
    result = 0 # Initialize result  
  
    # calculating the maximum possible  
    # sum for each subarray containing  
    # unique elements.  
    curr_sum = curr_begin = 0 
    for i in range(0, n):   
  
        # Remove all duplicate instances  
        # of A[i] in current window.  
        while A[i] in mp:   
            mp.remove(A[curr_begin])  
            curr_sum -= B[curr_begin]  
            curr_begin += 1
           
        # Add current instance of A[i]  
        # to map and to current sum.  
        mp.add(A[i])  
        curr_sum += B[i]  
  
        # Update result if current  
        # sum is more.  
        result = max(result, curr_sum)  
       
    return result  
  
# Driver code  
if __name__ == "__main__": 
   
    A = [0, 1, 2, 3, 0, 1, 4]   
    B = [9, 8, 1, 2, 3, 4, 5]  
    n = len(A)  
    print(returnMaxSum(A, B, n)) 
  
# This code is contributed by Rituraj Jain 

