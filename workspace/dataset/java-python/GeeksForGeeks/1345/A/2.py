

# A simple Python program 
# to count divisors 
# in array multiplication. 
  
# To count number of 
# factors in a number 
def counDivisors(X): 
  
    # Initialize count with 0 
    count = 0
    # Increment count for 
    # every factor 
    # of the given number X. 
    for i in range(1, X + 1): 
        if (X % i == 0):  
            count += 1
   
    # Return number of factors 
    return count 
   
# Returns number of 
# divisors in array 
# multiplication 
def countDivisorsMult(arr, n): 
  
    # Multipliying all elements of 
    # the given array. 
    mul = 1
    for i in range(n):  
        mul *= arr[i] 
       
    # Calling function which 
    # count number of factors 
    # of the number 
    return counDivisors(mul) 
  
# Driver code 
  
arr = [ 2, 4, 6 ] 
n =len(arr) 
  
print(countDivisorsMult(arr, n)) 
  
# This code is contributed 
# by Anant Agarwal. 

