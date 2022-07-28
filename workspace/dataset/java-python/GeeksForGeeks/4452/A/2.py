

# Python3 implementation of the approach 
  
# Function that returns true if c is a vowel 
def isVowel(c): 
    if (c == 'a' or c == 'e' or 
        c == 'i' or c == 'o' or 
        c == 'u'): 
        return True
    return False
  
# Function that returns true if  
# all the vowels in the given string  
# are only at prime indices 
def isVowelPrime(Str, n): 
  
    # Create a boolean array "prime[0..n]"  
    # and initialize all entries in it as true.  
    # A value in prime[i] will finally be false  
    # if i is Not a prime, else true. 
    prime = [True for i in range(n)] 
  
    # 0 and 1 are not prime 
    prime[0] = False
    prime[1] = False
    for p in range(2, n): 
        if p * p > n: 
            break
  
        # If prime[p] is not changed, 
        # then it is a prime 
        if (prime[p] == True): 
  
            # Update all multiples of p greater than or 
            # equal to the square of it 
            # numbers which are multiple of p and are 
            # less than p^2 are already been marked. 
            for i in range(2 * p, n, p): 
                prime[i] = False
  
    # For every character of the given String 
    for i in range(n): 
  
        # If current character is vowel 
        # and the index is not prime 
        if (isVowel(Str[i]) and 
            prime[i] == False): 
            return False
    return True
  
# Driver code 
Str= "geeksforgeeks"; 
n = len(Str) 
  
if (isVowelPrime(Str, n)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

