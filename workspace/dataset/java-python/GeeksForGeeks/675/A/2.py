

# Python3 program to find Array formed by adding  
# each element of given array with largest  
# element in new array to its left  
  
# Function to find array B from array  
# A such that Ai = Bi – max(B0…Bi-1)  
def find_array(a,  n) :  
  
    # Initialising as 0 as first  
    # element will remain same  
    x = 0;  
      
    for i in range(n) : 
  
        # restoring values of B  
        a[i] += x;  
  
        print(a[i],end= ' ');  
          
        # Find max value  
        x = max(x, a[i]);  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [40, 12, 62];  
    n = len(a);  
      
    # Function call  
    find_array(a, n);  
      
# This code is contributed by Yash_R 

