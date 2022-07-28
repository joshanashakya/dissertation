

# Python3 program to find N-th term of the series: 
# 2, 4, 3, 4, 15... 
  
  
  
# function to calculate Nth term of series 
def nthTerm( N): 
  
    # By using above formula 
    return (N * ((N % 2) + (N % 3))) 
  
  
# Driver Function 
  
  
# get the value of N 
if __name__=='__main__': 
    N = 5
  
    # Calculate and print the Nth term 
    print("Nth term for N = ", N , " : ",nthTerm(N)) 
  
# This code is contributed by ash264 

