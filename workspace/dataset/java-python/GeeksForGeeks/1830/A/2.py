

# Python 3 program to find  
# N-th term of the series:  
# 1, 3, 12, 60, 360…  
  
# Function for finding  
# factorial of N  
def factorial(N) :  
    fact = 1
    for i in range(1, N + 1) :  
        fact = fact * i  
  
    # return factorial of N  
    return fact  
  
# Function for calculating  
# Nth term of series  
def nthTerm(N) :  
  
    # return nth term  
    return (factorial(N + 1) // 2)  
  
# Driver code  
if __name__ == "__main__" :  
      
    N = 6
  
    # Function Calling  
    print(nthTerm(N))  

