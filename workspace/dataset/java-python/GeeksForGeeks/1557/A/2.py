

# Python3 program to find maximum number of 
# elements without overlapping in a line 
  
# Function to find maximum number of 
# elements without overlapping in a line 
def Segment(x, l, n): 
      
    # If n = 1, then answer is one 
    if (n == 1): 
        return 1
  
    # We can always make 1st element to cover 
    # left segment and nth the right segment 
    ans = 2
      
    for i in range(1, n - 1): 
          
        # If left segment for ith element doesnt overlap 
        # with i - 1 th element then do left 
        if (x[i] - l[i] > x[i - 1]): 
            ans += 1
  
        # else try towards right if possible 
        elif (x[i] + l[i] < x[i + 1]): 
              
            # update x[i] to right endpoof 
            # segment covered by it 
            x[i] = x[i] + l[i] 
            ans += 1
  
    # Return the required answer 
    return ans 
  
# Driver code 
x = [1, 3, 4, 5, 8] 
l = [10, 1, 2, 2, 5] 
  
n = len(x) 
  
# Function call 
print(Segment(x, l, n)) 
  
# This code is contributed  
# by Mohit Kumar 

