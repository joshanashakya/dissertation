

# Python3 program to print above pattern  
def display(n): 
    for i in range(1, n + 1): 
        k = i 
        for j in range(1, i + 1): 
            if k % 2 == 0: 
                  
                # Displaying the numbers  
                print(j, end = '') 
            else: 
                  
                # Displaying the stars  
                print('*', end = '') 
            k -= 1
        print() 
  
# Driver Code  
  
# Get n  
n = 5
  
# Print the pattern  
display(n) 
  
# This code is contributed by SamyuktaSHegde  

