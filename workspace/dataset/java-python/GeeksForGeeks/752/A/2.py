

# Python 3 program to sort an array  
# based on absolute difference with 
# a given value x. 
def arrange(arr, n, x): 
  
    # Below lines are similar to  
    # insertion sort 
    for i in range(1, n) : 
        diff = abs(arr[i] - x) 
  
        # Insert arr[i] at correct place 
        j = i - 1
        if (abs(arr[j] - x) > diff) : 
            temp = arr[i] 
            while (abs(arr[j] - x) >  
                       diff and j >= 0) : 
                arr[j + 1] = arr[j] 
                j -= 1
              
            arr[j + 1] = temp 
  
# Function to print the array 
def print_1(arr, n): 
  
    for i in range(n): 
        print(arr[i], end = " ") 
  
# Driver Code 
if __name__ == "__main__": 
      
    arr = [ 10, 5, 3, 9, 2 ] 
    n = len(arr) 
    x = 7
  
    arrange(arr, n, x) 
    print_1(arr, n) 
  
# This code is contributed by ita_c 

