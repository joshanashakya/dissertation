

# Python3 implementation of the approach 
  
# Function to return the GCD of A and B 
def gcd(A, B): 
    if (B == 0): 
        return A 
    return gcd(B, A % B) 
  
# Function to return the 
# LCM of A and B 
def lcm(A, B): 
    return (A * B) // gcd(A, B) 
  
# Function to return the Kth element from 
# the required set if it a multiple of A 
def checkA(A, B, C, K): 
      
    # Start and End for Binary Search 
    start = 1
    end = K 
  
    # If no answer found return -1 
    ans = -1
  
    while (start <= end): 
        mid = (start + end) // 2
        value = A * mid 
  
        divA = mid - 1
  
        divB = value // B - 1 if (value % B == 0) \ 
                              else value // B 
  
        divC = value // C - 1 if (value % C == 0) \ 
                              else value // C 
  
        divAB = value // lcm(A, B) - 1 \ 
        if (value % lcm(A, B) == 0) \ 
        else value // lcm(A, B) 
  
        divBC = value // lcm(C, B) - 1 \ 
        if (value % lcm(C, B) == 0) \ 
        else value // lcm(C, B) 
  
        divAC = value // lcm(A, C) - 1 \ 
        if (value % lcm(A, C) == 0) \ 
        else value // lcm(A, C) 
  
        divABC = value // lcm(A, lcm(B, C)) - 1 \ 
        if (value % lcm(A, lcm(B, C)) == 0) \ 
        else value // lcm(A, lcm(B, C)) 
  
        # Inclusion and Exclusion 
        elem = divA + divB + divC - \ 
               divAC - divBC - divAB + divABC 
        if (elem == (K - 1)): 
            ans = value 
            break
  
        # Multiple should be smaller 
        elif (elem > (K - 1)): 
            end = mid - 1
  
        # Multiple should be bigger 
        else : 
            start = mid + 1
  
    return ans 
  
# Function to return the Kth element from 
# the required set if it a multiple of B 
def checkB(A, B, C, K): 
      
    # Start and End for Binary Search 
    start = 1
    end = K 
  
    # If no answer found return -1 
    ans = -1
  
    while (start <= end): 
        mid = (start + end) // 2
        value = B * mid 
  
        divB = mid - 1
  
        if (value % A == 0): 
            divA = value // A - 1 
        else: value // A 
  
        if (value % C == 0): 
            divC = value // C - 1 
        else: value // C 
  
        if (value % lcm(A, B) == 0):  
            divAB = value // lcm(A, B) -1 
        else: value // lcm(A, B) 
  
        if (value % lcm(C, B) == 0): 
            divBC = value // lcm(C, B) -1 
        else: value // lcm(C, B) 
  
        if (value % lcm(A, C) == 0): 
            divAC = value // lcm(A, C) -1 
        else: value // lcm(A, C) 
  
        if (value % lcm(A, lcm(B, C)) == 0): 
            divABC = value // lcm(A, lcm(B, C)) - 1 
        else: value // lcm(A, lcm(B, C)) 
  
        # Inclusion and Exclusion 
        elem = divA + divB + divC - \ 
               divAC - divBC - divAB + divABC 
        if (elem == (K - 1)): 
            ans = value 
            break
  
        # Multiple should be smaller 
        elif (elem > (K - 1)): 
            end = mid - 1
  
        # Multiple should be bigger 
        else : 
            start = mid + 1
  
    return ans 
  
# Function to return the Kth element from 
# the required set if it a multiple of C 
def checkC(A, B, C, K): 
      
    # Start and End for Binary Search 
    start = 1
    end = K 
  
    # If no answer found return -1 
    ans = -1
  
    while (start <= end): 
        mid = (start + end) // 2
        value = C * mid 
  
        divC = mid - 1
  
        if (value % B == 0): 
            divB = value // B - 1  
        else: value // B 
  
        if (value % A == 0): 
            divA = value // A - 1  
        else: value // A 
  
        if (value % lcm(A, B) == 0):  
            divAB = value // lcm(A, B) -1 
        else: value // lcm(A, B) 
  
        if (value % lcm(C, B) == 0): 
            divBC = value // lcm(C, B) -1 
        else: value // lcm(C, B) 
  
        if (value % lcm(A, C) == 0): 
            divAC = value // lcm(A, C) -1  
        else: value // lcm(A, C) 
  
        if (value % lcm(A, lcm(B, C)) == 0): 
            divABC = value // lcm(A, lcm(B, C)) - 1 
        else: value // lcm(A, lcm(B, C)) 
  
        # Inclusion and Exclusion 
        elem = divA + divB + divC - \ 
               divAC - divBC - divAB + divABC 
        if (elem == (K - 1)): 
            ans = value 
            break
  
        # Multiple should be smaller 
        elif (elem > (K - 1)): 
            end = mid - 1
  
        # Multiple should be bigger 
        else : 
            start = mid + 1
  
    return ans 
  
# Function to return the Kth element from 
# the set of multiples of A, B and C 
def findKthMultiple(A, B, C, K): 
  
    # Apply binary search on the multiples of A 
    res = checkA(A, B, C, K) 
  
    # If the required element is not a 
    # multiple of A then the multiples 
    # of B and C need to be checked 
    if (res == -1): 
        res = checkB(A, B, C, K) 
  
    # If the required element is neither 
    # a multiple of A nor a multiple 
    # of B then the multiples of C 
    # need to be checked 
    if (res == -1): 
        res = checkC(A, B, C, K) 
  
    return res 
  
# Driver code 
A = 2
B = 4
C = 5
K = 5
  
print(findKthMultiple(A, B, C, K)) 
  
# This code is contributed by Mohit Kumar 

