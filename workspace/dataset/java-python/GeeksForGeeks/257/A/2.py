

# Python3 program to find the 
# number of pairs in the 
# array with the sum > 0 
from bisect import bisect_left as lower_bound 
  
# Function to find the number 
# of pairs in the array with 
# sum > 0 
def findNumOfPair(a, n): 
  
    # Sorting the given array 
    a = sorted(a) 
  
    # Variable to store the count of pairs 
    ans = 0
  
    # Loop to iterate through the array 
    for i in range(n): 
  
        # Ignore if the value is negative 
        if (a[i] <= 0): 
            continue
  
        # Finding the index using lower_bound 
        j = lower_bound(a,-a[i] + 1) 
  
        # Finding the number of pairs between 
        # two indices i and j 
        ans += i - j 
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    a=[3, -2, 1] 
    n =len(a) 
  
    ans = findNumOfPair(a, n) 
    print(ans) 
  
# This code is contributed by mohit kumar 29 

