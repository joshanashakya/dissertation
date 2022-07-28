

// Java Program to output  
// an array having exactly 
// X subsequences where  
// difference between maximum 
// and minimum element of  
// each subsequence is less 
// than d 
import java.io.*; 
  
class GFG  
{ 
      
// This function outputs  
// the desired array. 
static void printArray(int X, int d,  
                       int first_ele) 
{ 
    // Iterate till all the  
    // disjoint sets are found. 
    while (X > 0)  
    { 
  
        // count_ele the elements  
        // in one disjoint set.  
        // pow_of_two will keep  
        // all the powers of twos. 
        int count_ele = 0,  
            pow_of_two = 2; 
  
        // Iterate to know the  
        // maximum length of  
        // disjoint set by checking 
        // whether X is greater than 
        // the total number of possible 
        // not empty sequences of that  
        // disjoint set. 
        while (X - pow_of_two + 1 >= 0) 
        { 
            count_ele++; 
            pow_of_two *= 2; 
        } 
  
        // now deleting the total  
        // subsequences of the maximum 
        // length disjoint set from X. 
        X = X - (pow_of_two / 2) + 1; 
  
        // outputing the disjoint  
        // set having equal elements. 
        for (int j = 0;  
                 j < count_ele; j++) 
            System.out.print(first_ele + " "); 
  
        // by adding d, it makes 
        // another disjoint set  
        // of equal elements. 
        first_ele += d; 
    } 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int d = 100, X = 25; 
    printArray(X, d, 1); 
} 
} 
  
// This code is contributed 
// by anuj_67. 

