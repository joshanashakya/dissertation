

# Python3 implementation of the approach  
  
# Function to return the count of quadruples  
def countQuadruples(a, n) :  
  
    # Hash table to count the number  
    # of occurrences  
    mpp = dict.fromkeys(a, 0);  
  
    # Traverse and increment the count  
    for i in range(n) : 
        mpp[a[i]] += 1;  
  
    count = 0;  
  
    # Run two nested loop for second 
    # and third element  
    for j in range(n) :  
        for k in range(n) :  
  
            # If they are same  
            if (j == k) : 
                continue;  
  
            # Initially decrease the count  
            mpp[a[j]] -= 1;  
            mpp[a[k]] -= 1;  
  
            # Find the first element using 
            # common difference  
            first = a[j] - (a[k] - a[j]); 
              
            if first not in mpp : 
                mpp[first] = 0; 
                  
            # Find the fourth element using  
            # GP y^2 = x * z property  
            fourth = (a[k] * a[k]) // a[j]; 
              
            if fourth not in mpp : 
                mpp[fourth] = 0; 
                  
            # If it is an integer  
            if ((a[k] * a[k]) % a[j] == 0) : 
  
                # If not equal  
                if (a[j] != a[k]) : 
                    count += mpp[first] * mpp[fourth];  
  
                # Same elements  
                else : 
                    count += (mpp[first] * 
                             (mpp[fourth] - 1));  
              
            # Later increase the value for  
            # future calculations  
            mpp[a[j]] += 1;  
            mpp[a[k]] += 1; 
              
    return count;  
  
# Driver code  
if __name__ == "__main__" : 
  
    a = [ 2, 6, 4, 9, 2 ];  
    n = len(a) ;  
  
    print(countQuadruples(a, n));  
  
# This code is contributed by Ryuga 

