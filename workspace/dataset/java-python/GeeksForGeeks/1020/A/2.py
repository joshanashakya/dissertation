

# Python3 implementation of the approach  
  
# Function to sort the array  
# by removing misplaced elements  
def removeElements(arr,  n) :  
  
    # brr[] is used to store  
    # the sorted array elements  
    brr = [0]*n; l = 1;  
  
    brr[0] = arr[0];  
    for i in range(1,n) : 
        if (brr[l - 1] <= arr[i]) : 
            brr[l] = arr[i];  
            l += 1;  
  
    # Print the sorted array  
    for i in range(l) : 
        print(brr[i],end=" ");  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 10, 12, 9, 10, 2, 13, 14 ];  
    n = len(arr);  
    removeElements(arr, n);  
  
    # This code is contributed by AnkitRai01 

