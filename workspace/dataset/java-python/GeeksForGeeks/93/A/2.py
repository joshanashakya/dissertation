

# Python 3 program to Count the  
# number of elements in an array 
# which are divisible by k 
  
# Function to count the elements 
def CountTheElements(arr, n, k): 
    counter = 0
  
    for i in range(0, n, 1): 
        if (arr[i] % k == 0): 
            counter = counter+1
      
    return counter 
  
# Driver code 
if __name__ == '__main__': 
    arr = [2, 6, 7, 12, 14, 18]; 
    n = len(arr) 
    k = 3
  
    print(CountTheElements(arr, n, k)) 
  
# This code is contributed by  
# Surendra_Gangwar 

