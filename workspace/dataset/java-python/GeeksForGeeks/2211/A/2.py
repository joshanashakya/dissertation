

# Python program to count the number of ways to  
# divide an array into two halves  
# with the same sum  
  
# Function to count the number of ways to  
# divide an array into two halves  
# with same sum  
def cntWays(arr, n):  
    # if length of array is 1  
    # answer will be 0 as we have  
    # to split it into two  
    # non-empty halves  
    if (n == 1):  
        return 0;  
  
    # variables to store total sum,  
    # current sum and count  
    tot_sum = 0; sum = 0; ans = 0;  
  
    # finding total sum  
    for i in range(0,n):  
        tot_sum += arr[i];  
  
    # checking if sum equals total_sum/2  
    for i in range(0,n-1): 
        sum += arr[i];  
        if (sum == tot_sum / 2): 
            ans+=1;  
    return ans;  
  
# Driver Code  
arr = [1, -1, 1, -1, 1, -1 ];  
  
n = len(arr);  
  
print(cntWays(arr, n));  
  
# This code contributed by PrinciRaj1992  

