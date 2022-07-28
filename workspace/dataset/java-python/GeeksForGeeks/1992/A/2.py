

# Python3 implementation of the above approach  
  
# Function to find largest integer less than  
# or equal to N/2 and is coprime with N  
def largestCoprime(N):  
  
    # Handle the case for N = 6  
    if N == 6:  
        return 1 
    
    elif N % 4 == 0: 
        return N // 2 - 1 
    
    elif N % 2 == 0: 
        return N // 2 - 2 
    
    else: 
        return (N - 1) // 2 
  
# Driver code  
if __name__ == "__main__":  
    
    n = 50 
    print(largestCoprime(n)) 
    
# This code is contributed by Rituraj Jain 

