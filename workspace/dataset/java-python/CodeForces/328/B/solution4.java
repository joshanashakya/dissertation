import java.io.*;import java.util.Arrays;import java.util.StringTokenizer; public class Sheldon  {    public static void main(String[] args) {         FastReader in = new FastReader();        OutputStream outputStream = System.out;        PrintWriter out = new PrintWriter(outputStream);        int i,j,a,b,c,n,k,l,m,l1;        String s,s1,s2;        boolean is1 = false ,is = false,was = false;        long sum = 0;        int[] brr = new int[10];        int[] arr = new int[10];        int[] crr = new int[10];        //mergeSort(arr, 0, 7);        //Arrays.binarySearch(arr,7);         s = in.next();        s1 = in.next();         l = s.length();        l1 = s1.length();         for (i=0; i<l; i++){                arr[s.charAt(i) - 48]++;        }         for (i=0; i<l1; i++){            brr[s1.charAt(i) - 48]++;        }          arr[2] += arr[5];        brr[2] += brr[5];        arr[6] += arr[9];        brr[6] += brr[9];         arr[5] = 0;        arr[9] = 0; //        for (i=0; i<=9; i++){//           out.print(arr[i]+ " ");//        }      //  out.println();         j = 0;        for (i=0; i<=9; i++){            if (arr[i] != 0){                crr[j++] = brr[i] / arr[i];            }        }//        for (i=0; i<j; i++){//            out.print(crr[i]+ " ");//        }//        out.println();        mergeSort(crr,0,j-1);//        for (i=0; i<j; i++){//            out.print(crr[i]+ " ");//        }         out.println(crr[0]);          out.flush();      }      static int GCD(int a, int b) {        return a == 0 ? b : GCD(b % a, a);    }      static void  mergeSort(int arr[], int l, int r)    {        if (l < r)        {            // Same as (l+r)/2, but avoids overflow for            // large l and h            int m = l+(r-l)/2;             // Sort first and second halves            mergeSort(arr, l, m);            mergeSort(arr, m+1, r);             merge(arr, l, m, r);        }    }      static void merge(int arr[], int l, int m, int r)    {        int i, j, k;        int n1 = m - l + 1;        int n2 =  r - m;         /* create temp arrays */        int L[] = new int[n1],  R[] = new int[n2];         /* Copy data to temp arrays L[] and R[] */        for (i = 0; i < n1; i++)            L[i] = arr[l + i];        for (j = 0; j < n2; j++)            R[j] = arr[m + 1+ j];         /* Merge the temp arrays back into arr[l..r]*/        i = 0; // Initial index of first subarray        j = 0; // Initial index of second subarray        k = l; // Initial index of merged subarray        while (i < n1 && j < n2)        {            if (L[i] <= R[j])            {                arr[k] = L[i];                i++;            }            else            {                arr[k] = R[j];                j++;            }            k++;        }     /* Copy the remaining elements of L[], if there       are any */        while (i < n1)        {            arr[k] = L[i];            i++;            k++;        }     /* Copy the remaining elements of R[], if there       are any */        while (j < n2)        {            arr[k] = R[j];            j++;            k++;        }    }          static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    } }