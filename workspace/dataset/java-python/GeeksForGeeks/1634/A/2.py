

# Python 3 program to demonstrate  
# descending order 
  
if __name__ == "__main__": 
      
    arr = [ 1, 5, 8, 9, 6, 
            7, 3, 4, 2, 0 ] 
    n = len(arr) 
  
    arr.sort(reverse = True) 
  
    print("Array after sorting : ") 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# This code is contributed by ita_c 

