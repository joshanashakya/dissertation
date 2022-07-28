

# Python3 implementation to find K  
# odd positive integers such that 
# their summ is equal to given number 
  
# Function to find K odd positive 
# integers such that their summ is N 
def findDistinctOddsumm(n, k): 
      
    # Condition to check if there 
    # are enough values to check 
    if ((k * k) <= n and (n + k) % 2 == 0): 
        val = 1
        summ = 0
        for i in range(1, k): 
            print(val, end =  " ") 
            summ += val 
            val += 2
        print(n - summ) 
    else: 
        print("NO") 
  
# Driver Code 
n = 100
k = 4
findDistinctOddsumm(n, k) 
  
# This code is contributed by shubhamsingh10 

