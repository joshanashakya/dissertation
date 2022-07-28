

# Python 3 program to find modified array after  
# m range toggle operations. 
  
# function for toggle 
def command(brr, a, b): 
    arr[a] ^= 1
    arr[b+1] ^= 1
  
# function for final processing of array 
def process(arr, n): 
    for k in range(1, n + 1, 1): 
        arr[k] ^= arr[k - 1] 
  
# function for printing result 
def result(arr, n): 
    for k in range(1, n + 1, 1): 
        print(arr[k], end = " ") 
  
# Driver Code 
if __name__ == '__main__': 
    n = 5
    m = 3
    arr = [0 for i in range(n+2)] 
  
    # function call for toggle 
    command(arr, 1, 5) 
    command(arr, 2, 5) 
    command(arr, 3, 5) 
      
    # process array 
    process(arr, n) 
      
    # print result 
    result(arr, n) 
  
# This code is contributed by 
# Surendra_Gangwar 

