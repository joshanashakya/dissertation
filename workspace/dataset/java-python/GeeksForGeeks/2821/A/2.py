

# Python3 implementation of the approach 
  
# Function that returns true if the string 
# can be made equal after one swap 
def canBeEqual(a, b, n): 
    # A and B are new a and b 
    # after we omit the same elements 
    A =[] 
    B =[] 
      
    # Take only the characters which are  
    # different in both the strings  
    # for every pair of indices 
    for i in range(n): 
      
        # If the current characters differ 
        if a[i]!= b[i]: 
            A.append(a[i]) 
            B.append(b[i]) 
              
    # The strings were already equal 
    if len(A)== len(B)== 0: 
        return True
      
    # If the lengths of the  
    # strings are two 
    if len(A)== len(B)== 2: 
      
        # If swapping these characters  
        # can make the strings equal 
        if A[0]== A[1] and B[0]== B[1]: 
            return True
      
    return False
  
# Driver code 
A = 'SEEKSFORGEEKS'
B = 'GEEKSFORGEEKG'
  
if (canBeEqual(A, B, len(A))): 
    print("Yes") 
else: 
    print("No") 

