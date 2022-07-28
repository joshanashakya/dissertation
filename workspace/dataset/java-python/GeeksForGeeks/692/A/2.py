

# Python program to find the minimum  
# possible of the expression by choosing 
# exactly K(? N) integers form given array arr  
  
# Function to find the minimum  
# possible of the expression by  
# choosing exactly K(? N) integers  
# form given array arr 
def minimumValue(arr, n, k): 
  
    # Sorting the array for least k element selection 
    arr.sort(); 
  
    answer = 0; 
  
    # Select first k elements from sorted array 
    for i in range(k): 
        answer += arr[i] * arr[i]; 
  
    # Return value of solved expression 
    return answer * (2 * k - 2); 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 4, 21, 5, 3, 8 ]; 
    k = 3; 
  
    n = len(arr); 
  
    # Function call 
    print(minimumValue(arr, n, k)); 
  
# This code is contributed by Rajput-Ji 

