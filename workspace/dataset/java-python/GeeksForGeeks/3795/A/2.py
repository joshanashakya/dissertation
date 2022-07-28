

# Python3 implementation of the approach  
  
# Function to return the Kth element in B[]  
def solve(Array, N, K) :  
  
    # Initialize the count Array  
    count_Arr = [0]*(N + 2) ;  
    factor = 1;  
    size = N;  
  
    # Reduce N repeatedly to half its value  
    while (size) : 
        start = 1;  
        end = size;  
  
        # Add count to start  
        count_Arr[1] += factor * N;  
  
        # Subtract same count after end index  
        count_Arr[end + 1] -= factor * N;  
        factor += 1;  
        size //= 2;  
  
    for i in range(2, N + 1) :  
        count_Arr[i] += count_Arr[i - 1];  
  
    # Store each element of Array[] with their count  
    element = []; 
      
    for i in range(N) : 
        element.append(( Array[i], count_Arr[i + 1] ));  
  
    # Sort the elements wrt value  
    element.sort();  
  
    start = 1;  
    for i in range(N) : 
        end = start + element[i][1] - 1;  
  
        # If Kth element is in range of element[i]  
        # return element[i]  
        if (K >= start and K <= end) : 
            return element[i][0];  
  
        start += element[i][1];  
  
    # If K is out of bound  
    return -1;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 2, 4, 5, 1 ];  
    N = len(arr);  
    K = 13;  
  
    print(solve(arr, N, K));  
  
    # This code is contributed by AnkitRai01 

