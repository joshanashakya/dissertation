   import java.io.IOException;import java.util.HashMap;import java.util.HashSet;import java.util.Scanner; public class Main { //    static class Reader {//        final private int BUFFER_SIZE = 1 << 16;//        private DataInputStream din;////        private byte[] buffer;//        private int bufferPointer, bytesRead;////        public Reader()//        {//            din = new DataInputStream(System.in);//            buffer = new byte[BUFFER_SIZE];//            bufferPointer = bytesRead = 0;//        }////        public Reader(String file_name) throws IOException//        {//            din = new DataInputStream(//                    new FileInputStream(file_name));//            buffer = new byte[BUFFER_SIZE];//            bufferPointer = bytesRead = 0;//        }////        public String readLine() throws IOException//        {//            byte[] buf = new byte[64]; // line length//            int cnt = 0, c;//            while ((c = read()) != -1) {//                if (c == '\n') {//                    if (cnt != 0) {//                        break;//                    }//                    else {//                        continue;//                    }//                }//                buf[cnt++] = (byte)c;//            }//            return new String(buf, 0, cnt);//        }////        public int nextInt() throws IOException//        {//            int ret = 0;//            byte c = read();//            while (c <= ' ') {//                c = read();//            }//            boolean neg = (c == '-');//            if (neg)//                c = read();//            do {//                ret = ret * 10 + c - '0';//            } while ((c = read()) >= '0' && c <= '9');////            if (neg)//                return -ret;//            return ret;//        }////        public long nextLong() throws IOException//        {//            long ret = 0;//            byte c = read();//            while (c <= ' ')//                c = read();//            boolean neg = (c == '-');//            if (neg)//                c = read();//            do {//                ret = ret * 10 + c - '0';//            } while ((c = read()) >= '0' && c <= '9');//            if (neg)//                return -ret;//            return ret;//        }////        public double nextDouble() throws IOException//        {//            double ret = 0, div = 1;//            byte c = read();//            while (c <= ' ')//                c = read();//            boolean neg = (c == '-');//            if (neg)//                c = read();////            do {//                ret = ret * 10 + c - '0';//            } while ((c = read()) >= '0' && c <= '9');////            if (c == '.') {//                while ((c = read()) >= '0' && c <= '9') {//                    ret += (c - '0') / (div *= 10);//                }//            }////            if (neg)//                return -ret;//            return ret;//        }////        private void fillBuffer() throws IOException//        {//            bytesRead = din.read(buffer, bufferPointer = 0,//                    BUFFER_SIZE);//            if (bytesRead == -1)//                buffer[0] = -1;//        }////        private byte read() throws IOException//        {//            if (bufferPointer == bytesRead)//                fillBuffer();//            return buffer[bufferPointer++];//        }////        public void close() throws IOException//        {//            if (din == null)//                return;//            din.close();//        }//    }////     //    static class TreeNode {//        int val;//        TreeNode left,right;//        TreeNode(int val){//            this.val=val;left=null;right=null;//        }//    }//    static TreeNode maxx(int start,int end,int[] arr){//        if(start>end){//            return null;//        }//        int ind=0;//        int max=-1;//        for(int j=start;j<=end;j++){//            if(arr[j]>max){//                max=arr[j];//                ind=j;//            }//        }//        TreeNode jj=new TreeNode(arr[ind]);//        jj.left=maxx(start,ind-1,arr);//        jj.right=maxx(ind+1,end,arr);//        return jj;////    }//    static void dfs(TreeNode root,int dep){//        if(root==null){//            return;//        }//        ans[hashMap.get(root.val)]=dep;//        dfs(root.left,dep+1);//        dfs(root.right,dep+1);//    }//    static int[] ans;//   static HashMap<Integer,Integer> hashMap;//   static class pont{//       int val,index;//       pont(int val,int index){//           this.val=val;//           this.index=index;//       }//   }//   static class compr implements Comparator<pont>{//       public int compare(pont a,pont b){//           return a.val-b.val;//       }//   }//    static class poin{//       int src;//       long val;//       poin(int src,long val){//           this.src=src;//           this.val=val;//       }//    }//    static double maxx(int flag,String s,String t,int k){        if(flag==0){            StringBuilder stringBuilder = new StringBuilder(s.substring(0,s.length()-1));           double ans= 0.0;           for(int j=1;j<10;j++){               StringBuilder str=new StringBuilder(stringBuilder);               str.append(j);                ans=(double)((double)ans+(double)maxx(1,str.toString(),t,k));           }           return ans;       }       else if(flag==1){            StringBuilder stringBuilder = new StringBuilder(t.substring(0,t.length()-1));           double ans= 0.0;           for(int j=1;j<10;j++){               StringBuilder str=new StringBuilder(stringBuilder);               str.append(j);               ans=(double)((double)ans+(double)maxx(2,s,str.toString(),k));           }           return ans;        }       else{           long[] count=new long[10];           long taka=0;           long[] tot=new long[10];            for(int j=0;j<s.length();j++){               int a=Integer.parseInt(String.valueOf(s.charAt(j)));               count[a]++;               tot[a]++;           }           for(int j=1;j<10;j++){               taka=(long)((long)taka+(long)((long)Math.pow(10,count[j])*(long)j));           }           long aoki=0;           count=new long[10];           for(int j=0;j<t.length();j++){               int a=Integer.parseInt(String.valueOf(t.charAt(j)));               count[a]++;               tot[a]++;           }           for(int j=1;j<10;j++){               aoki=(long)((long)aoki+(long)((long)Math.pow(10,count[j])*(long)j));           }           if(aoki>=taka){               return 0;           }else{               if(t.charAt(t.length()-1)==s.charAt(s.length()-1)){                   double kk=(double)k-(double)tot[Integer.parseInt(String.valueOf(t.charAt(t.length()-1)))]+(double)2;                   return (double)((double)((double)(kk)*(double)(kk-(double)1))/(double)((double)1*((double)9*(double)k-(double)8)*(double)((double)9*(double)k-(double)9)));                }else{                   double kk=(double)k-(double)tot[Integer.parseInt(String.valueOf(t.charAt(t.length()-1)))]+(double)1;                   double kk2=(double)k-(double)tot[Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))]+(double)1;                   return (double)(((double)((double)1*(double)kk)*(double)(kk2))/(double)((double)1*((double)9*(double)k-(double)8)*(double) ((double)9*(double)k-(double)9)));               }           }        }      }////   static void sieveOfEratosthenes(int n)//    {//        boolean prime[] = new boolean[n + 1];//        for (int i = 0; i <= n; i++)//            prime[i] = true;////        for (int p = 2; p * p <= n; p++)//        {//            if (prime[p] == true)//            {//                for (int i = p * p; i <= n; i += p)//                    prime[i] = false;//            }//        }////        for (int i = 2; i <= n; i++)//        {//            if (prime[i] == true)//                treeMap.put(i,0);//        }//    }//    static TreeMap<Integer,Integer> treeMap;    public static void main(String[] args) throws IOException {         Scanner s=new Scanner(System.in);        int n=s.nextInt();        int k=s.nextInt();        int[] arr=new int[n];        for(int j=0;j<arr.length;j++){            arr[j]=s.nextInt();        }        HashSet<Integer> has=new HashSet<>();        HashMap<Integer,Integer> hashMap=new HashMap<>();        int start=0;        int end=0;        int flag=0;        int jj=0;        sss:        for(int j=0;j<arr.length;j++){            hashMap.put(arr[j],hashMap.getOrDefault(arr[j],0)+1);            has.add(arr[j]);            if(has.size()==k){                for(int i=start;i<=j;i++){                    hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)-1);                    if(hashMap.get(arr[i])==0){                        has.remove(arr[i]);                        jj=1;                        end=j;break sss;                    }else{                        start=i+1;                    }                }                jj=1;                start=0;end=j;break;            }        }        if(jj==1) {            start++;end++;            System.out.println(start+" "+end);        }else{            System.out.println(-1+" "+-1);        }    } }       
