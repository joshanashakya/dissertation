

# Python implementation of above approach 
import numpy as np 
  
MAX_INDEX = 51
MAX_SUM = 2505
  
# This dp array is used to store our values  
# so that we don't have to calculate same  
# values again and again  
  
# Initialize dp array by -1  
dp = np.ones((MAX_INDEX,MAX_SUM,MAX_INDEX)) * -1;  
  
def waysutil(index, sum, count, arr, K) :  
  
    # Base cases  
    # Index can't be less than 0  
    if (index < 0) : 
        return 0;  
  
    if (index == 0) : 
  
        # No element is picked hence  
        # average cannot be calculated  
        if (count == 0) : 
            return 0; 
              
        remainder = sum % count;  
  
        # If remainder is non zero, we cannot  
        # divide the sum by count i.e. the average  
        # will not be an integer  
        if (remainder != 0) : 
            return 0;  
              
        average = sum // count;  
  
        # If we find an average return 1  
        if (average == K) : 
            return 1;  
  
    # If we have already calculated this function  
    # simply return it instead of calculating it again  
    if (dp[index][sum][count] != -1) : 
        return dp[index][sum][count];  
  
    # If we don't pick the current element  
    # simple recur for index -1  
    dontpick = waysutil(index - 1,  
                            sum, count, arr, K);  
  
    # If we pick the current element add it to  
    # our current sum and increment count by 1  
    pick = waysutil(index - 1,  
                        sum + arr[index],  
                        count + 1, arr, K);  
                          
    total = pick + dontpick;  
  
    # Store the value for the current function  
    dp[index][sum][count] = total;  
      
    return total;  
  
  
# Function to return the number of ways  
def ways(N, K, arr) : 
  
    Arr = [];  
  
    # Push -1 at the beginning to  
    # make it 1-based indexing  
    Arr.append(-1);  
    for i in range(N) : 
        Arr.append(arr[i]);  
  
    # Call recursive function  
    # waysutil to calculate total ways  
    answer = waysutil(N, 0, 0, Arr, K);  
    return answer;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 3, 6, 2, 8, 7, 6, 5, 9 ];  
    N =len(arr);  
    K = 5;  
    print(ways(N, K, arr));  
  
# This code is contributed by AnkitRai01 

