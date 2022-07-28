

// Java program to find union and intersection  
// using similar Hashing Technique  
// without using any predefined Java Collections 
// Time Complexity best case & avg case = O(m+n) 
// Worst case = O(nlogn) 
  
//package com.arrays.math; 
  
public class UnsortedIntersectionUnion { 
  
        // Prints intersection of arr1[0..n1-1] and 
        // arr2[0..n2-1] 
    public void findPosition(int a[], int b[]) { 
        int v = (a.length + b.length); 
        int ans[] = new int[v]; 
  
        int zero1 = 0; 
        int zero2 = 0; 
  
        System.out.print("Intersection : "); 
        // Iterate first array 
        for (int i = 0; i < a.length; i++) 
            zero1 = iterateArray(a, v, ans, i); 
  
        // Iterate second array 
        for (int j = 0; j < b.length; j++) 
            zero2 = iterateArray(b, v, ans, j); 
  
        int zero = zero1 + zero2; 
        placeZeros(v, ans, zero); 
        printUnion(v, ans, zero); 
  
    } 
      
    // Prints union of arr1[0..n1-1] and arr2[0..n2-1] 
    private void printUnion(int v, int[] ans, int zero) { 
        int zero1 = 0; 
        System.out.print("\nUnion : "); 
        for (int i = 0; i < v; i++) { 
            if ((zero == 0 && ans[i] == 0) || (ans[i] == 0 && zero1 > 0)) 
                continue; 
            if (ans[i] == 0) 
                zero1++; 
            System.out.print(ans[i] + ","); 
        } 
    } 
  
    private void placeZeros(int v, int[] ans, int zero) { 
        if (zero == 2) { 
            System.out.println("0"); 
            int d[] = { 0 }; 
            placeValue(d, ans, 0, 0, v); 
        } 
        if (zero == 1) { 
            int d[] = { 0 }; 
            placeValue(d, ans, 0, 0, v); 
        } 
    } 
  
    // Function to itreate array 
    private int iterateArray(int[] a, int v, int[] ans, int i) { 
        if (a[i] != 0) { 
            int p = a[i] % v; 
            placeValue(a, ans, i, p, v); 
        } else
            return 1; 
        return 0; 
    } 
  
    private void placeValue(int[] a, int[] ans, int i, int p, int v) { 
        p = p % v; 
        if (ans[p] == 0) 
            ans[p] = a[i]; 
        else { 
            if (ans[p] == a[i]) 
                System.out.print(a[i] + ","); 
            else { 
                  
                //Hashing collision happened increment position and do recursive call 
                p = p + 1; 
                placeValue(a, ans, i, p, v); 
            } 
        } 
    } 
  
    public static void main(String args[]) { 
        int a[] = { 7, 1, 5, 2, 3, 6 }; 
        int b[] = { 3, 8, 6, 20, 7 }; 
  
        UnsortedIntersectionUnion uiu = new UnsortedIntersectionUnion(); 
        uiu.findPosition(a, b); 
    } 
} 
// This code is contributed by Mohanakrishnan S. 

