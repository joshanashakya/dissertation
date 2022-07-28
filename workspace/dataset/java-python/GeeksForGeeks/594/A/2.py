

# Python3 code for the given approach. 
  
# Function to count subarrays not  
# satisfying condition 2  
def exclude(a, n):  
  
    count = 0
      
    # iterate in the array  
    for i in range(0, n):  
  
        # store the sum of set bits  
        # in the subarray  
        s = 0
        maximum = 0
  
        # iterate for range of 60 subarrays  
        for j in range(i, min(n, i + 60)):  
            s += a[j]  
            maximum = max(a[j], maximum)  
  
            # check if falsifies the condition-2  
            if s % 2 == 0 and 2 * maximum > s:  
                count += 1
  
    return count  
  
# Function to count subarrays  
def countSubarrays(a, n):  
  
    # replace the array element by  
    # number of set bits in them  
    for i in range(0, n):  
        a[i] = bin(a[i]).count('1')  
  
    # calculate prefix array  
    pre = [None] * n 
    for i in range(0, n):  
        pre[i] = a[i]  
          
        if i != 0: 
            pre[i] += pre[i - 1]  
      
    # Count the number of subarays  
    # satisfying step-1  
    odd, even = 0, 0
  
    # count number of odd and even  
    for i in range(0, n):  
        if pre[i] & 1:  
            odd += 1
      
    even = n - odd  
  
    # Increase even by 1 for 1, so that the  
    # subarrys starting from the index-0  
    # are also taken to count  
    even += 1
  
    # total subarrays satsfying condition-1 only  
    answer = ((odd * (odd - 1) // 2) + 
             (even * (even - 1) // 2))  
  
    print(answer)  
  
    # exclude total subarrays not  
    # satsfying condition2  
    answer = answer - exclude(a, n)  
  
    return answer  
  
# Driver Code  
if __name__ == "__main__":  
  
    a = [6, 7, 14]  
    n = len(a)  
  
    print(countSubarrays(a, n)) 
      
# This code is contributed by Rituraj Jain 

