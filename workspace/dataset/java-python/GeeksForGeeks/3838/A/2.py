

# Python3 implementation of the approach 
mod = 10 ** 9 + 7
N = 1000005
  
# To store least prime factors 
# of all the numbers 
lpf = [0 for i in range(N)] 
  
# Function to find the least prime 
# factor of all the numbers 
def least_prime_factor(): 
    for i in range(1, N): 
        lpf[i] = i 
  
    for i in range(2,N): 
        if (lpf[i] == i): 
            for j in range(i * 2, N, i): 
                if (lpf[j] == j): 
                    lpf[j] = i 
  
# Function to return the sum of 
# elements of array B 
def sum_of_elements(a, n): 
      
    # Find the prime factors of 
    # all the numbers 
    least_prime_factor() 
  
    # To store each prime count in lcm 
    prime_factor=dict() 
  
    for i in range(n): 
  
        # Current number 
        temp = a[i] 
  
        # Map to store the prime count 
        # of a single number 
        single_number = dict() 
  
        # Basic way to calculate all prime factors 
        while (temp > 1): 
            x = lpf[temp] 
            single_number[x] = single_number.get(x, 0) + 1
            temp //= x 
  
  
        # If it is the first number in the array 
        if (i == 0): 
            prime_factor = single_number 
  
        # Take the maximum count of 
        # prime in a number 
        else: 
            for x in single_number: 
                if x in prime_factor: 
                    prime_factor[x] = max(prime_factor[x],  
                                           single_number[x]) 
                else: 
                    prime_factor[x] = single_number[x] 
  
    ans, lcm = 0, 1
  
    # Calculate lcm of given array 
    for x in prime_factor: 
        lcm = (lcm * pow(x, prime_factor[x],mod)) % mod 
  
    # Calculate sum of elements of array B 
    for i in range(n): 
        ans = (ans + (lcm * pow(a[i],  
                mod - 2,mod)) % mod) % mod 
  
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    a = [2, 3, 4] 
    n = len(a) 
    print(sum_of_elements(a, n)) 
  
# This code is contributed by mohit kumar 29 

