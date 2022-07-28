

# Python3 implementation of  
# the approach  
  
def SieveOfEratosthenes( prime, p_size): 
  
    # false here indicates  
    # that it is not prime  
    prime[0] = False
    prime[1] = False
    for p in range(2,p_size+1): 
        if(p*p>p_size): 
            break
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if (prime[p]):  
  
            # Update all multiples of p,  
            # set them to non-prime 
            i=p*2
            while(i<=p_size): 
                prime[i] = False
                i = i + p  
          
# Function that finds  
# maximum contiguous subarray of prime numbers  
def maxPrimeSubarray( arr, n):  
  
    max_ele = max(arr)  
    prime=[True]*(max_ele + 1)  
  
    SieveOfEratosthenes(prime, max_ele)  
  
    current_max = 0
    max_so_far = 0
    for i in range(n): 
  
        # check if element is non-prime  
        if (prime[arr[i]] == False):  
            current_max = 0
  
        # If element is prime, than update  
        # current_max and max_so_far accordingly.  
        else:  
            current_max=current_max + 1
            max_so_far = max(current_max, max_so_far)  
          
    return max_so_far  
  
# Driver code  
if __name__=='__main__': 
    arr = [ 1, 0, 2, 4, 3, 29, 11, 7, 8, 9 ]  
    n = len(arr)  
    print(maxPrimeSubarray(arr, n)) 
  
# this code is contributed by  
# ash264 

