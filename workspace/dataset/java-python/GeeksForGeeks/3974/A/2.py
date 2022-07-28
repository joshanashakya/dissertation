

# Python program to implement  
# front and back search 
  
def search(arr, n, x): 
  
    # Start searching from both ends 
    front = 0; back = n - 1
      
    # Keep searching while two  
    # indexes do not cross. 
    while (front <= back): 
      
        if (arr[front] == x or arr[back] == x): 
            return True
        front += 1
        back -= 1
      
    return False
  
# Driver code 
arr = [10, 20, 80, 30, 60,  
       50, 110, 100, 130, 170] 
x = 130
n = len(arr) 
  
if (search(arr, n, x)): 
    print("Yes") 
else: 
    print("No") 
      
# This code is contributed by Anant Agarwal. 

