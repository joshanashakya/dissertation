

# Python3 program to find product of elements 
# at even and odd index positions separately 
  
   
  
# Function to calculate product 
def EvenOddProduct(arr, n): 
   
    even = 1  
    odd = 1  
  
    for i in range (0,n): 
  
        # Loop to find even, odd product 
        if (i % 2 == 0): 
            even *= arr[i]   
        else: 
            odd *= arr[i]   
       
  
    print("Even Index Product : " , even)   
    print("Odd Index Product : " , odd)   
   
  
# Driver Code 
   
arr =   1, 2, 3, 4, 5, 6    
n = len(arr)  
  
EvenOddProduct(arr, n)   
  
# This code is contributed by ihritik 

