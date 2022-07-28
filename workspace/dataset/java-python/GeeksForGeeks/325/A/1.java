

// Java implementation to find the 
// number of subsets formed by 
// the given value K 
class GFG{ 
   
// Function to find the number 
// of subsets formed by the 
// given value K 
static int count(int arr[], int N, int K) 
{ 
    // Count is used to maintain the 
    // number of continous K's 
    int count = 0, ans = 0; 
   
    // Iterating through the array 
    for (int i = 0; i < N; i++) { 
   
        // If the element in the array 
        // is equal to K 
        if (arr[i] == K) { 
            count = count + 1; 
        } 
        else { 
   
            // count*(count+1)/2 is the 
            // total number of subsets 
            // with only K as their element 
            ans += (count * (count + 1)) / 2; 
   
            // Change count to 0 because 
            // other element apart from 
            // K has been found 
            count = 0; 
        } 
    } 
   
    // To handle the last set of K's 
    ans = ans + (count * (count + 1)) / 2; 
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 0, 0, 1, 1, 0, 0 }; 
    int N = arr.length; 
    int K = 0; 
   
    System.out.print(count(arr, N, K)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

