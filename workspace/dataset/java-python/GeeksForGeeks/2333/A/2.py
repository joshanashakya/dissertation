

# Python 3 implementation of  
# above approach 
  
MAX = 200006
CONS = 32766
  
# Function to calculate the value 
def calc(a, b, lr, q, n): 
  
    cc = 0
  
    # forming the prefix sum arrays 
    for i in range(n - 1) : 
        a[i + 1] += a[i] 
        b[i + 1] += b[i] 
  
    while (q > 0) : 
        # Taking the query 
        l = lr[cc] 
        cc +=1
        r = lr[cc] 
        cc += 1
        l -= 2
        r -= 1
  
        # finding the sum in the range l  
        # to r in array a 
        suma = a[r] 
  
        # finding the sum in the range  
        # l to r in array b 
        sumb = b[r] 
        if (l >= 0) : 
            suma -= a[l] 
            sumb -= b[l] 
  
        # Finding the max value of the function 
        M = max(CONS * suma + CONS * sumb, 
                -CONS * suma - CONS * sumb) 
        M = max(M, max(CONS * suma - CONS * sumb, 
                    -CONS * suma + CONS * sumb)) 
  
        # Finding the min value of the function 
        m = min(CONS * suma + CONS * sumb, 
                -CONS * suma - CONS * sumb) 
        m = min(m, min(CONS * suma - CONS * sumb, 
                    -CONS * suma + CONS * sumb)) 
  
        print(M - m) 
          
        q -= 1
  
# Driver code 
if __name__ == "__main__": 
      
    n = 5
    q = 2
    a = [ 0, 7, 3, 4, 5 ] 
    b = [ 0, 3, 1, 2, 3 ] 
  
    lr = [0]*(q * 2) 
    lr[0] = 1
    lr[1] = 1
    lr[2] = 1
    lr[3] = 3
  
    calc(a, b, lr, q, n) 
  
# This code is contributed by  
# ChitraNayal 

