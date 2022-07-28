

# Python3 program to answer multiple queries of 
# divisibility by 3 in substrings of a number 
  
  
# Array to store the sum of digits 
sum = [0 for i in range(1000005)] 
  
# Utility function to evaluate a character's 
# integer value 
def toInt(x): 
  
    return int(x) 
  
# This function receives the string representation 
# of the number and precomputes the sum array 
def prepareSum(s): 
  
    sum[0] = 0
    for i in range(0, len(s)): 
        sum[i + 1] = sum[i] + toInt(s[i]) 
  
# This function receives l and r representing 
# the indices and prs the required output 
def query(l, r): 
  
    if ((sum[r + 1] - sum[l]) % 3 == 0): 
        print("Divisible by 3") 
    else: 
        print("Not divisible by 3") 
  
# Driver function to check the program 
if __name__=='__main__': 
      
    n = "12468236544"
    prepareSum(n) 
    query(0, 1) 
    query(1, 2) 
    query(3, 6) 
    query(0, 10) 
  
# This code is contributed by 
# Sanjit_Prasad 

