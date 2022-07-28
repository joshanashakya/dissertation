

# Python approach of finding 
# sum of GCD of all pairs 
MAX = 100001
  
# phi[i] stores euler  
# totient function for  
# i result[j] stores  
# result for value j 
phi = [0] * MAX
result = [0] * MAX
  
# Precomputation of phi[] 
# numbers. Refer below link 
# for details : https://goo.gl/LUqdtY 
def computeTotient(): 
  
    # Refer https://goo.gl/LUqdtY 
    phi[1] = 1
    for i in range(2, MAX): 
        if not phi[i]: 
            phi[i] = i - 1
            for j in range(i << 1, MAX, i): 
                if not phi[j]: 
                    phi[j] = j 
                phi[j] = ((phi[j] // i) * 
                          (i - 1)) 
  
# Precomputes result  
# for all numbers  
# till MAX 
def sumOfGcdPairs(): 
      
    # Precompute all phi value 
    computeTotient() 
  
    for i in range(MAX): 
          
        # Iterate throght all  
        # the divisors of i. 
        for j in range(2, MAX): 
            if i * j >= MAX: 
                break
            result[i * j] += i * phi[j] 
  
    # Add summation of  
    # previous calculated sum 
    for i in range(2, MAX): 
        result[i] += result[i - 1] 
  
# Driver code 
# Function to calculate  
# sum of all the GCD pairs 
sumOfGcdPairs() 
  
N = 4
print("Summation of",N,"=",result[N]) 
N = 12
print("Summation of",N,"=",result[N]) 
N = 5000
print("Summation of",N,"=",result[N]) 
  
# This code is contributed  
# by Sanjit_Prasad. 

