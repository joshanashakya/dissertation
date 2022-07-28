

# Python3 program to find triplets in a  
# given array whose sum is given sum. 
  
# function to print triplets with 
# given sum 
def findTriplets(arr, n, sum): 
  
    # sort array elements 
    arr.sort(); 
  
    for i in range(0, n - 1):  
          
        # initialize left and right 
        l = i + 1; 
        r = n - 1; 
        x = arr[i]; 
        while (l < r) : 
            if (x + arr[l] + arr[r] == sum) : 
                  
                # print elements if it's sum  
                # is given sum. 
                print(x, arr[l], arr[r]); 
                l = l + 1; 
                r = r - 1; 
              
            # If sum of three elements is less 
            # than 'sum' then increment in left 
            elif (x + arr[l] + arr[r] < sum): 
                l = l + 1; 
  
            # if sum is greater than given sum,  
            # then decrement in right side 
            else: 
                r = r - 1; 
          
# Driver code 
arr = [ 0, -1, 2, -3, 1 ]; 
sum = -2; 
n = len(arr); 
findTriplets(arr, n, sum); 
  
# This code is contributed by  
# Shivi_Aggarwal  

