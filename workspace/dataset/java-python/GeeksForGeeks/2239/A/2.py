

# Python3 implementation for the above approach 
  
# Convert the number to Lth 
# base and print the sequence 
def convert_To_Len_th_base(n, arr, Len, L): 
      
    # Sequence is of Length L 
    for i in range(L): 
          
        # Print the ith element 
        # of sequence 
        print(arr[n % Len], end = "") 
        n //= Len
    print() 
  
# Print all the permuataions 
def printf(arr, Len, L): 
      
    # There can be (Len)^l permutations 
    for i in range(pow(Len, L)): 
          
        # Convert i to Len th base 
        convert_To_Len_th_base(i, arr, Len, L) 
  
# Driver code 
arr = [1, 2, 3] 
Len = len(arr) 
L = 2
  
# function call 
printf(arr, Len, L) 
  
# This code is contributed by Mohit Kumar 

