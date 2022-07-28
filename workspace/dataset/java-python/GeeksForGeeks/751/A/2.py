

# Python 3 implementation of the approach 
  
# Function to print the required permutation 
def arrange(N): 
  
    if (N == 1) : 
        print("1") 
        return
  
    # No permutation is possible 
    # satisfying the given condition 
    if (N == 2 or N == 3) : 
        print("-1") 
        return
  
    # Maximum even and odd elements < N 
    even = -1
    odd = -1
    if (N % 2 == 0): 
        even = N 
        odd = N - 1
    else : 
        odd = N 
        even = N - 1
  
    # Print all odd elements in  
    # decreasing order 
    while (odd >= 1): 
        print(odd, end = " ") 
  
        # Next element must be odd 
        odd = odd - 2
  
    # Print all even elements in  
    # decreasing order 
    while (even >= 2): 
        print(even, end = " ") 
  
        # Next element must be even 
        even = even - 2
  
# Driver code 
if __name__ == "__main__": 
  
    N = 5
    arrange(N) 
  
# This code is contributed by ita_c 

