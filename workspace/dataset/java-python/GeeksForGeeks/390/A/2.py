

# Python3 program to calculate minimum cost  
# to make an Array a permutation  
# of first N natural numbers  
  
# Function to calculate minimum cost  
# for making permutation of size N  
def make_permutation(arr,  n) : 
  
    # sorting the array in ascending order  
    arr.sort();  
  
    # To store the required answer  
    ans = 0;  
  
    # Traverse the whole array  
    for i in range(n) : 
        ans += abs(i + 1 - arr[i]);  
  
    # Return the required answer  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 5, 3, 8, 1, 1 ];  
    n = len(arr);  
  
    # Function call  
    print(make_permutation(arr, n));  
  
    # This code is contributed by Yash_R 

