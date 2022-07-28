

# Python3 implementation of above approach 
  
# Helper function, counts number of inversions 
# via bubble sort loop 
def bubble_count(arr, start, end): 
    count = 0; 
    for i in range(start, end): 
  
        for j in range(i + 1, end): 
  
            if (arr[i] > arr[j]): 
                count += 1; 
  
    return count; 
  
# Inversion counting method, slides window  
# of [start, end] across array 
def inversion_count(n, k, a): 
    count = 0; 
    for start in range(0, n - k + 1): 
        end = start + k; 
        count += bubble_count(a, start, end); 
  
    return count; 
  
# Driver Code 
if __name__ == '__main__': 
    n = 10; 
    arr = [15, 51, 44, 44, 76,  
           50, 29, 88, 48, 50]; 
    k = 5; 
  
    result = inversion_count(n, k, arr); 
    print(result); 
  
# This code is contributed by Rajput-Ji 

