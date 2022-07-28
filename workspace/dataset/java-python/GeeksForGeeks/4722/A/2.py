

# Python3 program to implement the  
# above approach  
  
# Function to find the value of d and  
# find the number of zeros in the array  
def findDandZeros(a, b, n) :  
  
    # Hash table  
    mpp = {};  
  
    count = 0;  
  
    # Iterate for i-th element  
    for i in range(n) : 
  
        # If both are not 0  
        if (b[i] != 0 and a[i] != 0) : 
            val = (-1.0 * b[i]) / a[i];  
              
            if val not in mpp : 
                mpp[val] = 0; 
                  
            mpp[val] += 1;  
  
        # If both are 0  
        elif (b[i] == 0 and a[i] == 0) : 
            count += 1;  
  
    # Find max occurring d  
    maxi = 0;  
    for item in mpp :  
        maxi = max(mpp[item], maxi); 
  
    # Print the d which occurs max times  
    for keys, values in mpp.items() :  
        if (values == maxi) :  
            print("Value of d is:", keys);  
            break;  
  
    # Print the number of zeros  
    print("The number of zeros in array C is:", 
                                 maxi + count);  
  
# Driver code  
if __name__ == "__main__" :  
    a = [ 13, 37, 39 ];  
    b = [ 1, 2, 3 ];  
      
    n = len(a); 
    findDandZeros(a, b, n);  
  
# This code is contributed by Ryuga 

