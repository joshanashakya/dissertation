

# Python3 program to count the number of pairs 
# whose product is equal to K 
MAX = 100000; 
  
# Function to count the number of pairs 
# whose product is equal to K 
def countPairsWithProductK(arr, n, k) : 
  
    # Initialize the count 
    count = 0; 
  
    # Initialize empty hashmap. 
    hashmap = [False]*MAX ; 
  
    # Insert array elements to hashmap 
    for i in range(n) : 
        hashmap[arr[i]] = True; 
  
    for i in range(n) : 
        x = arr[i]; 
  
        index = 1.0 * k / arr[i]; 
  
        # Checking if the index is a whole number 
        # and present in the hashmap 
        if (index >= 0
            and ((index - int(index)) == 0) 
            and hashmap[k // x]) : 
  
                count += 1; 
          
        hashmap[x] = False; 
      
    return count; 
  
# Driver code 
if __name__ == "__main__" : 
    arr = [ 1, 5, 3, 4, 2 ]; 
    N = len(arr); 
    K = 3; 
  
    print(countPairsWithProductK(arr, N, K)); 
  
# This code is contributed by AnkitRai01 

