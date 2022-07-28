

# Python 3 program to count number  
# of sub-arrays whose sum is even 
# using brute force 
# Time Complexity - O(N^2) 
# Space Complexity - O(1)  
  
def countEvenSum(arr, n): 
    result = 0
  
    # Find sum of all subarrays and 
    # increment result if sum is even 
    for i in range(0, n, 1): 
        sum = 0
        for j in range(i, n, 1): 
            sum = sum + arr[j] 
            if (sum % 2 == 0): 
                    result = result + 1
  
    return (result) 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 2, 3, 4, 1] 
    n = len(arr) 
    print("The Number of Subarrays" ,  
                  "with even sum is",  
               countEvenSum (arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

