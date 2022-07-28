

# Python 3 implementation of the approach 
  
# Function to check if it is possible 
# to place C magnets assuming mid as 
# maximum possible distance 
def isPossible(arr, n, C, mid): 
      
    # Variable magnet will store count of  
    # magnets that got placed and  
    # currPosition will store the position  
    # of last placed magnet 
    magnet = 1
    currPosition = arr[0] 
  
    for i in range(1, n): 
          
        # If difference between current index  
        # and last placed index is greater than  
        # or equal to mid it will allow placing  
        # magnet to this index 
        if (arr[i] - currPosition >= mid): 
            magnet += 1
  
            # Now this index will become 
            # last placed index 
            currPosition = arr[i] 
  
            # If count of magnets placed becomes C 
            if (magnet == C): 
                return True
  
    # If count of placed magnet is 
    # less than C then return false 
    return False
  
# Function for modified binary search 
def binarySearch(n, C, arr): 
      
    # Sort the indices in ascending order 
    arr.sort(reverse = False) 
  
    # Minimum possible distance 
    lo = 0
  
    # Maximum possible distance 
    hi = arr[n - 1] 
    ans = 0
  
    # Run the loop until lo becomes 
    # greater than hi 
    while (lo <= hi): 
        mid = int((lo + hi) / 2) 
  
        # If not possibble, decrease value of hi 
        if (isPossible(arr, n, C, mid) == False): 
            hi = mid - 1
        else: 
              
            # Update the answer 
            ans = max(ans, mid) 
            lo = mid + 1
  
    # Return maximum possible distance 
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    C = 4
    arr = [1, 2, 5, 8, 10, 18] 
    n = len(arr) 
    print(binarySearch(n, C, arr)) 
  
# This code is contributed by 
# Surendra_Gangwar 

