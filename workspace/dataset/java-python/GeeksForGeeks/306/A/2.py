

# Python3 program find the minimum number of consecutive  
# sequences in an array  
  
def countSequences(arr, n) : 
    count = 1
  
    arr.sort() 
  
    for i in range( n -1) :  
        if (arr[i] + 1 != arr[i + 1]) : 
            count += 1
  
    return count  
   
  
# Driver program  
if __name__ == "__main__" : 
  
    arr = [ 1, 7, 3, 5, 10 ]  
    n = len(arr) 
  
    # function call to print required answer  
    print(countSequences(arr, n))  
  
# This code is contributed by Ryuga 

