import java.io.*;
import java.util.*;

public class round664A {
    public static void main(String s[]) throws Exception {
        Reader r = new Reader();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=r.nextInt();
        int k=r.nextInt(),m=r.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=r.nextInt();
        Arrays.sort(arr);
        int pp=0;
        while(pp<n && arr[pp]<=m)
            pp++;
        if(pp==n){
            long sum=0;
            for(int i=0;i<n;i++)
                sum+=arr[i];
            System.out.println(sum);
        }else if(pp==0){
            long sum=0;
            int sl=n/(k+1);
            if(n%(k+1)!=0)sl++;
            for(int i=0;i<sl;i++)sum+=arr[n-1-i];
            System.out.println(sum);
        }else{
            int sl=n/(k+1);
            if(n%(k+1)>0)sl++;
            sl=Math.min(n-pp,sl);
            int rem=n-((sl-1)*(k+1)+1),sc=pp,gc=n-pp,p=0;
            int p1=0,p2=pp-1,p3=pp,p4=n-1;
            long sum=0;
            //int[] res=new int[n];
            for(int i=0;p2>=0 && i<rem;i++)
                sum+=arr[p2--];
//            while(p<rem){
//                sum+=arr[p2--];
//                //res[p++]=arr[p2--];
//            }
            PriorityQueue<Integer> greater=new PriorityQueue<Integer>();
            PriorityQueue<Integer> smaller=new PriorityQueue<Integer>(Collections.reverseOrder());
            for(int i=0;i<sl;i++){
                sum+=arr[p4];
                greater.offer(arr[p4--]);
            }
            while(p1<=p2)
                smaller.offer(arr[p1++]);
            while(true){
                int t1=greater.poll();
                long st=0;
                for(int i=0;i<=k && smaller.size()>0;i++)
                    st+=smaller.poll();
                if(st>=t1){
                    sum=sum-t1+st;
                }else break;
            }
            System.out.println(sum);
        }
    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }
}

