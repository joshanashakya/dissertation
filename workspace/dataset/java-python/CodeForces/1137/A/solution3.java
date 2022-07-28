import java.awt.*;import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.UncheckedIOException;import java.io.Closeable;import java.io.Writer;import java.io.OutputStreamWriter;import java.lang.reflect.Array;import java.util.Arrays; public class water {     public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastInput input = new FastInput(inputStream);        FastOutput out = new FastOutput(outputStream);        int n = input.scanInt();        int m = input.scanInt();        int a[][] = new int[n][m];        int a1[][] = new int[n][m];        int a3[][] = new int[n][];        int b[][]=new int [n][m];        int c[][][]=new int [n][m][2];        int d[][]=new int [m][n];        int d2[][]=new int [m][n];        int d3[][] = new int[m][];        int d1[][]=new int [m][n];        for (int i = 0; i < n; i++) {            for (int j = 0; j < m; j++) {                a[i][j] = input.scanInt();                b[i][j]=a[i][j];            }        }        int siz1[]=new int[n];        int siz2[]=new int[m];        for(int i=0;i<n;i++){            Arrays.sort(a[i]);            int siz=1;            a1[i][0]=a[i][0];            for(int j=1;j<m;j++){                if(a[i][j]!=a1[i][siz-1]) {                    a1[i][siz++]=a[i][j];                }            }            siz1[i]=siz;            a3[i]=new int[siz];            for(int j=0;j<siz;j++){                a3[i][j]=a1[i][j];            }        }        for(int i=0;i<n;i++){            System.out.println();            for(int j=0;j<m;j++) {            }        }        for(int i=0;i<n;i++){            for(int j=0;j<m;j++){                c[i][j][0]=Arrays.binarySearch(a3[i],b[i][j])+1;            }         }        for(int i=0;i<n;i++){            for(int j=0;j<m;j++){                d[j][i]=b[i][j];                d1[j][i]=b[i][j];            }        }        for(int i=0;i<m;i++){            Arrays.sort(d[i]);            int siz=1;            d2[i][0]=d[i][0];            for(int j=1;j<n;j++){                if(d[i][j]!=d2[i][siz-1]) {                    d2[i][siz++]=d[i][j];                }            }            siz2[i]=siz;            d3[i]=new int[siz];            for(int j=0;j<siz;j++){                d3[i][j]=d2[i][j];            }        }        for(int i=0;i<n;i++){            for(int j=0;j<m;j++){                c[i][j][1]=Arrays.binarySearch(d3[j],d1[j][i])+1;             }        }         for(int i=0;i<n;i++){            for(int j=0;j<m;j++){                if(c[i][j][0]>c[i][j][1]){                    if((c[i][j][0]+siz2[j]-c[i][j][1])>siz1[i]){                        out.println((c[i][j][0]+siz2[j]-c[i][j][1])+" ");                    }                     else                        out.println(siz1[i]+" ");                }                else if(c[i][j][0]<c[i][j][1]){                    if((c[i][j][1]+siz1[i]-c[i][j][0])>siz2[j])                        out.println((c[i][j][1]+siz1[i]-c[i][j][0])+" ");                    else                        out.println(siz2[j]+" ");                }                else{                    if(siz1[i]>siz2[j])                        out.println(siz1[i]+" ");                    else                        out.println(siz2[j]+" ");                }            }        }        out.close();    }     static class FastInput {        private final InputStream is;        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);        private byte[] buf = new byte[1 << 13];        private int bufLen;        private int bufOffset;        private int next;        public FastInput(InputStream is) {            this.is = is;        }        private int read() {            while (bufLen == bufOffset) {                bufOffset = 0;                try {                    bufLen = is.read(buf);                } catch (IOException e) {                    bufLen = -1;                }                if (bufLen == -1) {                    return -1;                }            }            return buf[bufOffset++];        }        public void skipBlank() {            while (next >= 0 && next <= 32) {                next = read();            }        }        public String next() {            return readString();        }        public int scanInt() {            int sign = 1;            skipBlank();            if (next == '+' || next == '-') {                sign = next == '+' ? 1 : -1;                next = read();            }            int val = 0;            while (next >= '0' && next <= '9') {                val = val * 10 + next - '0';                next = read();            }            return (sign*val);        }         public String readString(StringBuilder builder) {            skipBlank();            while (next > 32) {                builder.append((char) next);                next = read();            }            return builder.toString();        }         public String readString() {            defaultStringBuf.setLength(0);            return readString(defaultStringBuf);        }     }    static class FastOutput implements AutoCloseable, Closeable, Appendable {        private StringBuilder cache = new StringBuilder(1 << 20);        private final Writer os;         public FastOutput append(CharSequence csq) {            cache.append(csq);            return this;        }         public FastOutput append(CharSequence csq, int start, int end) {            cache.append(csq, start, end);            return this;        }         public FastOutput(Writer os) {            this.os = os;        }         public FastOutput(OutputStream os) {            this(new OutputStreamWriter(os));        }         public FastOutput append(char c) {            cache.append(c);            return this;        }         public FastOutput append(String c) {            cache.append(c);            return this;        }        public FastOutput append(int c) {            cache.append(c);            return this;        }        public FastOutput println(int c) {            return append(c).println();        }        public FastOutput println(String c) {            return append(c).println();        }         public FastOutput println() {            //cache.append(System.lineSeparator());            return this;        }         public FastOutput flush() {            try {                os.append(cache);                os.flush();                cache.setLength(0);            } catch (IOException e) {                throw new UncheckedIOException(e);            }            return this;        }         public void close() {            flush();            try {                os.close();            } catch (IOException e) {                throw new UncheckedIOException(e);            }        }         public String toString() {            return cache.toString();        }     }  }  