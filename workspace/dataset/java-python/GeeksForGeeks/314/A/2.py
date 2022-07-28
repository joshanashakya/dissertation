

# Python 3 program of above approach 
  
# function to find longest subarray 
def longestsubarray(arr, n, k): 
    current_count = 0
      
    # this will contain length of  
    # longest subarray found 
    max_count = 0
  
    for i in range(0, n, 1): 
        if (arr[i] % k == 0): 
            current_count += 1
        else: 
            current_count = 0
        max_count = max(current_count,  
                            max_count) 
      
    return max_count 
  
# Driver code 
if __name__ == '__main__': 
    arr = [2, 5, 11, 32, 64, 88]      
    n = len(arr) 
    k = 8
    print(longestsubarray(arr, n, k)) 
  
# This code is contributed by 
# Surendra_Gangwar 

