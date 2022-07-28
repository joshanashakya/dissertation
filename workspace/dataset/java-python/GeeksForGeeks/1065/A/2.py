

# Python3 program to find XOR of  
# all Prime numbers in an Array  
# at positions divisible by K  
MAX = 1000005 
  
def SieveOfEratosthenes(prime) :  
  
    # 0 and 1 are not prime numbers  
    prime[1] = False;  
    prime[0] = False;  
  
    for p in range(2, int(MAX ** (1/2))) : 
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if (prime[p] == True) : 
  
            # Update all multiples of p  
            for i in range(p * 2, MAX, p) : 
                prime[i] = False;  
  
# Function to find the required XOR  
def prime_xor(arr, n, k) :  
  
    prime = [True]*MAX ;  
  
    SieveOfEratosthenes(prime);  
  
    # To store XOR of the primes  
    ans = 0;  
  
    # Traverse the array  
    for i in range(n) : 
  
        # If the number is a prime  
        if (prime[arr[i]]) : 
  
            # If index is divisible by k  
            if ((i + 1) % k == 0) : 
                ans ^= arr[i];  
  
    # Print the xor  
    print(ans);  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 2, 3, 5, 7, 11, 8 ];  
    n = len(arr);  
    K = 2;  
  
    # Function call  
    prime_xor(arr, n, K);  
  
# This code is contributed by Yash_R 

