

# Python3 program to find prime factors  
# of LCM of array elements  
import math; 
MAX = 10000;  
  
# array to store all prime less than 
# and equal to 10^6  
primes = [];  
  
# utility function for sieve of sundaram  
def sieve():  
  
    n = MAX;  
  
    # In general Sieve of Sundaram, produces  
    # primes smaller than (2*x + 2) for a  
    # number given number x. Since we want  
    # primes smaller than n, we reduce n to half  
    nNew = int(n / 2);  
  
    # This array is used to separate numbers of  
    # the form i+j+2ij from others where 1 <= i <= j  
    marked = [False] * (nNew + 100);  
  
  
    # Main logic of Sundaram. Mark all numbers  
    # which do not generate prime number by 
    # doing 2*i+1  
    tmp = int(math.sqrt(n));  
    for i in range(1, int((tmp - 1) / 2) + 1):  
        for j in range((i * (i + 1)) << 1,  
                        nNew + 1, 2 * i + 1):  
            marked[j] = True;  
  
    # Since 2 is a prime number  
    primes.append(2);  
  
    # Print other primes. Remaining primes  
    # are of the form 2*i + 1 such that  
    # marked[i] is false.  
    for i in range(1, nNew + 1):  
        if (marked[i] == False):  
            primes.append(2 * i + 1);  
  
# Function to find prime factors of  
# n elements of given array  
def primeLcm(arr, n ):  
  
    # factors[] --> array to mark all prime  
    # factors of lcm of array elements  
    factors = [0] * (MAX);  
  
    # One by one calculate prime factors of  
    # number and mark them in factors[] array  
    for i in range(n): 
          
        # copy --> duplicate of original 
        # element to perform operation  
        copy = arr[i];  
  
        # sqr --> square root of current number  
        # 'copy' because all prime factors are  
        # always less than and equal to square  
        # root of given number  
        sqr = int(math.sqrt(copy));  
  
        # check divisibility with prime factor 
        j = 0; 
        while (primes[j] <= sqr):  
          
            # if current prime number is  
            # factor of 'copy'  
            if (copy % primes[j] == 0):  
                  
                # divide with current prime factor  
                # until it can divide the number  
                while (copy % primes[j] == 0):  
                    copy = int(copy / primes[j]);  
  
                # mark current prime factor as 1  
                # in factors[] array  
                factors[primes[j]] = 1;  
            j += 1;  
  
        # After calculating exponents of all prime  
        # factors either value of 'copy' will be 1  
        # because of complete divisibility or  
        # remaining value of 'copy' will be surely  
        # a prime, so we will also mark this prime 
        # as a factor  
        if (copy > 1):  
            factors[copy] = 1;  
  
    # if 2 is prime factor of lcm of  
    # all elements in given array  
    if (factors[2] == 1):  
        print("2 ", end = "");  
  
    # traverse to print all prime factors of  
    # lcm of all elements in given array  
    for i in range(3, MAX + 1, 2):  
        if (factors[i] == 1):  
            print(i, end = " ");  
  
# Driver Code 
sieve();  
arr = [20, 10, 15, 60];  
n = len(arr);  
primeLcm(arr, n); 
  
# This code is contributed by chandan_jnu 

