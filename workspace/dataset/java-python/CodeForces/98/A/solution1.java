import java.io.*;
import java.util.*;

public class practice {
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	static class Print
	{
	    private final BufferedWriter bw;
	    public Print()
	    {
	        bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    }
	    public void print(String str)throws IOException
	    {
	        bw.append(str);
	    }
	    public void println(String str)throws IOException
	    {
	        print(str);
	        bw.append("\n");
	    }
	    public void close()throws IOException
	    {
	        bw.close();
	    }}
		public static void main(String[] args) throws IOException {			
			FastReader scn=new FastReader();
			Print p=new Print();
			String s=scn.next();
			int[]count=new int[26];
			int[]num=new int[6];
			int cnt=0,t=0,sol=0;
			for(int i=0;i<6;i++){
				count[s.charAt(i)-'A']++;
			}
			for(int i=0;i<26;i++){
				if(count[i]>0){
					num[t++]=count[i];cnt++;
				}
			}
			switch(cnt){
			case 1: sol=1;break;
			case 2: if(num[0]==1||num[1]==1)sol=1;
					else sol=2;
					break;
			case 3: if(num[0]==3||num[1]==3||num[2]==3) sol=3;
					else if(num[0]==2||num[1]==2||num[2]==2) sol=6;
					else sol=2;
					break;
			case 4: if(num[0]==3||num[1]==3||num[2]==3||num[3]==3) sol=5;
			        else sol=8;
					break;
			case 5: sol=15;break;
			case 6: sol=30;break;
			}
			p.println(Integer.toString(sol));
			p.close();
			
		}
}
