

# Python 3 implementation of the approach 
  
# Utility function to print the original  
# indices of the elements of the array 
def printIndices(n, a): 
    for i in range(n): 
        print(a[i][1], end = " ") 
    print("\n", end = "") 
  
# Function to print the required  
# permutations 
def printPermutations(n, a, k): 
      
    # To keep track of original indices 
    arr = [[0, 0] for i in range(n)] 
    for i in range(n): 
        arr[i][0] = a[i] 
        arr[i][1] = i 
  
    # Sort the array 
    arr.sort(reverse = False) 
  
    # Count the number of swaps that  
    # can be made 
    count = 1
    for i in range(1, n): 
        if (arr[i][0] == arr[i - 1][0]): 
            count += 1
  
    # Cannot generate 3 permutations 
    if (count < k): 
        print("-1", end = "") 
        return
  
    for i in range(k - 1): 
          
        # Print the first permutation 
        printIndices(n, arr) 
  
        # Find an index to swap and create 
        # second permutation 
        for j in range(1, n): 
            if (arr[j][0] == arr[j - 1][0]): 
                temp = arr[j] 
                arr[j] = arr[j - 1] 
                arr[j - 1] = temp 
                break
  
    # Print the last permuation 
    printIndices(n, arr) 
  
# Driver code 
if __name__ == '__main__': 
    a = [1, 3, 3, 1] 
    n = len(a) 
    k = 3
    printPermutations(n, a, k) 
  
# This code is contributed by 
# Surendra_Gangwar 

