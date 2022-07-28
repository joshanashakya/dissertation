

# Python program to find 
# minimum toggle required 
  
# Function to calculate 
# minimum toggling 
# required by using 
# Dynamic programming 
def minToggle(arr, n): 
  
    zero =[0 for i in range(n + 1+1)] 
    zero[0] = 0
   
    # Fill entries in zero[] 
    # such that zero[i] 
    # stores count of zeroes 
    # to the left of i 
    # (exl 
    for i in range(1, n + 1): 
      
        # If zero found 
        # update zero[] array 
        if (arr[i-1] == 0): 
            zero[i] = zero[i-1] + 1
        else: 
            zero[i] = zero[i-1] 
   
    # Finding the minimum 
    # toggle required from 
    # every index(0 to n-1) 
    ans = n 
    for i in range(1, n + 1): 
        ans = min(ans, i - zero[i] + zero[n] - zero[i]) 
   
    return ans 
      
# Driver Program 
  
arr = [1, 0, 1, 1, 0] 
n = len(arr) 
  
print(minToggle(arr, n)) 
  
# This code is contributed 
# by Anant Agarwal. 

