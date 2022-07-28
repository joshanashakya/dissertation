

# Python3 program to count pairs  
# with XOR giving a odd number  
  
# Function to count number of odd pairs  
def findOddPair(A, N) : 
  
    # variable for counting odd pairs  
    oddPair = 0
  
    # find all pairs  
    for i in range(0, N) :  
        for j in range(i+1, N) : 
  
            # find XOR operation  
            # check odd or even  
            if ((A[i] ^ A[j]) % 2 != 0):  
                oddPair+=1
  
    # return number of odd pair  
    return oddPair  
  
# Driver Code 
if __name__=='__main__': 
    A = [5, 4, 7, 2, 1 ]  
    N = len(A) 
  
# calling function findOddPair  
# and print number of odd pair  
    print(findOddPair(A, N))  
  
# This code is contributed by Smitha Dinesh Semwal 

