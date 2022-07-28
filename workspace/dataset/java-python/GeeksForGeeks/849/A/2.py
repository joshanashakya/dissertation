

# Python3 implemenattion of the above approach  
  
# Function to organize the given numbers  
# to form a valid sequence.  
def orgazineInOrder(vec, op, n) :  
  
    result = [0] * n; 
      
    # Sorting the array 
    vec.sort(); 
    i = 0; 
    j = n - 1; 
    k = 0;  
      
    while (i <= j and k <= n - 2) : 
          
        # Two pointer technique  
        # to organize the numbers  
        if (op[k] == '<') : 
            result[k] = vec[i];  
            i += 1; 
          
        else : 
            result[k] = vec[j];  
            j -= 1; 
          
        k += 1;  
  
    result[n - 1] = vec[i];  
  
    return result;  
  
# Driver code  
if __name__ == "__main__" :  
  
    vec = [ 8, 2, 7, 1, 5, 9 ]; 
    op = [ '>', '>', '<', '>', '<' ];  
  
    result = orgazineInOrder(vec, op, len(vec));  
  
    for i in range(len(result)) : 
        print(result[i], end = " ");  
  
# This code is contributed by AnkitRai01 

