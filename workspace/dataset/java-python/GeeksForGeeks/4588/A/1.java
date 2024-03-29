

// Java program to demonstrate divisibility of Fibonacci  
// numbers.  
  
class GFG 
{ 
static int MAX=90;  
  
// Driver code 
public static void main(String[] args)  
{  
    // indexes variable stores index of number that  
    // is divisible by 2, 3, 5 and 8  
    long[] arr=new long[MAX]; 
    long[] index1=new long[MAX]; 
    long[] index2=new long[MAX];  
    long[] index3=new long[MAX]; 
    long[] index4=new long[MAX];  
  
    // storing fibonacci numbers  
    arr[0] = 0;  
    arr[1] = 1;  
    for (int i = 2; i < MAX; i++)  
        arr[i] = arr[i - 1] + arr[i - 2];  
  
    // c1 keeps track of number of index of number  
    // divisible by 2 and others c2, c3 and c4 for  
    // 3, 5 and 8  
    int c1 = 0, c2 = 0, c3 = 0, c4 = 0;  
  
    // separating fibonacci number into their  
    // respective array  
    for (int i = 0; i < MAX; i++)  
    {  
        if (arr[i] % 2 == 0)  
            index1[c1++] = i;  
        if (arr[i] % 3 == 0)  
            index2[c2++] = i;  
        if (arr[i] % 5 == 0)  
            index3[c3++] = i;  
        if (arr[i] % 8 == 0)  
            index4[c4++] = i;  
    }  
  
    // printing index arrays  
    System.out.print("Index of Fibonacci numbers divisible by" + 
        " 2 are :\n");  
    for (int i = 0; i < c1; i++)  
        System.out.print(index1[i] + " ");  
    System.out.print("\n");  
  
    System.out.print("Index of Fibonacci number divisible by" + 
        " 3 are :\n");  
    for (int i = 0; i < c2; i++)  
        System.out.print(index2[i] + " ");  
    System.out.print("\n");  
  
    System.out.print("Index of Fibonacci number divisible by" +  
        " 5 are :\n");  
    for (int i = 0; i < c3; i++)  
        System.out.print(index3[i] + " ");  
    System.out.print("\n");  
  
    System.out.print("Index of Fibonacci number divisible by" + 
        " 8 are :\n");  
    for (int i = 0; i < c4; i++)  
        System.out.print(index4[i] + " ");  
    System.out.print("\n");  
}  
} 
  
// This code is contributed by mits 

