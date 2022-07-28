

# Python3 program to express  
# n as sum of 4 primes. 
import math; 
# funcion to check if a  
# number is prime or not 
def isPrime(x): 
    # does square root 
    # of the number 
    s = int(math.sqrt(x)) 
      
    # traverse from 2 to sqrt(n) 
    for i in range(2,s+1): 
        # if any divisor found 
        # then non prime 
        if (x % i == 0): 
            return 0
    # if no divisor is found 
    # then it is a prime 
    return 1
  
def Num(x): 
    # iterates to check 
    # prime or not 
    ab=[0]*2
    for i in range(2,int(x / 2)+1): 
        # calls function to check 
        # if i and x-i is prime 
        # or not 
        if (isPrime(i) != 0 and isPrime(x - i) != 0): 
            ab[0] = i 
            ab[1] = x - i 
            # if two prime numbers 
            # are found, then return 
            return ab 
  
# function to generate 4 prime 
# numbers adding upto n 
def generate(n): 
    # if n<=7 then 4 numbers cannot 
    # sum to get that number 
    if(n <= 7): 
        print("Impossible to form") 
      
    # if it is not even then 2 and 
    # 3 are first two of sequence 
      
    if (n % 2 != 0): 
        # calls the function to get 
        # the other two prime numbers 
        # considering first two primes 
        # as 2 and 3 (Note 2 + 3 = 5) 
        ab=Num(n - 5) 
          
        # print 2 and 3 as the firsts 
        # two prime and a and b as the 
        # last two. 
        print("2 3",ab[0],ab[1]) 
          
        # if it is even then 2 and 2 are 
        # first two of sequence 
    else: 
        # calls the function to get 
        # the other two prime numbers 
        # considering first two primes 
        # as 2 and 2 (Note 2 + 2 = 4) 
        ab=Num(n - 4) 
          
        # print 2 and 2 as the firsts 
        # two prime and a and b as the 
        # last two. 
        print("2 2",ab[0],ab[1])  
  
# Driver Code 
if __name__=='__main__': 
    n = 28
    generate(n) 
  
# This code is contributed by mits. 

