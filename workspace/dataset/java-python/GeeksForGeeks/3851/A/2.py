

# Python3 program to implement  
# above approach  
  
# Function that will find out  
# the valid position  
def validPosition(arr, N, K):  
    count = 0; sum = 0;  
  
    # find sum of all the elements  
    for i in range(N):  
        sum += arr[i];  
  
    # adding K to the element and check  
    # whether it is greater than sum of  
    # all other elements  
    for i in range(N):  
        if ((arr[i] + K) > (sum - arr[i])): 
            count += 1;  
  
    return count;  
  
# Driver code  
arr = [2, 1, 6, 7 ]; 
K = 4;  
N = len(arr);  
  
print(validPosition(arr, N, K));  
  
# This code is contributed by 29AjayKumar 

