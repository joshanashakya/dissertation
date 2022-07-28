

import java.util.Vector; 
  
// Java code to delete element  
// in given range  
class GFG { 
// Delete L to R element  
  
    static Vector<Integer> deleteElement(int A[], int L, int R, int N) { 
        Vector<Integer> B = new Vector<>(); 
  
        for (int i = 0; i < N; i++) { 
            if (i <= L || i >= R) { 
                B.add(A[i]); 
            } 
        } 
  
        return B; 
    } 
  
// main Driver  
    public static void main(String[] args) { 
        int A[] = {3, 5, 3, 4, 9, 3, 1, 6, 3, 11, 12, 3}; 
        int L = 2, R = 7; 
        int n = A.length; 
        Vector<Integer> res = deleteElement(A, L, R, n); 
        for (Integer x : res) { 
            System.out.print(x + " "); 
        } 
    } 
} 
// This code is contributed by PrinciRaj1992 

