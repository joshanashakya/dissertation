

# Python3 implementation of the approach 
  
# Function to return the vector  
# containing the answer 
def addToArrayForm(A, K): 
  
    # Vector v is to store each digits sum 
    # and vector ans is to store the answer 
    v, ans = [], [] 
  
    # No carry in the beginning 
    rem, i = 0, 0
  
    # Start loop from the end 
    # and take element one by one 
    for i in range(len(A) - 1, -1, -1):  
  
        # Array index and last digit of number 
        my = A[i] + (K % 10) + rem 
        if my > 9: 
  
            # Maintain carry of summation 
            rem = 1
  
            # Push the digit value into the array 
            v.append(my % 10) 
          
        else:  
            v.append(my) 
            rem = 0
          
        K = K // 10
      
    # K value is greater then 0 
    while K > 0:  
  
        # Push digits of K one by one in the array 
        my = (K % 10) + rem 
        v.append(my % 10) 
  
        # Also maintain carry with summation 
        if my // 10 > 0: 
            rem = 1
        else: 
            rem = 0
          
        K = K // 10
      
    if rem > 0: 
        v.append(rem) 
  
    # Reverse the elements of vector v 
    # and store it in vector ans 
    for i in range(len(v) - 1, -1, -1): 
        ans.append(v[i]) 
  
    return ans 
  
# Driver code 
if __name__ == "__main__": 
  
    A = [2, 7, 4]  
    K = 181
    ans = addToArrayForm(A, K) 
  
    # Print the answer 
    for i in range(0, len(ans)): 
        print(ans[i], end = "") 
  
# This code is contributed by Rituraj Jain 

