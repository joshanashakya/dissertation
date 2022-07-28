

// Java program to convert string X to  
// string Y which minimum number of changes.  
class GFG  
{ 
  
    static final int MAX = 26; 
  
    // Function that converts string X  
    // into lexicographically smallest  
    // anagram of string Y with minimal changes  
    static void printAnagramAndChanges(char[] X, 
                                        char[] Y) 
    { 
        int countx[] = new int[MAX], county[] = new int[MAX], 
            ctrx[] = new int[MAX], ctry[] = new int[MAX]; 
  
        int change = 0; 
        int l = X.length; 
  
        // Counting frequency of characters  
        // in each string.  
        for (int i = 0; i < l; i++) 
        { 
            countx[X[i] - 'A']++; 
            county[Y[i] - 'A']++; 
        } 
  
        // We maintain two more counter arrays  
        // ctrx[] and ctry[]  
        // Ctrx[] maintains the count of extra  
        // elements present in string X than  
        // string Y  
        // Ctry[] maintains the count of  
        // characters missing from string X  
        // which should be present in string Y.  
        for (int i = 0; i < MAX; i++)  
        { 
            if (countx[i] > county[i])  
            { 
                ctrx[i] += (countx[i] - county[i]); 
            } 
            else if (countx[i] < county[i]) 
            { 
                ctry[i] += (county[i] - countx[i]); 
            } 
            change += Math.abs(county[i] - countx[i]); 
        } 
  
        for (int i = 0; i < l; i++)  
        { 
  
            // This means that we cannot edit the  
            // current character as it's frequency  
            // in string X is equal to or less  
            // than the frequency in string Y.  
            // Thus, we go to the next position  
            if (ctrx[X[i] - 'A'] == 0) 
            { 
                continue; 
            } 
  
            // Here, we try to find that character,  
            // which has more frequency in string Y  
            // and less in string X. We try to find  
            // this character in lexicographical  
            // order so that we get  
            // lexicographically smaller string  
            int j; 
            for (j = 0; j < MAX; j++) 
            { 
                if ((ctry[j]) > 0) 
                { 
                    break; 
                } 
            } 
  
            // This portion deals with the  
            // lexicographical property.  
            // Now, we put a character in string X  
            // when either this character has smaller  
            // value than the character present there  
            // right now or if this is the last position  
            // for it to exchange, else we fix the  
            // character already present here in  
            // this position.  
            if (countx[X[i] - 'A'] == ctrx[X[i] - 'A'] 
                || X[i] - 'A' > j)  
            { 
  
                countx[X[i] - 'A']--; 
                ctrx[X[i] - 'A']--; 
                ctry[j]--; 
                X[i] = (char) ('A' + j); 
            }  
            else 
            { 
                countx[X[i] - 'A']--; 
            } 
        } 
        System.out.println("Anagram : " + String.valueOf(X)); 
        System.out.println("Number of changes made : " + change / 2); 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        String x = "CDBABC", y = "ADCABD"; 
        printAnagramAndChanges(x.toCharArray(), y.toCharArray()); 
    } 
}  
  
// This code is contributed by Rajput-Ji 

