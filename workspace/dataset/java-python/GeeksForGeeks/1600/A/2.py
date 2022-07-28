

# Python3 program to implement  
# the above approach  
  
# Function to print both the arrays  
def PrintBothArrays(a, n) : 
  
    # Store both arrays  
    v1, v2 = [], [];  
  
    # Used for hashing  
    mpp = dict.fromkeys(a, 0);  
  
    # Iterate for every element  
    for i in range(n) : 
  
        # Increase the count  
        mpp[a[i]] += 1;  
  
        # If first occurrence  
        if (mpp[a[i]] == 1) : 
            v1.append(a[i]);  
  
        # If second occurrence  
        elif (mpp[a[i]] == 2) :  
            v2.append(a[i]);  
  
        # If occurs more than 2 times  
        else :  
            print("Not possible");  
            return;  
  
    # Sort in increasing order  
    v1.sort();  
  
    # Print the increasing array  
    print("Strictly increasing array is:");  
    for it in v1: 
        print(it, end = " ");  
  
    # Sort in reverse order  
    v2.sort(reverse = True);  
  
    # Print the decreasing array  
    print("\nStrictly decreasing array is:");  
    for it in v2 :  
        print(it, end = " ")  
  
# Driver code  
if __name__ == "__main__" : 
  
    a = [ 7, 2, 7, 3, 3, 1, 4 ];  
    n = len(a);  
    PrintBothArrays(a, n);  
  
# This code is contributed by Ryuga 

