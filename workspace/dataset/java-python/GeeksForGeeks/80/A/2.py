

# Python3 program to check if each element of  
# the given array is a product of exactly  
# K prime factors  
  
MAX = 1000000
  
# initialise the global sieve array  
Sieve = [0]*(MAX + 1)  
  
# Function to generate Sieve  
def constructSieve() : 
  
    # NOTE: k value is necessarily more than 1  
    # hence, 0, 1 and any prime number cannot be  
    # represented as product of  
    # two or more prime numbers  
  
    for i in range(2, MAX + 1) : 
        if (Sieve[i] == 0) : 
            for j in range(2*i, MAX + 1, i) : 
                temp = j;  
                while (temp > 1 and temp % i == 0) :  
                    Sieve[j] += 1;  
                    temp = temp // i;  
          
  
# Function to check if each number of array  
# satisfies the given condition  
def checkElements(A, n, k) :  
  
    for i in range(n) :  
        if (Sieve[A[i]] == k) : 
            print("YES"); 
              
        else : 
            print("NO");  
  
# Driver Code  
if __name__ == "__main__" : 
  
    # first construct the sieve  
    constructSieve();  
  
    k = 3;  
    A = [ 12, 36, 42, 72 ];  
    n = len(A);  
  
    checkElements(A, n, k);  
      
# This code is contributed by AnkitRai01 

