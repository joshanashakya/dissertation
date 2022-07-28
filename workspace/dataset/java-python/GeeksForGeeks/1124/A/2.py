

# Python Program to construct an array whose 
# GCD of every consecutive element is the 
# given array 
  
# Recursive function to return gcd of 
# a and b 
def __gcd( a, b): 
          
    # Everything divides 0  
    if (a == 0 or b == 0): 
        return 0
          
    # base case 
    if (a == b): 
        return a  
          
    # a is greater 
    if (a > b): 
        return __gcd(a - b, b)          
    return __gcd(a, b - a) 
      
# Return the LCM of two numbers. 
def lcm(a, b): 
    return (a * b) / __gcd(a, b) 
  
# Print the required constructed array 
def printArray(a, n): 
          
    # printing the first element. 
    print ( str(a[0]) + " ") 
          
    # finding and printing the LCM of  
    # consecutive element of given array. 
    for i in range(0,n-1): 
        print (str(lcm(a[i],a[i + 1])) + " ") 
          
    # printing the last element of the 
    # given array. 
    print (a[n - 1]) 
  
# Driver code 
a = [1, 2, 3 ] 
n = len(a) 
printArray(a, n) 
  
# This code is contributed by Prateek Bajaj 

