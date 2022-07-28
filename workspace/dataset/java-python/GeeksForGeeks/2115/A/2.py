

# Python3 program to find maximum length 
# subsequence such that adjacent elements  
# have at least one common digit  
  
# Returns length of maximum 
# length subsequence  
def findSubsequence(arr, n) : 
  
    # To store length of maximum  
    # length subsequence  
    length = 1;  
  
    # To store length of subsequence  
    # having common digit d  
    dp = [0] * 10;  
  
    # For first element maximum length 
    # is 1 for each digit  
    tmp = arr[0];  
    while (tmp > 0) :  
        dp[tmp % 10] = 1;  
        tmp //= 10;  
      
  
    # Find digits of each element, then 
    # find length of subsequence for each  
    # digit and then find local maximum  
    for i in range(1, n) : 
        tmp = arr[i];  
        locMax = 1; 
        cnt = [0] * 10
          
        # Find digits in current element  
        while (tmp > 0) : 
            cnt[tmp % 10] = 1;  
            tmp //= 10;  
  
        # For each digit present find length of  
        # subsequence and find local maximum  
        for d in range(10) :  
            if (cnt[d]) :  
                dp[d] += 1;  
                locMax = max(locMax, dp[d]);  
  
        # Update value of dp[d] for each digit  
        # present in current element to local  
        # maximum found  
        for d in range(10) :  
            if (cnt[d]) : 
                dp[d] = locMax;  
      
        # Update maximum length with local  
        # maximum  
        length = max(length, locMax);  
  
    return length;  
  
# Driver code  
if __name__ == "__main__" : 
    arr = [ 1, 12, 44, 29, 33, 96, 89 ];  
    n = len(arr) 
  
    print(findSubsequence(arr, n)); 
      
# This code is contributed by Ryuga 

