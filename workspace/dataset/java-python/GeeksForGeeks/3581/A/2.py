

# Python program to find first element that 
# is strictly greater than given target. 
  
def next(arr, target): 
    start = 0; 
    end = len(arr) - 1; 
  
    ans = -1; 
    while (start <= end): 
        mid = (start + end) // 2; 
  
        # Move to right side if target is 
        # greater. 
        if (arr[mid] <= target): 
            start = mid + 1; 
  
        # Move left side. 
        else: 
            ans = mid; 
            end = mid - 1; 
  
    return ans; 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 5, 8, 12]; 
    print(next(arr, 8)); 
  
# This code is contributed by 29AjayKumar 

