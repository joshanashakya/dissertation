

# Python3 implementation of the approach 
  
# Function to return the amount of notes 
# with value A required 
def bankNotes(A, B, S, N): 
  
    numerator = S - (B * N) 
    denominator = A - B 
  
    # If possible 
    if (numerator % denominator == 0): 
        return (numerator // denominator) 
    return -1
  
# Driver code 
A, B, S, N = 1, 2, 7, 5
print(bankNotes(A, B, S, N)) 
  
# This code is contributed  
# by mohit kumar 

