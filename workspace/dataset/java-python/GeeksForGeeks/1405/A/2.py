

# Python3 implementation of above approach 
  
# Function to calculate value of X 
def valueofX(ar, n): 
    summ = sum(ar) 
  
    if (summ % n == 0): 
        return summ // n 
    else: 
        A = summ // n 
        B = summ // n + 1
        ValueA = 0
        ValueB = 0
  
        # Check for both possibilities 
        for i in range(n): 
            ValueA += (ar[i] - A) * (ar[i] - A) 
            ValueB += (ar[i] - B) * (ar[i] - B) 
  
        if (ValueA < ValueB): 
            return A 
        else: 
            return B 
  
# Driver Code 
n = 7
arr = [6, 9, 1, 6, 1, 3, 7] 
  
print(valueofX(arr, n)) 
  
# This code is contributed by Mohit Kumar 

