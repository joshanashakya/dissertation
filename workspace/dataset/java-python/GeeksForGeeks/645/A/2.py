

# Python 3 program to remove all the 
# fibonacci numbers from the 
# given array 
  
sz = 1000
  
# Set to store all the Fibonacci numbers 
fib = set() 
  
# Function to generate Fibonacci numbers using 
# Dynamic Programming and create hash table 
# to check Fibonacci numbers 
def fibonacci(): 
  
    # Storing the first two Fibonacci 
    # numbers in the set 
    prev , curr , length = 0 , 1, 2
    fib.add(prev) 
    fib.add(curr) 
  
    # Compute the remaining Fibonacci numbers 
    # until the max size and store them 
    # in the set 
    while (length <= sz): 
        temp = curr + prev 
        fib.add(temp) 
        prev = curr 
        curr = temp 
        length += 1
  
# Function to print the elements of the array 
def printArray( arr, length): 
  
    for i in range(length): 
        print(arr[i],end=" ") 
          
# Function to remove all the Fibonacci numbers 
# from the array 
def removeFibonacci( arr, length): 
  
    # Creating a set containing 
    # all the fibonacci numbers 
    fibonacci() 
  
    # Traverse the array 
    for i in fib: 
        if i in arr: 
            arr.remove(i) 
            length -= 1
  
    # Print the updated array 
    printArray(arr, length) 
  
# Driver code 
if __name__ == "__main__": 
      
    arr = [ 4, 6, 5, 3, 8, 7, 
                10, 11, 14, 15 ] 
  
    length = len(arr) 
    removeFibonacci(arr, length) 
  
# This code is contributed by chitranayal 

