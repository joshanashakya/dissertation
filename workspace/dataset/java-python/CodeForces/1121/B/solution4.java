import java.util.*;import java.lang.*;import java.io.*;import java.math.*;  public class file{  // *********************************************BEGINS*********************************************public static void main(String[] args) throws IOException{  // Working program using BufferedReader         //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        // StringTokenizer st = new StringTokenizer(br.readLine());        // int n = Integer.parseInt(st.nextToken());        // int k = Integer.parseInt(st.nextToken());  Reader scn=new Reader();PrintWriter pt=new PrintWriter(System.out); int n=scn.nextInt();int[] arr=new int[n];for(int i=0;i<n;i++){    arr[i]=scn.nextInt();}int max=Integer.MIN_VALUE;HashMap<Long,Integer> hm=new HashMap<>();for(int i=0;i<n-1;i++){    for(int j=i+1;j<n;j++){        long sum=arr[i]+arr[j];        hm.put(sum,hm.getOrDefault(sum,0)+1);        max=Math.max(max,hm.get(sum));    }} pt.println(max);pt.close(); }// *********************************************ENDED*********************************************static boolean isPrime(long n) {     // Converting long to BigInteger     BigInteger b = new BigInteger(String.valueOf(n));      return b.isProbablePrime(1); }  static void merge(int arr[], int l, int m, int r)    {        // Find sizes of two subarrays to be merged        int n1 = m - l + 1;        int n2 = r - m;         /* Create temp arrays */        int L[] = new int [n1];        int R[] = new int [n2];         /*Copy data to temp arrays*/        for (int i = 0; i < n1; ++i)            L[i] = arr[l + i];        for (int j = 0; j < n2; ++j)            R[j] = arr[m + 1 + j];          /* Merge the temp arrays */         // Initial indexes of first and second subarrays        int i = 0, j = 0;         // Initial index of merged subarry array        int k = l;        while (i < n1 && j < n2)        {            if (L[i] <= R[j])            {                arr[k] = L[i];                i++;            }            else            {                arr[k] = R[j];                j++;            }            k++;        }         /* Copy remaining elements of L[] if any */        while (i < n1)        {            arr[k] = L[i];            i++;            k++;        }         /* Copy remaining elements of R[] if any */        while (j < n2)        {            arr[k] = R[j];            j++;            k++;        }    }     // Main function that sorts arr[l..r] using    // merge()    static void sort(int arr[], int l, int r)    {        if (l < r)        {            // Find the middle point            int m = (l + r) / 2;             // Sort first and second halves            sort(arr, l, m);            sort(arr , m + 1, r);             // Merge the sorted halves            merge(arr, l, m, r);        }    } static class Reader     {         final private int BUFFER_SIZE = 1 << 16;         private DataInputStream din;         private byte[] buffer;         private int bufferPointer, bytesRead;    public Reader()         {             din = new DataInputStream(System.in);             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }  public Reader(String file_name) throws IOException         {             din = new DataInputStream(new FileInputStream(file_name));             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }   public String readLine() throws IOException         {             byte[] buf = new byte[64]; // line length             int cnt = 0, c;             while ((c = read()) != -1)             {                 if (c == '\n')                     break;                 buf[cnt++] = (byte) c;             }             return new String(buf, 0, cnt);         }    public int nextInt() throws IOException         {             int ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do            {                 ret = ret * 10 + c - '0';             }  while ((c = read()) >= '0' && c <= '9');               if (neg)                 return -ret;             return ret;         }    public long nextLong() throws IOException         {             long ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');             if (neg)                 return -ret;             return ret;         }   public double nextDouble() throws IOException         {             double ret = 0, div = 1;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();               do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');               if (c == '.')             {                 while ((c = read()) >= '0' && c <= '9')                 {                     ret += (c - '0') / (div *= 10);                 }             }               if (neg)                 return -ret;             return ret;         }  private void fillBuffer() throws IOException         {             bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);             if (bytesRead == -1)                 buffer[0] = -1;         }  private byte read() throws IOException         {             if (bufferPointer == bytesRead)                 fillBuffer();             return buffer[bufferPointer++];         }   public void close() throws IOException         {             if (din == null)                 return;             din.close();         }     }  }