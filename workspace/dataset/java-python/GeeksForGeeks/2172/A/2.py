

# Python 3 program to Find the count of  
# the numbers in the given range such 
# that the sum of its digit is equal to 
# the sum of all its prime factors digits sum. 
  
# maximum size of number 
MAXN = 100005
  
# array to store smallest prime 
# factor of number 
spf = [0] * MAXN 
  
# array to store sum of digits of a number 
sum_digits = [0] * MAXN 
  
# boolean array to check given number  
# is countable for required answer or not. 
isValid = [0] * MAXN 
  
# prefix array to store answer 
ans = [0]*MAXN 
  
# Calculating SPF (Smallest Prime Factor)  
# for every number till MAXN. 
def Smallest_prime_factor(): 
  
    # marking smallest prime factor 
    # for every number to be itself. 
    for i in range(1, MAXN): 
        spf[i] = i 
  
    # separately marking spf for  
    # every even number as 2 
    for i in range(4, MAXN, 2): 
        spf[i] = 2
  
    i = 3
    while i * i <= MAXN:  
  
        # checking if i is prime 
        if (spf[i] == i): 
  
            # marking SPF for all numbers 
            # divisible by i 
            for j in range(i * i, MAXN, i): 
  
                # marking spf[j] if it is not 
                # previously marked 
                if (spf[j] == j): 
                    spf[j] = i 
                      
        i += 2
  
# Function to find sum of digits  
# in a number 
def Digit_Sum(copy): 
      
    d = 0
    while (copy) : 
        d += copy % 10
        copy //= 10
  
    return d 
  
# find sum of digits of all 
# numbers up to MAXN 
def Sum_Of_All_Digits(): 
  
    for n in range(2, MAXN) : 
          
        # add sum of digits of least  
        # prime factor and n/spf[n] 
        sum_digits[n] = (sum_digits[n // spf[n]] +
                         Digit_Sum(spf[n])) 
  
        # if it is valid make isValid true 
        if (Digit_Sum(n) == sum_digits[n]): 
            isValid[n] = True
  
    # prefix sum to compute answer 
    for n in range(2, MAXN) : 
        if (isValid[n]): 
            ans[n] = 1
        ans[n] += ans[n - 1] 
  
# Driver code 
if __name__ == "__main__": 
      
    Smallest_prime_factor() 
    Sum_Of_All_Digits() 
  
    # print answer for required range 
    l = 2
    r = 3
    print("Valid numbers in the range", l, r, 
                  "are", ans[r] - ans[l - 1]) 
  
    # print answer for required range 
    l = 2
    r = 10
    print("Valid numbers in the range", l, r,  
                  "are", ans[r] - ans[l - 1]) 
  
# This code is contributed by ita_c 

