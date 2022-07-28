

# Python 3 program to find minimum  
# number of 1's to be replaced to 0's 
      
# Function to find minimum number 
# of 1's to be replaced to 0's 
def minChanges(A, n): 
    cnt = 0
    for i in range(n - 2): 
        if ((i - 1 >= 0) and A[i - 1] == 1 and 
           A[i + 1] == 1 and A[i] == 0): 
            A[i + 1] = 0
            cnt = cnt + 1
      
    # return final answer 
    return cnt 
      
# Driver Code 
A = [1, 1, 0, 1, 1, 0, 1, 0, 1, 0] 
n = len(A) 
print(minChanges(A, n)) 
          
# This code is contributed  
# by Shashank_Sharma 

