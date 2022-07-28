

# Python3 program to find minimum number of steps to 
# convert a given sequence into a permutation 
  
# Function to find minimum number of steps to 
# convert a given sequence into a permutation 
def get_permutation(arr, n): 
  
    # Sort the given array 
    arr = sorted(arr) 
  
    # To store the required minimum 
    # number of operations 
    result = 0
  
    # Find the operations on each step 
    for i in range(n): 
        result += abs(arr[i] - (i + 1)) 
  
    # Return the answer 
    return result 
  
# Driver code 
if __name__ == '__main__': 
    arr=[0, 2, 3, 4, 1, 6, 8, 9] 
    n = len(arr) 
  
    # Function call 
    print(get_permutation(arr, n)) 
  
# This code is contributed by mohit kumar 29     

