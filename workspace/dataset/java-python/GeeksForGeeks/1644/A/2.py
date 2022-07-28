

# Python 3 program for Split the array into three 
# subarrays such that summation of first 
# and third subarray is equal and maximum 
  
# Fucntion to return the sum of 
# the first subarray 
def sumFirst(a, n): 
    mp = {i:0 for i in range(7)} 
    suf = 0
    i = n - 1
      
    # calculate the suffix sum 
    while(i >= 0): 
        suf += a[i] 
        mp[suf] = i 
        i -= 1
  
    pre = 0
    maxi = -1
  
    # iterate from beginning 
    for i in range(n): 
          
        # prefix sum 
        pre += a[i] 
  
        # check if it exists beyond i 
        if (mp[pre] > i): 
              
            # if greater then previous 
            # then update maximum 
            if (pre > maxi): 
                maxi = pre 
  
    # First and second subarray empty 
    if (maxi == -1): 
        return 0
  
    # partition done 
    else: 
        return maxi 
  
# Driver Code 
if __name__ == '__main__': 
    a = [1, 3, 2, 1, 4] 
    n = len(a) 
    print(sumFirst(a, n)) 
      
# This code is contributed by 
# Surendra_Gangwar 

