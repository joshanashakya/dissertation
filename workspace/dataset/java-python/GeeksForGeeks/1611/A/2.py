

# Program to find sum of matrix element  
# where each element is integer division   
# of row and column.  
  
# Return sum of matrix element where each  
# element is division of its corresponding  
# row and column.  
def findSum(n): 
    ans = 0; temp = 0; 
  
    for i in range(1, n + 1): 
  
        # count the number of elements of  
        # each column. Initialize to i -1  
        # because number of zeroes are i - 1.  
        if temp < n: 
            temp = i - 1
  
            # For multiply 
            num = 1
            while temp < n: 
                if temp + i <= n: 
                    ans += i * num 
                else: 
                    ans += (n - temp) * num 
                temp += i 
                num += 1
    return ans 
  
# Driver Code 
N = 2
print(findSum(N)) 
  
# This code is contributed by Shrikant13 

