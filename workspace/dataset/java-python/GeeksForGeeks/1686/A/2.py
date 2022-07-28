

      
# Python3 program to count pairs with odd OR 
  
   
# Function to count pairs with odd OR 
def findOddPair(A, N): 
      
    oddPair = 0
    for i in range(0, N): 
        for j in range(i+1, N): 
   
            # find OR operation 
            # check odd or odd 
            if ((A[i] | A[j]) % 2 != 0): 
                oddPair+=1
  
    # return count of odd pair 
    return oddPair 
  
   
# Driver Code 
def main(): 
      
    A = [ 5, 6, 2, 8 ] 
   
    N = len(A) 
   
    print(findOddPair(A, N)) 
  
if __name__ == '__main__': 
    main() 
# This code is contributed by PrinciRaj1992   

