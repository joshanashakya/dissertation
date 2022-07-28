

# Python program to count number  
# of divisors of N which are  
# divisible by K  
  
# Function to count number of divisors  
# of N which are divisible by K  
def countDivisors(n, k) : 
  
    # Variable to store  
    # count of divisors  
    count = 0
  
    # Traverse from 1 to n  
    for i in range(1, n + 1) : 
  
        # increase the count if both  
        # the conditions are satisfied  
        if (n % i == 0 and i % k == 0) : 
  
            count += 1
              
    return count 
  
# Driver code      
if __name__ == "__main__" : 
  
    n, k = 12, 3
    print(countDivisors(n, k)) 
  
# This code is contributed by ANKITRAI1 

