

# Simple Python 3 program to find length of 
# the largest subsequence with GCD greater 
# than 1. 
  
# Returns length of the largest subsequence 
# with GCD more than 1. 
def largestGCDSubsequence(arr, n): 
    ans = 0
  
    # Finding the Maximum value in arr[] 
    maxele = max(arr) 
  
    # Iterate from 2 to maximum possible 
    # divisor of all give values 
    for i in range(2, maxele + 1): 
        count = 0
        for j in range(n): 
              
            # If we found divisor, 
            # increment count 
            if (arr[j] % i == 0): 
                count += 1
        ans = max(ans, count) 
  
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    arr = [3, 6, 2, 5, 4] 
    size = len(arr) 
    print(largestGCDSubsequence(arr, size)) 
  
# This code is contributed by Rajput-Ji 

