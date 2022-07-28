

# Python3 program for the above approach  
  
# Function that returns the all the  
# distinct prime factors in a vector  
def primeFactors(n) :  
  
    Prime = [];  
  
    # If n is divisible by 2  
    if (n % 2 == 0) : 
        Prime.append(2);  
  
    # Divide n till all factors of 2  
    while (n % 2 == 0) : 
        n = n // 2;  
      
    # Check for the prime numbers other  
    # than 2  
    for i in range(3, int(n ** (1/2)),2) : 
  
        # Store i in Prime[] i is a  
        # factor of n  
        if (n % i == 0) : 
            Prime.append(i);  
          
        # Divide n till all factors of i  
        while (n % i == 0) : 
            n = n // i;  
  
    # If n is greter than 2, then n is  
    # prime number after n divided by  
    # all factors  
    if (n > 2) : 
        Prime.append(n);  
  
    # Returns the vector Prime  
    return Prime;  
  
# Function that check whether N is the  
# product of distinct prime factors  
# or not  
def checkDistinctPrime(n) :  
  
    # Returns the vector to store  
    # all the distinct prime factors  
    Prime = primeFactors(n); 
      
    # To find the product of all 
    # distinct prime factors 
    product = 1;  
  
    # Find the product  
    for i in Prime : 
        product *= i;  
  
    # If product is equals to N,  
    # print YES, else print NO  
    if (product == n) : 
        print("YES");  
    else : 
        print("NO");  
  
# Driver Code  
if __name__ == "__main__" :  
  
    N = 30;  
    checkDistinctPrime(N);  
  
# This code is contributed by Yash_R 

