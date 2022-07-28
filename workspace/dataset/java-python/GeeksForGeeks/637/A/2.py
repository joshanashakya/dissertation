

# Python3 program to find the minimum number  
# of elements the need to be changed  
# to get first N numbers of Fibonacci series  
  
# Function that finds minimum changes required  
def fibonacciArray(arr, n):  
  
    s = set()  
  
    # a and b are first two  
    # fibonacci numbers  
    a, b = 1, 1
  
    # insert first n fibonacci elements to set  
    s.add(a)  
    if n >= 2:  
        s.add(b)  
  
    for i in range(0, n - 2):  
        c = a + b  
        s.add(c)  
        a, b = b, c  
  
    for i in range(0, n):  
  
        # if fibonacci element is present in  
        # the array then remove it from set  
        if arr[i] in s:  
            s.remove(arr[i])  
  
    # return the remaining number  
    # of elements in the set  
    return len(s)  
  
# Driver code  
if __name__ == "__main__":  
  
    arr = [3, 1, 21, 4, 2, 1, 8, 9]  
    n = len(arr)  
  
    print(fibonacciArray(arr, n)) 
  
# This code is contributed by Rituraj Jain 

