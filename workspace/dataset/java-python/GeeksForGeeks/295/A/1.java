

// Java program of above approach 
  
/* The core function that generates and prints all sequences of length k */
static void printSeqRecur(int num, int pos, int k, int n)  
{  
    if (pos == k) {  
        System.out.print(num + " ");  
        return;  
    }  
    for (int i = 1; i <= n; i++) {  
        printSeqRecur(num * 10 + i, pos + 1, k, n);  
    }  
}  
  
/* A function that uses printSequencesRecur() to prints all sequences  
from 1, 1, ..1 to n, n, ..n */
static void printSequences(int k, int n)  
{  
    printSeqRecur(0, 0, k, n);  
}  

