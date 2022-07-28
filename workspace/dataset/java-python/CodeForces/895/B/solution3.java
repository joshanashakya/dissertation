import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.io.FilterInputStream;import java.io.BufferedInputStream;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Jenish */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        ScanReader in = new ScanReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BXKSegments solver = new BXKSegments();        solver.solve(1, in, out);        out.close();    }     static class BXKSegments {        public void solve(int testNumber, ScanReader in, PrintWriter out) {            int n = in.scanInt();            int x = in.scanInt();            int k = in.scanInt();             int arr[] = new int[n];            in.scanInt(arr);            CodeX.sort(arr);            long ans = 0;              for (int i = 0; i < n; i++) {                  int fistIndex = -1;                int lastIndex = -1;                {                    int low = finditX(arr, arr[i]);                    int high = n - 1;                    int index = -1;                     while (low <= high) {                        int mid = (low + high) >> 1;                        int res = findit(arr[i], arr[mid], x);                        if (res == k) {                            index = mid;                            high = mid - 1;                        } else if (res < k) {                            low = mid + 1;                        } else {                            high = mid - 1;                        }                    }                    fistIndex = index;                }                  {                    int low = finditX(arr, arr[i]);                    int high = n - 1;                    int index = -1;                     while (low <= high) {                        int mid = (low + high) >> 1;                        int res = findit(arr[i], arr[mid], x);                        if (res == k) {                            index = mid;                            low = mid + 1;                        } else if (res < k) {                            low = mid + 1;                        } else {                            high = mid - 1;                        }                    }                    lastIndex = index;                }                  if (fistIndex != -1) {                    ans += lastIndex - fistIndex + 1;                }             }              out.println(ans);          }         private int finditX(int[] arr, int x) {            int index = arr.length;             int low = 0;            int high = arr.length - 1;            while (low <= high) {                int mid = (low + high) >> 1;                if (arr[mid] >= x) {                    index = mid;                    high = mid - 1;                } else {                    low = mid + 1;                }            }            return index;        }         int findit(int l, int r, int x) {            return (r / x) - ((l - 1) / x);        }     }     static class CodeX {        public static void sort(int arr[]) {            merge_sort(arr, 0, arr.length - 1);        }         private static void merge_sort(int A[], int start, int end) {            if (start < end) {                int mid = (start + end) / 2;                merge_sort(A, start, mid);                merge_sort(A, mid + 1, end);                merge(A, start, mid, end);            }         }         private static void merge(int A[], int start, int mid, int end) {            int p = start, q = mid + 1;            int Arr[] = new int[end - start + 1];            int k = 0;             for (int i = start; i <= end; i++) {                if (p > mid)                    Arr[k++] = A[q++];                 else if (q > end)                    Arr[k++] = A[p++];                 else if (A[p] < A[q])                    Arr[k++] = A[p++];                 else                    Arr[k++] = A[q++];            }            for (int i = 0; i < k; i++) {                A[start++] = Arr[i];            }         }     }     static class ScanReader {        private byte[] buf = new byte[4 * 1024];        private int INDEX;        private BufferedInputStream in;        private int TOTAL;         public ScanReader(InputStream inputStream) {            in = new BufferedInputStream(inputStream);        }         private int scan() {            if (INDEX >= TOTAL) {                INDEX = 0;                try {                    TOTAL = in.read(buf);                } catch (Exception e) {                    e.printStackTrace();                }                if (TOTAL <= 0) return -1;            }            return buf[INDEX++];        }         public int scanInt() {            int I = 0;            int n = scan();            while (isWhiteSpace(n)) n = scan();            int neg = 1;            if (n == '-') {                neg = -1;                n = scan();            }            while (!isWhiteSpace(n)) {                if (n >= '0' && n <= '9') {                    I *= 10;                    I += n - '0';                    n = scan();                }            }            return neg * I;        }         private boolean isWhiteSpace(int n) {            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;            else return false;        }         public void scanInt(int[] A) {            for (int i = 0; i < A.length; i++) A[i] = scanInt();        }     }} 