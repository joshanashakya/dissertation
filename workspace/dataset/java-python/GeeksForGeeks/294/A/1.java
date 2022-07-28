

// Java program of above approach 
  
class GfG { 
  
/* A utility function that prints a given arr[] of length size*/
static void printArray(int arr[], int size)  
{  
    for(int i = 0; i < size; i++)  
        System.out.print(arr[i] + " ");  
System.out.println(); 
    return;  
}  
  
/* The core function that recursively generates and prints all sequences of  
length k */
static void printSequencesRecur(int arr[], int n, int k, int index)  
{  
int i;  
if (k == 0)  
{  
    printArray(arr, index);  
}  
if (k > 0)  
{  
    for(i = 1; i<=n; ++i)  
    {  
        arr[index] = i;  
        printSequencesRecur(arr, n, k-1, index+1);  
    }  
}  
}  
  
  
/* A function that uses printSequencesRecur() to prints all sequences  
from 1, 1, ..1 to n, n, ..n */
static void printSequences(int n, int k)  
{  
    int arr[] = new int[k];  
    printSequencesRecur(arr, n, k, 0);  
  
return ; 
}  
  
/* Driver Program to test above functions */
public static void main(String[] args)  
{  
    int n = 3;  
    int k = 2;  
    printSequences(n, k);  
}  
}  

