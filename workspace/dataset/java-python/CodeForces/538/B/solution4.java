import java.io.*;import java.util.*;public class Main{    public static void main(String[] args)throws IOException{        char[] chs=String.format("%d",nextInt()).toCharArray();        int len=chs.length;        boolean isZero=false;        List<Integer> res=new ArrayList<>();        while(!isZero){            int minBit=Integer.MAX_VALUE;            isZero=true;            for(int i=0;i<len;++i){                if(chs[i]=='0'){                    continue;                }                minBit=Math.min(minBit,chs[i]-'0');                isZero=false;            }            int suber=0;            for(int i=0;i<len;++i){                if(chs[i]!='0'){                    suber=suber*10+1;                    chs[i]-=minBit;                }else{suber*=10;}            }            if(minBit==Integer.MAX_VALUE){minBit=0;}            for(int i=0;i<minBit;++i){res.add(suber);};        }        out.println(res.size());        for(int v:res){out.print(v+" ");}        out.flush();    }    static StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));    static int nextInt() throws IOException{        in.nextToken();        return (int)in.nval;    }    static long nextLong() throws IOException{        in.nextToken();        return (long)in.nval;    }    static double nextDouble() throws IOException{        in.nextToken();        return in.nval;    }    static String nextStr() throws IOException{        in.nextToken();        return in.sval;    }}		  		 	     	 	  	  	    					