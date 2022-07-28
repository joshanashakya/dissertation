

# Python3 program to findSum of all 
# amicable numbers up to n 
import math as mt 
  
N = 100005
  
# Function to return all amicable numbers 
def AMICABLE(): 
  
    Sum = [0 for i in range(N)] 
      
    for i in range(1, N): 
        Sum[i] += 1
  
        for j in range(2, mt.ceil(mt.sqrt(i))):  
  
            # j is proper divisor of i 
            if (i % j == 0): 
                Sum[i] += j 
  
                # if i is not a perfect square 
                if (i // j != j): 
                    Sum[i] += i // j 
  
    s = set() 
    for i in range(2, N): 
        if(i != Sum[i] and Sum[i] < N and 
           i == Sum[Sum[i]] and i not in s and 
                Sum[i] not in s): 
            s.add(i) 
            s.add(Sum[i]) 
  
    return s 
  
# function to findSum of all amicable  
# numbers up to N 
def SumOfAmicable(n): 
  
    # to store requiredSum 
    Sum = 0
  
    # to store all amicable numbers 
    s = AMICABLE() 
  
    #Sum all amicable numbers upto N 
    s = sorted(s) 
    for i in s: 
        if (i <= n): 
            Sum += i 
        else: 
            break
      
    # required answer 
    return Sum
  
# Driver Code 
n = 284
print(SumOfAmicable(n)) 
  
# This code is contributed by  
# mohit kumar 29 

