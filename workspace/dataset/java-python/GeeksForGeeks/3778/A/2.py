

# Python3 program to find  
# maximum sum of array after  
# dividing it into three segments 
  
# Function to find maximum sum of array 
# after dividing it into three segments 
def Max_Sum(a, n): 
      
    # To store sum upto ith index 
    b = [0 for i in range(n)] 
    S = 0
    res = 0
  
    # Traverse through the array 
    for i in range(n): 
        b[i] = res 
        res += a[i] 
        S += a[i] 
  
        # Get the maximum possible sum 
        res = max(res, -S) 
  
    # Store in the reuired answer 
    ans = S 
  
    # Maximum sum starting from  
    # left segment by choosing between 
    # keeping array element as it is 
    # or subtracting it 
    ans = max(ans, res) 
  
    # Finding maximum sum by decreasing  
    # a[i] and adding b[i] to it  
    # that means max(multiplying it  
    # by -1 or using b[i] value) 
    g = 0
  
    # For third segment 
    for i in range(n - 1, -1, -1): 
        g -= a[i] 
        ans = max(ans, g + b[i]) 
  
    # return the required answer 
    return ans 
  
# Driver code 
a = [-6, 10, -3, 10, -2] 
  
n = len(a) 
  
# Function call 
print("Maximum sum is:",  
          Max_Sum(a, n)) 
             
# This code is contributed 
# by Mohit Kumar 

