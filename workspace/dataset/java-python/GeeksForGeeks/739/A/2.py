

# Python3 implementation of the approach 
  
# Function that returns the minimum 
# number greater than Maximum of the 
# array that cannot be formed using the 
# elements of the array 
def findNumber(arr, n): 
  
    # Sort the given array 
    arr = sorted(arr) 
  
    # Maximum number in the array 
    Max = arr[n - 1] 
  
    # table[i] will store the minimum number of 
    # elements from the array to form i 
    table = [10**9 for i in range((2 * Max) + 1)] 
  
    table[0] = 0
  
    ans = -1
  
    # Calculate the minimum number of elements 
    # from the array required to form 
    # the numbers from 1 to (2 * Max) 
    for i in range(1, 2 * Max + 1): 
        for j in range(n): 
            if (arr[j] <= i): 
                res = table[i - arr[j]] 
                if (res != 10**9 and res + 1 < table[i]): 
                    table[i] = res + 1
              
        # If there exists a number greater than 
        # the Maximum element of the array that can be 
        # formed using the numbers of array 
        if (i > arr[n - 1] and table[i] == 10**9): 
            ans = i 
            break
          
    return ans 
  
# Driver code 
arr = [6, 7, 15] 
n = len(arr) 
  
print(findNumber(arr, n)) 
   
# This code is contributed by mohit kumar 

