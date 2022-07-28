

# Python3 implementation of the approach  
  
# Function to return the maximum sum  
# of the sub-sequence such that two  
# consecutive elements have a difference of  
# at least 3 in their indices  
# in the given array  
def max_sum(a, n) : 
  
    dp = [0]*n;  
  
    # If there is a single element in the array  
    if (n == 1) : 
  
        # Either select it or don't  
        dp[0] = max(0, a[0]);  
  
    # If there are two elements  
    elif (n == 2) : 
  
        # Either select the first  
        # element or don't  
        dp[0] = max(0, a[0]);  
  
        # Either select the first or the second element  
        # or don't select any element  
        dp[1] = max(a[1], dp[0]);  
          
    elif (n >= 3) : 
  
        # Either select the first  
        # element or don't  
        dp[0] = max(0, a[0]);  
  
        # Either select the first or the second element  
        # or don't select any element  
        dp[1] = max(a[1], max(0, a[0]));  
  
        # Either select first, second, third or nothing  
        dp[2] = max(a[2], max(a[1], max(0, a[0])));  
  
        i = 3;  
  
        # For the rest of the elements  
        while (i < n) : 
  
            # Either select the best sum till  
            # previous_index or select the current  
            # element + best_sum till index-3  
            dp[i] = max(dp[i - 1], a[i] + dp[i - 3]);  
            i += 1;  
  
    return dp[n - 1];  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, -2, 4, 3 ];  
    n = len(arr);  
  
    print(max_sum(arr, n));  
  
# This code is contributed by AnkitRai01 

