

# Python 3 implementation of the approach 
  
# Returns number of subsequences 
# of maximum length k and 
# contains no repeated element 
def countSubSeq(a, n, k): 
      
    # Sort the array a[] 
    a.sort(reverse = False) 
    arr = [] 
  
    # Store the frequencies of all the 
    # distinct element in the vector arr 
    i = 0
    while(i < n): 
        count = 1
        x = a[i] 
        i += 1
        while (i < n and a[i] == x): 
            count += 1
            i += 1
          
        arr.append(count) 
  
    m = len(arr) 
    n = min(m, k) 
  
    # count is the the number 
    # of such subsequences 
    count = 1
  
    # Create a 2-d array dp[n+1][m+1] to 
    # store the intermediate result 
    dp = [[0 for i in range(m + 1)]  
             for j in range(n + 1)] 
  
    # Initialize the first row to 1 
    for i in range(m + 1): 
        dp[0][i] = 1
  
    # Update the dp[][] array based 
    # on the recurrence relation 
    for i in range(1, n + 1, 1): 
        j = m 
        while(j >= 0): 
            if (j > m - i): 
                dp[i][j] = 0
            else: 
                dp[i][j] = dp[i][j + 1] + \ 
                  arr[j] * dp[i - 1][j + 1] 
                  
            j -= 1
              
        count = count + dp[i][0] 
  
    # Return the number of subsequences 
    return count 
  
# Driver code 
if __name__ == '__main__': 
    a = [2, 2, 3, 3, 5] 
    n = len(a) 
    k = 3
  
    print(countSubSeq(a, n, k)) 
  
# This code is contributed by Surendra_Gangwar 

