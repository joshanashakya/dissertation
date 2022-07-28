

# Python3 implementation to count the 
# number of contiguous subsequences 
# whose product can be expressed as 
# the square of difference of two integers 
  
# Function to count the number 
# of contiguous subsequences 
# whose product can be expressed 
# as square of difference of two integers 
def CntcontSubs(a, n): 
    c = 0
    d = 0
    sum = 1
  
    # Iterating through the array 
    for i in range(n): 
  
        # Check if that number can be 
        # expressed as the square of 
        # difference of two numbers 
        if (a[i] % 2 != 0 or a[i] % 4 == 0): 
            d += 1
  
        # Variable to compute the product 
        sum = a[i] 
  
        # Finding the remaining subsequences 
        for j in range(i + 1, n): 
            sum = sum * a[j] 
  
            # Check if that number can be 
            # expressed as the square of 
            # difference of two numbers 
            if (sum % 2 != 0 or sum % 4 == 0): 
                c += 1
        sum = 1
  
    # Return the number of subsequences 
    return c + d 
  
# Driver code 
if __name__ == '__main__': 
    arr=[5, 4, 2, 9, 8] 
    n = len(arr) 
  
    print(CntcontSubs(arr, n)) 
  
# This code is contributed by mohit kumar 29 

