

# Python 3 program to minimize the sum 
# of squares of sum of numbers 
# of N/2 groups of N numbers 
  
# Function that returns the minimize sum 
# of square of sum of numbers of every group 
def findMinimal(a, n): 
  
    # Sort the array elements 
    a.sort() 
  
    sum = 0
  
    # Iterate for the first half of array 
    for i in range( n // 2):  
        sum += ((a[i] + a[n - i - 1]) * 
                (a[i] + a[n - i - 1])) 
  
    return sum
  
# Driver Code 
if __name__ == "__main__": 
      
    a = [ 8, 5, 2, 3 ] 
    n = len(a) 
  
    print(findMinimal(a, n)) 
  
# This code is contributed by ita_c 

