

      
# Python3 program to count pairs 
# with XOR giving a even number 
  
   
# Function to count number of even pairs 
def findevenPair(A, N): 
  
    # variable for counting even pairs 
    evenPair = 0
   
    # find all pairs 
    for i in range(0, N): 
        for j in range(i+1, N): 
              
            # find XOR operation 
            # check even or even 
            if ((A[i] ^ A[j]) % 2 == 0): 
                evenPair+=1
  
    # return number of even pair 
    return evenPair; 
   
# Driver Code 
def main(): 
    A = [ 5, 4, 7, 2, 1 ] 
    N = len(A) 
   
    # calling function findevenPair 
    # and prnumber of even pair 
    print(findevenPair(A, N)) 
   
if __name__ == '__main__': 
    main() 
# This code is contributed by PrinciRaj1992  

