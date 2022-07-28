

# Python3 implementation of the above approach  
  
# Array that stores the factorial  
# till 20  
fact = [0] * 21 
  
# Function to pre-compute  
# the factorial till 20  
def preCompute():  
  
    # Precomputing factorials  
    fact[0] = 1 
  
    for i in range(1, 18):  
        fact[i] = (fact[i - 1] * i) 
  
# Function to return the next  
# factorial number greater than N  
def nextFactorial(N):  
   
    # Traverse the factorial array  
    for i in range(21):  
  
# Find the next just greater  
# factorial than N  
        if N < fact[i]:  
  
            print(fact[i])  
            break 
  
# Driver Code  
# Function to precalculate  
# the factorial till 20  
preCompute()  
  
N = 120 
  
# Function call  
nextFactorial(N) 
  
# This code is contributed by divyamohan123 

