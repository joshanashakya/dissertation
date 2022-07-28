

# Python3 program to find sum prime factors  
# in given range.  
MAX = 100006;  
count = [0] * MAX; 
  
# using sieve method to evaluating  
# the prime factor of numbers  
def sieve(): 
    i = 2; 
    while (i * i <= MAX): 
          
        # if i is prime 
        if (count[i] == 0): 
            for j in range(2 * i, MAX, i): 
                count[j] += 1; 
              
            # setting number of prime  
            # factor of a prime number.  
            count[i] = 1; 
          
        i += 1; 
  
# Returns sum of counts of prime factors in  
# range from l to r. This function mainly  
# uses count[] which is filled by Sieve()  
def query(l, r): 
    sum = 0;  
  
    # finding the sum of number of prime  
    # factor of numbers in a range.  
    for i in range(l, r + 1):  
        sum += count[i];  
  
    return sum;  
  
# Driver Code  
sieve();  
print(query(6, 10), query(1, 5));  
  
# This code is contributed by mits  

