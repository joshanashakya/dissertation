

# Python3 program to reduce the array 
# such that each element appears 
# at most K times 
  
# Function to reduce the array 
def reduceArray(arr, n, K) : 
  
    # List to store the reduced array 
    vec = []; 
    size = 0; 
    curr_ele = arr[0]; curr_freq = 1; 
  
    # Iterate over the array 
    for i in range(n) : 
  
        if (curr_ele == arr[i] 
            and curr_freq <= K) : 
            vec.append(arr[i]); 
            size += 1; 
  
        elif (curr_ele != arr[i]) : 
            curr_ele = arr[i]; 
            vec.append(arr[i]); 
            size += 1; 
            curr_freq = 1; 
          
        curr_freq += 1; 
  
    # Print the reduced array 
    print("{",end= ""); 
    for i in range(size) : 
        print(vec[i] ,end= ", "); 
      
    print("}",end=""); 
  
# Driver code 
if __name__ == "__main__" : 
  
    arr = [ 1, 1, 1, 2, 
           2, 2, 3, 3, 
            3, 3, 3, 3, 
            4, 5 ]; 
  
    n = len(arr) 
    K = 2; 
  
    # Function call 
    reduceArray(arr, n, K); 
  
# This code is contributed by AnkitRai01 

