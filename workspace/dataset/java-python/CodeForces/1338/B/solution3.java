import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.UncheckedIOException;import java.io.Closeable;import java.io.Writer;import java.io.OutputStreamWriter;import java.lang.reflect.Array;import java.util.Arrays;  public class water {    static int ji=0;    static boolean ok=false;    public static int df(int poi,int last,int a[][],int odd){        int x=0,zim=0;        int z=0,time=0;        boolean only=false;        for(int i=1;i<a[poi].length;i++){            int y=a[poi][i];            if(y!=last){                time++;                zim++;                if(ji!=0) ji=ji%2+1;                if(poi==1&&a[poi].length==2){                    z=df(y,poi,a,1);                }                else                    z=df(y,poi,a,0);                zim+=z;                if(z==0&&ji==0){                    ji=1;                }                 if(odd==1&&z==0){                    zim--;                }                else if(odd==0&&z==0){                    odd=1;                }            }        }        if(time==0){            if(ji==1) {                ok=true;            }        }        if(ji!=0) ji=ji%2+1;        return zim;    }    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastInput input = new FastInput(inputStream);        FastOutput out = new FastOutput(outputStream);        int n= input.scanInt();        int a[][]=new int [n-1][2];        int len[]=new int [n+1];        for(int i=0;i<n-1;i++){            a[i][0]= input.scanInt();            a[i][1]= input.scanInt();            len[a[i][0]]++;            len[a[i][1]]++;        }        int b[][]=new int [n+1][];        for(int i=1;i<n+1;i++){            b[i]=new int [len[i]+1];        }        for(int i=0;i<n-1;i++){            b[a[i][0]][len[a[i][0]]--]=a[i][1];            b[a[i][1]][len[a[i][1]]--]=a[i][0];        }        int x;        if(b[1].length==2) ji=2;        x=df(1,0,b,0);        if(ok)            System.out.println("3 "+x);        else            System.out.println("1 "+x);    }     static class FastInput {        private final InputStream is;        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);        private byte[] buf = new byte[1 << 13];        private int bufLen;        private int bufOffset;        private int next;        public FastInput(InputStream is) {            this.is = is;        }        private int read() {            while (bufLen == bufOffset) {                bufOffset = 0;                try {                    bufLen = is.read(buf);                } catch (IOException e) {                    bufLen = -1;                }                if (bufLen == -1) {                    return -1;                }            }            return buf[bufOffset++];        }        public void skipBlank() {            while (next >= 0 && next <= 32) {                next = read();            }        }        public String next() {            return readString();        }        public int scanInt() {            int sign = 1;            skipBlank();            if (next == '+' || next == '-') {                sign = next == '+' ? 1 : -1;                next = read();            }            int val = 0;            while (next >= '0' && next <= '9') {                val = val * 10 + next - '0';                next = read();            }            return (sign*val);        }         public String readString(StringBuilder builder) {            skipBlank();            while (next > 32) {                builder.append((char) next);                next = read();            }            return builder.toString();        }         public String readString() {            defaultStringBuf.setLength(0);            return readString(defaultStringBuf);        }     }    static class FastOutput implements AutoCloseable, Closeable, Appendable {        private StringBuilder cache = new StringBuilder(1 << 20);        private final Writer os;         public FastOutput append(CharSequence csq) {            cache.append(csq);            return this;        }         public FastOutput append(CharSequence csq, int start, int end) {            cache.append(csq, start, end);            return this;        }         public FastOutput(Writer os) {            this.os = os;        }         public FastOutput(OutputStream os) {            this(new OutputStreamWriter(os));        }         public FastOutput append(char c) {            cache.append(c);            return this;        }         public FastOutput append(String c) {            cache.append(c);            return this;        }        public FastOutput append(int c) {            cache.append(c);            return this;        }        public FastOutput println(int c) {            return append(c).println();        }        public FastOutput println(String c) {            return append(c).println();        }         public FastOutput println() {            //cache.append(System.lineSeparator());//            flush();            return this;        }         public FastOutput flush() {            try {                os.append(cache);                os.flush();                cache.setLength(0);            } catch (IOException e) {                throw new UncheckedIOException(e);            }            return this;        }         public void close() {            flush();            try {                os.close();            } catch (IOException e) {                throw new UncheckedIOException(e);            }        }         public String toString() {            return cache.toString();        }     }  }  