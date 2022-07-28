

# Python3 program to find the count 
# number of even and odd 
# length elements in an Array 
  
# Function to find the number elements of 
# the array having even length and odd. 
def EvenOddLength(arr, n): 
      
    # Store numbers with even length 
    even = 0
  
    for i in range(n): 
  
        # Conversion of integer to string 
        x = str(arr[i]) 
  
        if (len(x) % 2 == 0): 
            even += 1
  
    print( "Number of even length elements = ", even) 
    print( "Number of odd length elements = ", n - even) 
  
# Driver code 
if __name__ == '__main__': 
    arr= [12, 44, 213, 232, 3433] 
    n = len(arr) 
  
    # Function call 
    EvenOddLength(arr, n) 
  
# This code is contributed by mohit kumar 29 

