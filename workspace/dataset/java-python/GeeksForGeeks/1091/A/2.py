

# Python3 implementation of the approach  
  
# Function to return the gcd of two numbers  
def gcd(a, b) : 
      
    if (b == 0) : 
        return a 
    else : 
        return gcd(b, a % b) 
  
# Function to return the lcm of  
# all the elements of the array  
def lcmOfArray(arr, n) : 
      
    if (n < 1) : 
        return 0
  
    lcm = arr[0] 
  
    # To calculate lcm of two numbers  
    # multiply them and divide the result  
    # by gcd of both the numbers  
    for i in range(n) :  
        lcm = (lcm * arr[i]) // gcd(lcm, arr[i]);  
  
    # Return the LCM of the array elements  
    return lcm 
  
# Function to return the smallest perfect cube  
# divisible by all the elements of arr[]  
def minPerfectCube(arr, n) : 
      
    # LCM of all the elements of arr[]  
    lcm = lcmOfArray(arr, n) 
    minPerfectCube = lcm 
  
    cnt = 0
    while (lcm > 1 and lcm % 2 == 0) : 
        cnt += 1
        lcm //= 2
      
    # If 2 divides lcm cnt number of times  
    if (cnt % 3 == 2) : 
        minPerfectCube *= 2
          
    elif (cnt % 3 == 1) : 
        minPerfectCube *= 4
  
    i = 3
      
    # Check all the numbers that divide lcm  
    while (lcm > 1) : 
        cnt = 0
          
        while (lcm % i == 0) : 
            cnt += 1
            lcm //= i  
          
        if (cnt % 3 == 1) : 
            minPerfectCube *= i * i 
              
        elif (cnt % 3 == 2) : 
            minPerfectCube *= i 
  
        i += 2
  
    # Return the answer  
    return minPerfectCube  
  
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 10, 125, 14, 42, 100 ]  
      
    n = len(arr) 
    print(minPerfectCube(arr, n))  
      
# This code is contributed by Ryuga 

