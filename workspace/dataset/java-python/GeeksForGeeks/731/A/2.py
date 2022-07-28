

# Python 3 program to find minimum and maximum 
# fibonacci number in given array 
  
import sys 
  
# Function to create hash table 
# to check Fibonacci numbers 
def createHash(hash, maxElement): 
    # Insert initial two numbers 
    # in the hash table 
    prev = 0
    curr = 1
    hash.add(prev) 
    hash.add(curr) 
  
    while (curr <= maxElement): 
        # Sum of previous two numbers 
        temp = curr + prev 
  
        hash.add(temp) 
        # Update the variable each time 
        prev = curr 
        curr = temp 
  
# Function to find minimum and maximum 
# fibonacci number in given array 
def fibonacci(arr, n): 
  
    # Find maximum value in the array 
    max_val = max(arr) 
  
    # Creating a set containing 
    # all Fibonacci numbers up to 
    # maximum value in the array 
    hash = set() 
    createHash(hash, max_val) 
  
    # For storing the Minimum 
    # and Maximum Fibonacci number 
    minimum = sys.maxsize 
    maximum = -sys.maxsize-1
  
    for i in range(n): 
  
        # Check if current element 
        # is a fibonacci number 
        if (arr[i] in hash): 
  
            # Update the maximum and 
            # minimum accordingly 
            minimum = min(minimum, arr[i]) 
            maximum = max(maximum, arr[i]) 
  
    print(minimum,end = ", ") 
    print(maximum)  
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 4, 5, 6, 7] 
    n = len(arr) 
  
    fibonacci(arr, n) 
  
# This code is contributed by Surendra_Gangwar 

