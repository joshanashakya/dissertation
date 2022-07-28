

# Python3 program to reduce the array  
# such that each element appears  
# at most 2 times  
  
# Function to remove duplicates  
def removeDuplicates(arr, n) :  
  
    # Initalise 2nd pointer  
    st = 0;  
  
    # Itereate over the array  
    for i in range(n) : 
  
        if (i < n - 2 and arr[i] == arr[i + 1]  
            and arr[i] == arr[i + 2]) : 
            continue;  
  
        # Updating the 2nd pointer  
        else : 
            arr[st] = arr[i];  
            st += 1;  
  
    print("{",end="")  
    for i in range(st) : 
        print(arr[i],end=""); 
          
        if (i != st - 1) : 
            print(", ",end="");  
      
    print("}",end="");  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 1, 1, 2,  
            2, 2, 3, 3,  
            3, 3, 3, 3,  
            4, 5 ];  
  
    n = len(arr); 
      
    # Function call  
    removeDuplicates(arr, n);  
  
# This code is contributed by Yash_R 

