

# Python3 Program to find the minimum number of  
# adjacent swaps to arrange similar items together  
  
# Function to find minimum swaps  
def findMinimumAdjacentSwaps(arr, N) : 
      
    # visited array to check if value is seen already  
    visited = [False] * (N + 1)  
  
    minimumSwaps = 0
  
    for i in range(2 * N) :  
  
        # If the arr[i] is seen first time  
        if (visited[arr[i]] == False) :  
            visited[arr[i]] = True
  
            # stores the number of swaps required to  
            # find the correct position of current  
            # element's partner  
            count = 0 
  
            for j in range( i + 1, 2 * N) :  
  
                # Increment count only if the current  
                # element has not been visited yet (if is  
                # visited, means it has already been placed  
                # at its correct position)  
                if (visited[arr[j]] == False) : 
                    count += 1 
  
                # If current element's partner is found  
                elif (arr[i] == arr[j]) : 
                    minimumSwaps += count  
          
    return minimumSwaps 
  
  
# Driver Code  
if __name__ == "__main__" : 
  
    arr = [ 1, 2, 3, 3, 1, 2 ]  
    N = len(arr)  
    N //= 2
  
    print(findMinimumAdjacentSwaps(arr, N))  
  
# This code is contributed by Ryuga 

