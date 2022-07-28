

# Python 3 program to find maximum value 
# (arr[i]-i) - (arr[j]-j) in an array. 
import sys  
  
# Returns maximum value of  
# (arr[i]-i) - (arr[j]-j) 
def findMaxDiff(a, n): 
    if (n < 2): 
        print("Invalid ") 
        return 0
  
    # Find maximum of value of arr[i] - i 
    # for all possible values of i. Let  
    # this value be max_val. Find minimum 
    # of value of arr[i] - i for all possible  
    # values of i. Let this value be min_val. 
    # The difference max_val - min_v 
    min_val = sys.maxsize 
    max_val = -sys.maxsize - 1
    for i in range(n): 
        if ((a[i] - i) > max_val): 
            max_val = a[i] - i 
        if ((a[i] - i) < min_val): 
            min_val = a[i] - i 
  
    return (max_val - min_val) 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [9, 15, 4, 12, 13] 
    n = len(arr) 
    print(findMaxDiff(arr, n)) 
  
# This code is contributed by Rajput-Ji 

