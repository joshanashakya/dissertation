

# Python3 implemenation to find the 
# maximum product of the bitonic 
# subsequence of size 3 
  
# Function to find the maximum 
# product of bitonic subsequence 
# of size 3 
def maxProduct(arr, n): 
  
    # Intialize ans to -1 if no such 
    # subsequence exist in the array 
    ans = -1
  
    # Nested loops to choose the three 
    # elements of the array 
    for i in range(n - 2): 
        for j in range(i + 1, n - 1): 
            for k in range(j + 1, n): 
  
                # Condition to check if 
                # they form a bitonic subsequence 
                if (arr[i] < arr[j] and arr[j] > arr[k]): 
                    ans = max(ans, arr[i] * arr[j] * arr[k]) 
  
    return ans 
  
# Driver Code 
if __name__ == '__main__': 
    arr= [ 1, 8, 3, 7] 
  
    n = len(arr) 
  
    # Function call 
    print(maxProduct(arr, n)) 
  
# This code is contributed by mohit kumar 29 

