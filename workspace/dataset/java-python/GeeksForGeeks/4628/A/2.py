

# Python3 Program to print the solution  
# of the series f(n)= (1) + (2*3) + (4*5*6)  
# ... n using recursion 
  
# Recursive function for finding sum of series 
# calculated - number of terms till  
#               which sum of terms  
#               has been calculated 
# current - number of terms for  
#            which sum has to be  
#            calculated 
# N     - Number of terms in the  
#       function to be calculated 
def seriesSum(calculated, current, N):  
  
    i = calculated;  
    cur = 1; 
  
    # checking termination condition 
    if (current == N + 1):  
        return 0; 
  
    # product of terms till current 
    while (i < calculated + current): 
        cur *= i; 
        i += 1; 
  
    # recursive call for adding 
    # terms next in the series 
    return cur + seriesSum(i, current + 1, N); 
  
# Driver code 
  
# input number of terms in the series 
N = 5;  
  
# invoking the function 
# to calculate the sum 
print(seriesSum(1, 1, N));  
  
# This code is contributed by mits 

