

# Python3 program to find Nth term  
# in the given Series 
  
# Function to find the nth term  
# in the given series 
def findNthTerm(n): 
    # If input number is even 
    if n % 2 == 0: 
        n //= 2
        print(3 ** (n - 1)) 
    # If input number is odd 
    else: 
        n = (n // 2) + 1
        print(2 ** (n - 1)) 
  
# Driver Code 
if __name__=='__main__': 
    N = 4
    findNthTerm(N) 
  
    N = 11
    findNthTerm(N) 
  
# This code is contributed 
# by vaibhav29498 

