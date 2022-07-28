

      
# Python implementation of the approach 
  
# Function that return true if A and B 
# have same number of digits 
def sameLength(A, B): 
    while (A > 0 and B > 0): 
        A = A / 10; 
        B = B / 10; 
  
    # Both must be 0 now if 
    # they had same lengths 
    if (A == 0 and B == 0): 
        return True; 
    return False; 
  
# Driver code 
A = 21; B = 1; 
  
if (sameLength(A, B)): 
    print("Yes"); 
else: 
    print("No"); 
  
# This code contributed by PrinciRaj1992 

