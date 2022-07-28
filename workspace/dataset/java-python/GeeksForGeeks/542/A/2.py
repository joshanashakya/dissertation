

# Python 3 program to count number of distinct  
# pairs that can be formed from all possible  
# contiguous sub-arrays containing distinct numbers 
  
def countPairs(arr, n): 
      
    # initialize number of pairs to zero 
    count = 0
  
    # Left and right indexes of  
    # current window 
    right = 0
    left = 0
  
    # Boolean array visited to mark elements  
    # in current window. Initialized as false 
    visited = [False for i in range(n)] 
  
    # While right boundary of current  
    # window doesn't cross right end 
    while (right < n): 
          
        # If current window contains all distinct 
        # elements, widen the window toward right 
        while (right < n and 
               visited[arr[right]] == False): 
            count += (right - left) 
            visited[arr[right]] = True
            right += 1
  
        # If duplicate is found in current window, 
        # then reduce the window from left 
        while (left < right and (right != n and 
               visited[arr[right]] == True)): 
            visited[arr[left]] = False
            left += 1
  
    return count 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 4, 2, 4, 3, 2] 
    n = len(arr) 
  
    print(countPairs(arr, n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

