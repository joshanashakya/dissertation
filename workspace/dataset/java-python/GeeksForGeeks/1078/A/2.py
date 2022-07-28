

# Python3 Implementation to Check  
# if Sum and XOR of all Elements  
# of Array is equal  
  
# Function to Check if Sum and XOR  
# of all elements of array is equal  
def equal_xor_sum(arr, n) :  
  
    Sum = 0;  
    Xor = 0;  
  
    # Sum and XOR of all elements  
    for i in range(n) :  
        Sum = Sum + arr[i];  
        Xor = Xor ^ arr[i];  
  
    # Checking Sum and XOR to be equal  
    if (Sum == Xor) : 
        print("YES");  
    else : 
        print("NO");  
  
# Driver Function  
if __name__ == "__main__" : 
  
    arr = [ 6, 3, 7, 10 ]; 
    n = len(arr);  
  
    # Check Sum and XOR is equal  
    equal_xor_sum(arr, n);  
  
# This code is contributed by AnkitRai01 

