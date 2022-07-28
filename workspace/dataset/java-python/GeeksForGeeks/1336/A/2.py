

# Efficient python3 program to count  
# all pairs with GCD and LCM.  
  
# A function to find number of distinct  
# prime factors of a given number n  
def totalPrimeFactors(n):  
      
    # To keep track of count  
    count = 0;  
  
    # 2s that divide n  
    if ((n % 2) == 0):  
        count += 1;  
        while ((n % 2) == 0):  
            n //= 2;  
  
    # n must be odd at this point.  
    # So we can skip one element  
    # (Note i = i +2) 
    i = 3; 
    while (i * i <= n):  
          
        # i divides n  
        if ((n % i) == 0):  
            count += 1;  
            while ((n % i) == 0):  
                n //= i;  
        i += 2; 
  
    # This condition is to handle the  
    # case when n is a prime number  
    # greater than 2  
    if (n > 2):  
        count += 1;  
  
    return count;  
  
# function to count number  
# of pair with given GCD and LCM  
def countPairs(G, L):  
  
    if (L % G != 0):  
        return 0;  
  
    div = int(L / G);  
  
    # answer is 2^totalPrimeFactors(L/G)  
    return (1 << totalPrimeFactors(div));  
  
# Driver Code  
G = 2;  
L = 12;  
print("Total possibe pair with GCD",  
           G, "& LCM", L, end = "");  
print(" =", countPairs(G, L));  
  
# This code is contributed by mits 

