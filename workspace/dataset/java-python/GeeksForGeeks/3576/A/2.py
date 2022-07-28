

# Python 3 implementation of the approach 
MAX = 1000000
  
# Create a boolean array "prime[0..n]" and initialize 
# all the entries as true. A value in prime[i] will 
# finally be false if 'i' is Not a prime, else true  
prime = [True]*(MAX+1) 
  
def SieveOfEratosthenes(): 
  
    # 1 is not prime 
    prime[1] = False
      
    p = 2
    c=0
    while (p * p <= MAX) : 
        c+= 1
  
        # If prime[p] is not changed, then it is a prime 
        if (prime[p] == True) : 
  
            # Update all multiples of p 
              
            for i in range( p * 2, MAX+1 , p): 
                prime[i] = False
                  
        p += 1
  
  
def findDiff(arr, n): 
      
    # initial min max value 
    min = MAX + 2
    max = -1
  
    for i in range(n) : 
          
        # check if the number is prime or not 
        if (prime[arr[i]] == True) : 
  
            # set the max and min values 
            #print("arra ",arr[i]) 
            #print("MAX ",max) 
            #print(" MIN ",min) 
            if (arr[i] > max): 
                max = arr[i] 
            if (arr[i] < min): 
                min = arr[i] 
              
    #print(" max ",max) 
    return -1 if (max == -1) else (max - min) 
  
# Driver code 
if __name__ == "__main__": 
      
    # create the sieve 
    SieveOfEratosthenes() 
    n = 4
    arr = [ 1, 2, 3, 5 ] 
  
    res = findDiff(arr, n) 
  
    if (res == -1): 
        print("No prime numbers") 
    else: 
        print("Difference is " ,res ) 
  
# this code is contributed by 
# ChitraNayal 

