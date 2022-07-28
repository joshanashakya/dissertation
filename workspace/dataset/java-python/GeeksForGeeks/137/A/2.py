

# Python3 program to count pairs (i, j)  
# such that arr[i] * arr[j] = arr[i] + arr[j]  
  
# Function to return the count of pairs(i, j)  
# such that arr[i] * arr[j] = arr[i] + arr[j]  
def countPairs(arr, n) :  
  
    count = 0;  
  
    for i in range(n - 1) : 
        for j in range(i + 1, n) : 
  
            # Increment count if condition satisfy  
            if (arr[i] * arr[j] == arr[i] + arr[j]) : 
                count += 1;  
  
    # Return count of pairs  
    return count;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 2, 0, 3, 2, 0 ];  
    n = len(arr);  
  
    # Get and print count of pairs  
    print(countPairs(arr, n));  
      
# This code is contributed by AnkitRai01 

