 import java.util.*; import java.io.*; public class CCTrial { 	public static void main(String[] args) throws IOException {		// TODO Auto-generated method stub		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		String s[]=br.readLine().split(" ");		HashMap<String,Integer> hm=new HashMap<>();		int count;		int maxcount=1;		HashSet<String> hs=new HashSet<>();		for(int i=0;i<s.length;i++) {			hs.add(s[i]);			if(hm.containsKey(s[i])) {				count=hm.get(s[i]);				count++;				hm.put(s[i],count);				maxcount=Math.max(count, maxcount);				if(maxcount==3) break;			}			else hm.put(s[i],1);		}		//System.out.println(maxcount);				int maxcount1=1;								for(int i=0;i<s.length;i++) {			int count1=1;			String in=""+s[i].charAt(1);			in=((int)(s[i].charAt(0)-'0')+1)+in;			String in1=((int)(s[i].charAt(0)-'0')+2)+""+s[i].charAt(1);			if(hs.contains(in)) {				count1++;				//System.out.println(count1+" "+s[i]+" "+in1);				if(hs.contains(in1)) {					//System.out.println("kdbfj");					maxcount1=3;					break;				}			}			else if(hs.contains(in1)) {				count1++;			}			maxcount1=Math.max(count1, maxcount1);					}		System.out.println(3-Math.max(maxcount,maxcount1 ));			}}
