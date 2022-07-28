

# Python3 code to sort an array of Strings 
# with the help of single loop 
  
# Function for Sorting the array using a single loop 
def sortArrays(arr, length): 
      
    # Sorting using a single loop 
    j = 0
    while(j < length - 1): 
          
        # Type Conversion of char to int. 
        d1 = arr[j] 
        d2 = arr[j + 1] 
          
        # Comparing the ascii code. 
        if (d1 > d2): 
              
            # Swapping of the characters 
            temp = arr[j] 
            arr[j] = arr[j + 1] 
            arr[j + 1] = temp 
            j = -1
        j += 1
    return arr 
  
# Driver code 
  
# Declaring a String 
geeks = "GEEKSFORGEEKS"
n = len(geeks) 
  
# declaring character array  
arr=[0]*n 
  
# copying the contents of the  
# string to char array  
for i in range(n): 
    arr[i] = geeks[i] 
      
# Printing the original Array. 
print("Original array: [",end="") 
  
for i in range(n): 
    print(arr[i],end="") 
      
    if (i + 1 != n): 
        print(", ",end="") 
   
print("]") 
  
# Sorting the array using a single loop 
ansarr = sortArrays(arr, n) 
  
# Printing the sorted array. 
print("Sorted array: [",end="") 
  
for i in range(n): 
    print(ansarr[i],end="") 
      
    if (i + 1 != n): 
        print(", ",end="") 
   
print("]") 
  
# This code is contributed by shubhamsingh10 

