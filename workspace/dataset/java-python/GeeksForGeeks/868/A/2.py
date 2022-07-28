

# Python3 Code to check if an integer can  
# be expressed as sum of two semi-primes  
MAX = 10000
  
arr = []  
sprime = [False] * (MAX)  
  
# Utility function to compute  
# semi-primes in a range  
def computeSemiPrime(): 
  
    for i in range(2, MAX):  
  
        cnt, num, j = 0, i, 2
        while cnt < 2 and j * j <= num:  
            while num % j == 0:  
                num /= j  
                  
                # Increment count of prime numbers 
                cnt += 1
                  
            j += 1
  
        # If number is greater than 1, add it  
        # to the count variable as it indicates  
        # the number remain is prime number  
        if num > 1: 
            cnt += 1
  
        # if count is equal to '2' then  
        # number is semi-prime  
        if cnt == 2: 
  
            sprime[i] = True
            arr.append(i)  
  
# Utility function to check  
# if a number sum of two  
# semi-primes  
def checkSemiPrime(n):  
  
    i = 0
    while arr[i] <= n // 2: 
  
        # arr[i] is already a semi-prime  
        # if n-arr[i] is also a semi-prime  
        # then a number can be expressed as  
        # sum of two semi-primes  
        if sprime[n - arr[i]] == True: 
            return True
  
        i += 1
      
    return False
  
# Driver code  
if __name__ == "__main__":  
  
    computeSemiPrime()  
  
    n = 30
    if checkSemiPrime(n) == True:  
        print("YES")  
    else: 
        print("NO") 
  
# This code is contributed by  
# Rituraj Jain 

