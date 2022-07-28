

# Function to return the minimum sum  
def findMin(arr, n): 
    sum = 0
    for i in range(0, n):  
        sum = sum + arr[i] 
  
    # sort the array to find the  
    # minimum element  
    arr.sort() 
  
    min = arr[0] 
    max = 0
  
    for i in range(n - 1, 0, -1):  
        num = arr[i] 
        total = num + min
  
        # finding the number to  
        # divide  
        for j in range(2, num + 1):  
            if(num % j == 0): 
                d = j 
                now = (num // d) + (min * d) 
  
                # Checking to what  
                # instance the sum  
                # has decreased  
                reduce = total - now 
  
                # getting the max  
                # difference  
                if(reduce > max): 
                    max = reduce
  
    print(sum - max) 
  
# Driver Code  
arr = [1, 2, 3, 4, 5 ] 
n = len(arr) 
findMin(arr, n) 
  
# This code is contributed by Sanjit_Prasad 

