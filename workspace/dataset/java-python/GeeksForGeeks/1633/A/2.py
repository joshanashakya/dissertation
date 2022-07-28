

# Bubble sort implementation to sort 
# elements in descending order. 
  
def print1(a, n): 
  
    for i in range(0,n+1): 
        print(a[i],end=" ")  
    print("") 
  
  
# Sorts a[] in descending order using 
# bubble sort. 
def sort(a, n): 
  
    for i in range(n,0,-1):  
        for j in range(n, n - i,-1):  
            if (a[j] > a[j - 1]):  
                a[j], a[j-1]=a[j-1], a[j] 
    print1(a,n) 
  
  
# Driver code 
n = 7
a = [2,4,3,2,4,5,3] 
  
sort(a, n-1) 
  
# This code is contributed 
# by Smitha Dinesh Semwal 

