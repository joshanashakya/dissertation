

# Python3 program to count the number of pairs 
# whose product is equal to K 
  
# Function to count the number of pairs 
# whose product is equal to K 
def countPairsWithProdK(arr, n, k): 
    count = 0
  
    # Pick all elements one by one 
    for i in range(n): 
        for j in range(i + 1, n): 
  
            # Check if the product of this pair 
            # is equal to K 
            if (arr[i] * arr[j] == k): 
                count += 1
  
    return count 
  
# Driver code 
arr = [1, 5, 3, 4, 2] 
N = len(arr) 
K = 3
  
print(countPairsWithProdK(arr, N, K)) 
  
# This code is contributed by mohit kumar 29 

