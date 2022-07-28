

# Python3 program to removes all odd  
# frequency elements from an Array  
  
# Function that removes the  
# elements which have odd  
# frequencies in the array  
def remove(arr,  n) : 
  
    # Create a map to store the 
    # frequency of each element 
    m = dict.fromkeys(arr,0); 
    for i in range(n) : 
        m[arr[i]] += 1; 
          
    # Remove the elements which 
    # have odd frequencies 
    for i in range(n) : 
  
        # If the element has  
        # odd frequency then skip 
        if ((m[arr[i]] & 1)) : 
            continue; 
              
        print(arr[i],end= ", ");  
  
# Driver code  
if __name__ == "__main__" : 
  
    arr    = [ 3, 3, 3, 2,  
            2, 4, 7, 7 ];  
    n = len(arr);  
  
    # Function call  
    remove(arr, n);  
  
# This code is contributed by Yash_R 

