

// Java program to print all pairs 
// with equal sum 
import java.util.*; 
  
class GFG 
{ 
    static class pair 
    {  
        int first, second;  
        public pair(int first, int second)   
        {  
            this.first = first;  
            this.second = second;  
        }     
}  
  
// Function to print all pairs 
// with equal sum 
static void pairWithEqualSum(int A[], int n) 
{ 
   
    Map<Integer, Vector<pair> > mp = new HashMap<>(); 
   
    // Insert all unique pairs and their 
    // corresponding sum in the map 
    for (int i = 0; i < n - 1; i++) { 
        for (int j = i + 1; j < n; j++) { 
            pair p = new pair(A[i], A[j]); 
            Vector<pair> pp = new Vector<pair>(); 
            if(mp.containsKey(A[i] + A[j])) 
                pp.addAll(mp.get(A[i] + A[j])); 
            pp.add(p); 
            mp.put(A[i] + A[j],pp); 
        } 
    } 
   
    // Traverse the map mp, and for sum 
    // with more than one pair, print all pairs 
    // and the corresponding sum 
    for (Map.Entry<Integer,Vector<pair>> itr : mp.entrySet()){ 
        if (itr.getValue().size() > 1) { 
            System.out.print("Pairs : "); 
   
            for (int i = 0; i < itr.getValue().size(); i++) { 
                System.out.print("( " +  itr.getValue().get(i).first+ ", "
                     + itr.getValue().get(i).second+ ") "); 
            } 
   
            System.out.print(" have sum : " +  itr.getKey() +"\n"); 
        } 
    } 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int A[] = { 6, 4, 12, 10, 22, 54, 32, 42, 21, 11, 8, 2 }; 
   
    int n = A.length; 
   
    pairWithEqualSum(A, n);  
} 
} 
  
// This code is contributed by Rajput-Ji 

