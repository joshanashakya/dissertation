

# Python3 program to calculate all multiples 
# of integer 'k' in array[] 
  
# ans is global array so that both countSieve() 
# and countMultiples() can access it. 
ans = [] 
  
# Function to pre-calculate all multiples 
# of array elements  
# Here, the arguments are as follows 
# a: given array 
# n: length of given array 
def countSieve(arr, n): 
      
    MAX=max(arr) 
  
# Accessing the global array in the function 
    global ans 
  
# Initializing "ans" array with zeros 
    ans = [0]*(MAX + 1) 
  
# Initializing "cnt" array with zeros 
    cnt = [0]*(MAX + 1) 
  
#Store the arr[] elements as index in cnt[] array 
    for i in range(n): 
        cnt[arr[i]] += 1
  
# Iterate over all multiples as 'i'  
# and keep the count of array[] ( In  
# cnt[] array) elements in ans[] array  
    for i in range(1, MAX+1): 
        for j in range(i, MAX+1, i): 
            ans[i] += cnt[j] 
  
def countMultiples(k): 
# Return pre-calculated result 
    return(ans[k]) 
  
# Driver code 
if __name__ == "__main__": 
    arr = [2, 4, 9 ,15, 21, 20] 
    n=len(arr) 
# Pre-calculate all multiples 
    countSieve(arr, n) 
    k=2
    print(countMultiples(2)) 
    k=3
    print(countMultiples(3)) 
    k=5
    print(countMultiples(5)) 
  
  
  
# This code is contributed by Pratik Somwanshi 

