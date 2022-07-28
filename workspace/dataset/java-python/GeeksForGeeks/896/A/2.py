

# Python3 program to print all three-primes smaller than  
# or equal to n using Sieve of Eratosthenes  
  
# Generates all primes upto n and prints their squares  
def numbersWith3Divisors(n):  
   
    prime=[True]*(n+1);  
    prime[0] = prime[1] = False; 
    p=2; 
    while (p*p<=n): 
        # If prime[p] is not changed, then it is a prime  
        if (prime[p] == True): 
            # Update all multiples of p 
            for i in range(p*2,n+1,p): 
                prime[i] = False;  
        p+=1;  
  
    # print squares of primes upto n.  
    print("Numbers with 3 divisors :"); 
    i=0; 
    while (i*i <= n):  
        if (prime[i]): 
            print(i*i,end=" "); 
        i+=1; 
  
# driver program  
  
n = 96;  
numbersWith3Divisors(n);  
  
# this code is contributed by mits 

