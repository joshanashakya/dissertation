

# Python3 implementation of the approach 
  
# Function to find and print the  
# required count of pairs 
def countPairs(arr, n):  
      
    # Find the count of even and  
    # odd elements in the array 
    odd = 0
    even = 0
    for i in range(n):  
        if (arr[i] % 2 == 0):  
            even += 1
        else:  
            odd += 1
              
    # Count the number of odd pairs  
    odd_pairs = odd*(n-1) 
  
    # Count the number of even pairs 
    even_pairs = even*(n-1) 
  
    print(odd_pairs) 
    print(even_pairs) 
  
# Driver code  
if __name__ == '__main__':  
    arr = [2, 3, 4, 5]  
    n = len(arr)  
    countPairs(arr, n) 

