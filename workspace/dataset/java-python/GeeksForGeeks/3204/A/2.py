

# Python program to 
# find three indices 
  
max = 50009
  
# Function to find 
# required indices. 
def find_Indices(arr, n): 
  
    sum=[0 for i in range(max)] 
       
    # calculating prefix sum from 
    # 1 to i for each i. 
    k=0
    for i in range(1,n+1): 
        sum[i] = sum[i-1] + arr[k]; 
        k+=1
       
    ans = -(1e15) 
    index_1 = index_2 = index_3 = -1
   
    # iterating the loop from 0 to n 
    # for all possibilities. 
    for l in range(n+1): 
        index = 0
        vmin = (1e15) 
   
        # Here, we recalling the best 
        # segment to end at position i. 
        for r in range(l,n+1): 
   
              
            # taking the minimal prefix 
            # sum from 0 to i inclusive. 
            if (sum[r] < vmin): 
                vmin = sum[r] 
                index = r 
              
                           
            # calculating the indices. 
            if (sum[l] + sum[r] - vmin > ans):  
              
                ans = sum[l] + sum[r] - vmin 
                index_1 = l 
                index_2 = index 
                index_3 = r 
          
    # Required indices. 
    print(index_1," ", index_2," ", index_3) 
   
# Driver function 
  
arr = [-1, 2, 3] 
n = len(arr) 
find_Indices(arr, n) 
  
# This code is contributed 
# by Anant Agarwal. 

