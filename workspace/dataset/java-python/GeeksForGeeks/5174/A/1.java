

// Java program to find a number less than 
// n such that all its digits are distinct 
  
class GFG{ 
// Function to find a number less than 
// n such that all its digits are distinct 
static int findNumber(int n) 
{ 
    // looping through numbers less than n 
    for (int i = n - 1;i >=0 ; i--) { 
  
        // initializing a hash array 
        int[] count=new int[10];  
  
        int x = i; // creating a copy of i 
  
        // initializing variables to compare lengths of digits 
        int count1 = 0, count2 = 0; 
  
        // counting frequency of the digits 
        while (x>0) { 
            count[x % 10]++;  
            x /= 10; 
            count1++; 
        } 
  
        // checking if each digit is present once 
        for (int j = 0; j < 10; j++) { 
            if (count[j] == 1)  
                count2++; 
        }          
        if (count1 == count2) 
            return i; 
    } 
    return -1; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 8490; 
    System.out.println(findNumber(n)); 
} 
} 
// This code is contributed by mits 

