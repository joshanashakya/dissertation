

// Java Program to find sum of values of  
// all special triplets 
class GFG 
{ 
  
/* Finding special triplets (x, y, z) where 
x belongs to A; y belongs to B and z  
belongs to C; p, q and r are size of  
A, B and C respectively */
static int findSplTripletsSum(int a[], int b[], int c[],  
                            int p, int q, int r) 
{ 
  
    int sum = 0; 
    for (int i = 0; i < p; i++)  
    { 
        for (int j = 0; j < q; j++) 
        { 
            for (int k = 0; k < r; k++)  
            { 
  
                // (a[i], b[j], c[k]) is special if 
                // a[i] <= b[j] and c[k] <= b[j]; 
                if (a[i] <= b[j] && c[k] <= b[j]) 
                { 
  
                    // calculate the value of this special 
                    // triplet and add sum of all values  
                    // of such triplets 
                    sum += (a[i] + b[j]) * (b[j] + c[k]); 
                } 
            } 
        } 
    } 
    return sum; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int A[] = { 1, 4, 5 }; 
    int B[] = { 2, 3 }; 
    int C[] = { 2, 1, 3 }; 
  
    int p = A.length; 
    int q = B.length; 
    int r = C.length; 
  
    System.out.print("Sum of values of all special triplets = "
                    + findSplTripletsSum(A, B, C, p, q, r) +"\n"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

