

# Python3 program to find N-th term of the series:  
# 3, 6, 18, 24, 45, 54...  
  
  
# function to calculate Nth term of series  
def nthTerm( N):  
    # By using above formula  
    return (N * ((N // 2) + ((N % 2) * 2) + N))  
  
  
# Driver Function  
  
# get the value of N  
if __name__=='__main__': 
    N = 5
  
    # Calculate and print the Nth term  
    print( "Nth term for N = ", N ," : ", nthTerm(N))  
  
  
# This code is contributed by ash264 

