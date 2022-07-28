

# Python3 program to find the largest  
# possible k-multiple set  
  
# Function to find the largest  
# possible k-multiple set  
def K_multiple(a, n, k) :  
  
    # Sort the given array  
    a.sort();  
  
    # To store k-multiple set  
    s = set();  
  
    # Traverse through the whole array  
    for i in range(n) : 
          
        # Check if x/k is already present or not  
        if ((a[i] % k == 0 and 
             a[i] // k not in s ) or a[i] % k != 0) : 
            s.add(a[i]); 
              
    # Print the k-multiple set  
    for i in s : 
        print(i, end = " ") 
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 2, 3, 4, 5, 6, 10 ];  
    k = 2;  
  
    n = len(a);  
  
    # Function call  
    K_multiple(a, n, k);  
  
# This code is contributed by AnkitRai01 

