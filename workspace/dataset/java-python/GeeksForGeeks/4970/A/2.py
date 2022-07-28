

# Python 3 program to construct a distinct  
# element array with given size, sum,  
# element upper bound and all elements  
# positive 
def printArray(N, SUM, K): 
      
    # smallest possible sum 
    minSum = (N * (N + 1)) / 2
  
    # largest possible sum 
    maxSum = (N * K) - (N * (N - 1)) / 2
  
    if (minSum > SUM or maxSum < SUM): 
        print("Not Possible") 
        return
      
    # Creating array with minimum  
    # possible sum. 
    arr = [0 for i in range(N + 1)] 
    for i in range(1, N + 1, 1): 
        arr[i] = i 
    sum = minSum 
  
    # running the loop from last because  
    # the array is sorted and running  
    # from last will give largest numbers 
    i = N 
    while(i >= 1): 
          
        # replacing i with K, Note arr[i] = i 
        x = sum + (K - i) 
        if (x < SUM): 
            sum = sum + (K - i) 
            arr[i] = K 
              
            # can't be incremented further 
            K -= 1
              
            # to maintain uniqueness 
        else: 
              
            # directly replacing with a suitable 
            # element to make sum as given sum 
            arr[i] += (SUM - sum) 
            sum = SUM
            break
        i -= 1
  
    for i in range(1, N + 1, 1): 
        print(int(arr[i]), end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    N = 3
    SUM = 15
    K = 8
    printArray(N, SUM, K) 
  
# This code is contributed by  
# Surendra_Gangwar 

