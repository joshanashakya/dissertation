

// Java program to print the cumulative frequency  
// according to the order given  
class GFG 
{ 
  
// Function to print the cumulative frequency  
// according to the order given  
static void countFreq(int a[], int n) 
{ 
    // Insert elements and their  
    // frequencies in hash map. 
    int hm[] = new int[n]; 
    for (int i = 0; i < n; i++) 
        hm[a[i]]++; 
    int cumul = 0; 
      
// traverse in the array  
for(int i = 0; i < n; i++) 
{ 
    // add the frequencies  
    cumul += hm[a[i]];  
          
    // if the element has not been  
    // visited previously  
    if(hm[a[i]] != 0) 
    { 
        System.out.println(a[i] + "->" + cumul); 
    } 
    // mark the hash 0  
    // as the element's cumulative frequency  
    // has been printed  
    hm[a[i]] = 0; 
} 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int a[] = {1, 3, 2, 4, 2, 1}; 
    int n = a.length; 
    countFreq(a, n); 
} 
}  
  
// This code has been contributed by 29AjayKumar 

