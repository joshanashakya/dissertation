

// Java program to demonstrate that sequence of last  
// digits of Fibonacci numbers repeats after 60.  
  
class GFG{ 
static int max=100;  
public static void main(String[] args)  
{  
    long[] arr=new long[max];  
    arr[0] = 0;  
    arr[1] = 1; 
    int i=0; 
  
    // storing Fibonacci numbers  
    for (i = 2; i < max; i++)  
        arr[i] = arr[i-1] + arr[i-2];  
  
    // Traversing through store numbers  
    for (i = 1; i < max - 1; i++)  
    {  
        // Since first two number are 0 and 1  
        // so, if any two consecutive number encounter 0 and 1  
        // at their unit place, then it clearly means that  
        // number is repeating/ since we just have to find  
        // the sum of previous two number  
        if ((arr[i] % 10 == 0) && (arr[i+1] % 10 == 1))  
            break;  
    }  
    System.out.println("Sequence is repeating after index "+i);  
}  
} 
// This code is conributed by mits 

