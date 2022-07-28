

# Brute force solution to find 
# out maximum perimeter triangle  
# which can be formed using the  
# elements of the given array 
  
# Function to find out  
# maximum perimeter 
def maxPerimeter(arr): 
    maxi = 0
    n = len(arr) 
      
    # pick up 3 different  
    # elements from the array. 
    for i in range(n - 2): 
        for j in range(i + 1, n - 1): 
            for k in range(j + 1, n): 
                  
                # a, b, c are 3 sides  
                # of the triangle 
                a = arr[i] 
                b = arr[j] 
                c = arr[k] 
                if(a < b + c and b < a + c  
                             and c < a + b): 
                    maxi = max(maxi, a + b + c) 
  
    if(maxi == 0): 
        return "Triangle formation is not possible"
    else: 
        return "Maximum Perimeter is: "+ str(maxi) 
  
# Driver code 
def main(): 
    arr1 = [6, 1, 6, 5, 8, 4] 
    a = maxPerimeter(arr1) 
    print(a) 
  
    arr2 = [2, 20, 7, 55,  
            1, 33, 12, 4] 
    a = maxPerimeter(arr2) 
    print(a) 
  
    arr3 = [33, 6, 20, 1, 8,  
            12, 5, 55, 4, 9] 
    a = maxPerimeter(arr3) 
    print(a) 
  
if __name__=='__main__': 
    main() 
  
# This code is contributed  
# by Pritha Updhayay 

